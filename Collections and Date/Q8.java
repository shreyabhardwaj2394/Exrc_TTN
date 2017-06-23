import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Shreya on 6/21/2017.
 */
public class Q8 {

    public static void main(String[] args) {
        Date currentDate = new Date();
        //System.out.println("Current Date: "+currentDate);
        System.out.println("Date in the specified format::"+new SimpleDateFormat("dd-MMMM-yyyy").format(currentDate));

    }
}
