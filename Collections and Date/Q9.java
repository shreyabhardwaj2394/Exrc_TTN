import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Shreya on 6/21/2017.
 */
public class Q9 {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("Today it is "+ d1);
        Locale locItalian = new Locale("it","ch");

        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("Today is in Italian Language in Switzerland Format : "+ df.format(d1));
    }
}
