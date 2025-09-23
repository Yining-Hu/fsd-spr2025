package lecture9;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.In;

/**
 *
 * @author George
 */
public class Game {

    List<Player> players;
    private String fileName = "game.data";
    private File file;

    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.setup();
            game.menu();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public Game() {
        this.players = new ArrayList<>();
    }

    private void setup() throws URISyntaxException, IOException {
        File bin = new File(Game.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        File folder = new File(Game.class.getPackage().getName());
        String dir = bin.getAbsolutePath();
        String filePath = dir + File.separator + folder;
        this.file = new File(filePath + File.separator + fileName);
        if (!this.file.exists()) {
            System.out.println(
                    file.createNewFile() ? "File " + fileName + " created successfully" : "Error while creating file");
        }
    }

    private void play() {
        this.players.clear();
        this.players.addAll(PlayerDAO.read(this.file));
        int index = this.players.size();
        List<Player> currentGame = new ArrayList<>();
        for (int i = index; i < index + 10; i++) {
            Player newPlayer = new Player(i);
            this.players.add(newPlayer);
            currentGame.add(newPlayer);
        }
        System.out.printf("%nNew Game[%02d]: %n", index / 10 + 1);
        currentGame.forEach(System.out::println);
    }

    private void save() {
        System.out.println("\nSaving players record to file.\n");
        PlayerDAO.save(this.players, this.file);
    }

    private void show() {
        System.out.println("\nReading players record from file.");
        List<Player> temp = PlayerDAO.read(this.file);
        temp.forEach(System.out::println);
    }

    private void clear() {
        System.out.println("\nClearing players file.\n");
        PlayerDAO.clear(this.players, this.file);
    }

    private char readChoice() {
        System.out.print("Choice(p/s/v/c/x): ");
        return In.nextChar();
    }

    private void menu() {
        char c;
        while ((c = readChoice()) != 'x') {
            switch (c) {
                case 'p':
                    play();
                    break;
                case 's':
                    save();
                    break;
                case 'v':
                    show();
                    break;
                case 'c':
                    clear();
                    break;
                default:
                    help();
                    break;
            }
        }
    }

    private void help() {
        System.out.println("p - play");
        System.out.println("s - save");
        System.out.println("v - show");
        System.out.println("c - clear");
        System.out.println("x - exit");
    }

}