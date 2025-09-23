package lecture9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

    public static void save(List<Player> list, File file) {
        try {FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(list);
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Player> read(File file) {
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            List<Player> temp = (List<Player>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return temp;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static void clear(List<Player> list, File file) {
        try {FileOutputStream fOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            objOut.writeObject(new ArrayList<Player>());
            list.clear();
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}