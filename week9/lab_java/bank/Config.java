package bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Config {
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/uuuu - HH:mm:ss");
    public static final LocalDateTime NOW = LocalDateTime.now();
    public static final Scanner IN = new Scanner(System.in);
    private static String filename = "customers.data";

        public static void initialize() {
        try{
            List<Customer> customers = new LinkedList<>();
            File file = new File(filename);
            if (!file.exists()){
                file.createNewFile();
                FileOutputStream fileOut = new FileOutputStream(filename);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);            
                objectOut.writeObject(customers);
                objectOut.close();
                fileOut.close();
            }    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, "File Not Found", ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, "Reading Error", ex);
        } 
    }

    public static List<Customer> read(){
        List<Customer> customers = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            customers = (List)objectIn.readObject();
            objectIn.close();
            fileIn.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, "File Not Found", ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, "Reading Error", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    public static void write(List<Customer> customers){

        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);            
            objectOut.writeObject(customers);
            objectOut.close();
            fileOut.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, "File Not Found", ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, "Reading Error", ex);
        }
    }
}
