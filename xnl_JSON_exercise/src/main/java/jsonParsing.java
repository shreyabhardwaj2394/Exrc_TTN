import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by Shreya on 7/8/2017.
 */
public class jsonParsing {
    public static void main(String[] args) {
        JSONParser parser=new JSONParser();

        try {
            //Reading json from a file
            Object object=parser.parse(new FileReader("..\\xnl_JSON_exercise\\JSONTest"));
            JSONObject jsonObject=(JSONObject)object;
            System.out.println(jsonObject);
            //writing json to a file
            FileWriter fileWriter=new FileWriter("..\\xnl_JSON_exercise\\json_Object_created");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        System.out.println("Object has been copied to another file!!");
    }



}
