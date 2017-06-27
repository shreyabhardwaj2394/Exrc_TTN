import java.util.*;

/**
 * Created by Shreya on 6/20/2017.
 */
public class Q2 {

    HashMap<Character,Integer> compute(String str){
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
        return map;
    }
    public static void main(String[] args) {
        int count=0;
        Q2 obj=new Q2();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string::");
        String str = scan.nextLine();

        HashMap<Character,Integer> map =obj.compute(str);
        Iterator<Character> it=map.keySet().iterator();

        System.out.print("Unique characters are::");
       while(it.hasNext()){
        Character c=it.next();
        if(map.get(c).equals(1)){
            System.out.print(c+" ");
            count++;
        }
       }
        System.out.println("\nTotal count::"+count);
    }
}
