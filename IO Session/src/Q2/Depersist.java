package Q2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Shreya on 6/22/2017.
 */
public class Depersist {
    public static void main(String args[])throws Exception{

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("file.txt"));
        Employee obj=(Employee) in.readObject();
        System.out.println("Object's state::");

        in.close();
    }

}
