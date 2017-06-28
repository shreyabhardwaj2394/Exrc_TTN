package Q2;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Shreya on 6/22/2017.
 */
public class Persist {
    public static void main(String[] args)throws Exception {
        Employee obj=new Employee(100,"Host","Developer");
        FileOutputStream fileOutputStream=new FileOutputStream("file.txt");
        ObjectOutputStream out=new ObjectOutputStream(fileOutputStream);
        out.writeObject(obj);
        out.flush();
        System.out.println("Object Serialized");

    }
}
