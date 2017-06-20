package Exercise;

import java.util.Scanner;

/**
 * Created by Shreya on 6/19/2017.
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Enter a character");
        char c = scan.next(".").toLowerCase().charAt(0);

        int count = str.length()-str.replaceAll(String.valueOf(c),"").length();
        System.out.println(c+" occurs "+count+" times");
        scan.close();
    }

}
