public class MyStringArr {
    public static String[] names(int size) {
        String[] s = new String[size];
        return s;
    }

    public static void update(String[] names) {
        for (int i = 0; i < names.length; i++) {
            names[i] = "TBA";
        }
    }

    public static void main(String[] args) {
        String [] names = names(3);
        update(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}