package Exercise;

/**
 * Created by Shreya on 6/19/2017.
 */
public class Q7 {
    static String firstName;
    static {
        firstName="Shreya";
    }

    static void display(){
        String lastName="Bhardwaj";
        System.out.println("Last Name::"+lastName);
    }

    static int age=22;

    public static void main(String[] args) {
        System.out.println("First Name is::"+firstName);
        display();
        System.out.println("Age is::"+age);
    }
}
