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
        System.out.println("Object's Id::"+obj.Id);
        System.out.println("Object's Name::"+obj.Name);
        System.out.println("Object's Profile::"+obj.Profile);
        in.close();
    }

}
