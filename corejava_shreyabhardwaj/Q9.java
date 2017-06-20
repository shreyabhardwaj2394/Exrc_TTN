package Exercise;


import java.io.*;


/**
 * Created by Shreya on 6/19/2017.
 */
public class Q9 {
    public static void main(String[] args) {

        StringBuilder line = new StringBuilder();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("/Users/Shreya/IdeaProjects/Excr-Java/src/Exercise/temp.txt"));
            String text = null;
            while ((text = reader.readLine()) !=null)
            {
                line.append(text).append(System.getProperty("line.separator"));

            }

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException ei)
        {
            ei.printStackTrace();
        }
        System.out.println(line.toString());

    }
}
