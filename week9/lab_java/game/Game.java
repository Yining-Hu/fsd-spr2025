import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game {

    List<Player> players = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    private String filename = "game.data";

    public static void main(String[] args) {
        Game game = new Game();

        try {
            game.setup();
            game.menu();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public Game() {
    }

    private void setup() throws IOException {
        try{
            File file = new File(filename);
            if (!file.exists()){
                System.out.println(file.createNewFile() ? "File "+filename+" Initialized": "Cannot initialize file: "+filename);
            }    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, "File Not Found", ex);
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, "Reading Error", ex);
        } 
    }

    private void play() throws IOException, ClassNotFoundException {
        players.clear();
        int index = 0;
        try {
            players.addAll(readPlayers());
            index = players.size();
        } catch(EOFException ex) {
            System.out.println("Starting a new game.");
        }

        for (int i = index; i < index+10; i++) {
            players.add(new Player(i));
        }
    }

    private void save(List<Player> list) throws IOException {
        File file = new File(filename);
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

        objOut.writeObject(list);

        objOut.close();
        fileOut.close();
    }

    private void save() throws IOException {
        save(players);
    }

    private List<Player> readPlayers() throws IOException, EOFException, ClassNotFoundException {
        File file = new File(filename);
        FileInputStream fileIn = new FileInputStream(file);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        List<Player> temp = (List<Player>) objectIn.readObject();

        objectIn.close();
        fileIn.close();

        return temp;
    }

    private void show() throws IOException, ClassNotFoundException {
        try {
            List<Player> temp = readPlayers();
            temp.forEach(System.out::println);
        } catch (EOFException ex) {
            System.out.println("No player information found.");
        }
    }

    private void clear() throws IOException {
        File f = new File(filename);
        FileOutputStream fOut = new FileOutputStream(f);
        ObjectOutputStream objOut = new ObjectOutputStream(fOut);
        objOut.writeObject(new ArrayList<Player>());
        players.clear();
        objOut.close();
        fOut.close();
    }

    private char readChoice() {
        System.out.print("Choice(p/s/v/c/x): ");
        return in.next().charAt(0);
    }

    private void menu() throws IOException, ClassNotFoundException {
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
