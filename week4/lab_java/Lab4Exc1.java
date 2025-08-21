public class Lab4Exc1 {
    public static void main(String[] args) {
        /*
            formatter %-16.2f:
            - indicates left-justified within the field
            16 specifies a field width of 16 characters
            .2 specifies the precision
         */ 
        String iFormat = "| %-3d | %-16.2f | %-16.2f |%n";

        System.out.format("+-----+------------------+------------------+\n");
        System.out.format("|  i  | square root of i | exponential of i |\n");
        System.out.format("+-----+------------------+------------------+\n");

        for (int i=1; i <=10 ; i++){
            System.out.format(iFormat,i,Math.sqrt(i),Math.exp(i));
        }

        System.out.format("+-----+------------------+------------------+\n");
    }
}
