public class FindMaxNumber{
    public static void main(String args[]){

        /*As the args[] stores the command line arrguments in string */

        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        /*Thats why we we use Integer.parseInt which convert string to an Integer */
        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number is: " + max);
    
    }
}