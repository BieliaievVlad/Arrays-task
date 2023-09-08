package app;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Main {
    static Scanner scanner;
    static String pattern;
    static String[] products = new String[5];
    static String[] days = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday"};
    static int count;
    static int count1;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.printf("Enter the name of the product purchased on %s: ",days[0]);
        products[0] = scanner.nextLine();
        System.out.printf("Enter the name of the product purchased on %s: ",days[1]);
        products[1] = scanner.nextLine();
        System.out.printf("Enter the name of the product purchased on %s: ",days[2]);
        products[2] = scanner.nextLine();
        System.out.printf("Enter the name of the product purchased on %s: ",days[3]);
        products[3] = scanner.nextLine();
        System.out.printf("Enter the name of the product purchased on %s: ",days[4]);
        products[4] = scanner.nextLine();


        System.out.println(Arrays.toString(products));
        System.out.println("List of purchased products:");
        while (count< products.length){
            System.out.printf("%n%d) %s on %s",count+1,products[count],days[count]);
            count++;
        }

        System.out.printf("%nEnter product name for search: ");
        pattern = scanner.nextLine();
        scanner.close();
        for (String product : products) {
            if (product.equals(pattern))
                count1++;

        }
        if (count1 > 0)
                System.out.printf("%nNumber of matches are: %d",count1);

        else if (count1 == 0)
                System.out.print("No matches found." );



    }


}
