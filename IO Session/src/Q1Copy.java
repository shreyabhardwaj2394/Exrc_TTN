import java.io.*;

/**
 * Created by Shreya on 6/21/2017.
 */
public class Q1Copy {
    public static void main(String[] args) {

        InputStream inStream = null;
        OutputStream outStream = null;

        try {

            File afile = new File("C:\\Users\\Shreya\\IdeaProjects\\IO Session\\src\\original.txt"); //make a test file and give its path
            File bfile = new File("C:\\Users\\Shreya\\IdeaProjects\\original.txt"); //give destination path

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied successfully");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
