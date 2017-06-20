package Exercise;

import java.util.Scanner;

/**
 * Created by Shreya on 6/19/2017.
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the main string::");
        String mainStr=scan.nextLine();
        System.out.println("Enter the substring you want to replace::");
        String repStr=scan.nextLine();
        System.out.println("Enter the string you want the substring to be replaced with::");
        String repWithStr=scan.nextLine();


        String newStr=mainStr.replaceAll(repStr,repWithStr);
        System.out.println("The new string after replacement is::"+newStr);

    }

}
