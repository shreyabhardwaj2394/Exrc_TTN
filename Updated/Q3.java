import java.util.*;

/**
 * Created by Shreya on 6/20/2017.
 */
public class Q3 {

    void occurances(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {

                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }

    }
    public static void main(String[] args) {
        Q3 obj=new Q3();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string::");
        String str = scan.nextLine();
        obj.occurances(str);
    }
}
