import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Shreya on 6/20/2017.
 */
public class Q1 {
    public static void main(String[] args) {
        List<Float> list=new ArrayList<>();
        list.add(1.2f);
        list.add(3.4f);
        list.add(6.3f);
        list.add(8.0f);
        list.add(7.5f);

        float sum=0,temp=0;

        for(Float num:list){
            sum=sum+num;
        }
        System.out.println("The sum is"+sum);
    }
}
