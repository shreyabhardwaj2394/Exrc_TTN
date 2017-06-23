import java.sql.Array;
import java.util.*;

/**
 * Created by Shreya on 6/21/2017.
 */
public class Q6 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values do you wish to enter??");
        int num = scan.nextInt();
        int val;
        for (int i = 0; i < num; i++) {
            val = scan.nextInt();
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
                map2.put(val,i);
            }
        }
        System.out.println("Unsorted::");
        printMap(map);
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,new frequencycomp(map2));
        System.out.println("Sorted::");
        for(Map.Entry<Integer,Integer> i : list)
        {
            System.out.println(i);
        }



    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}


class frequencycomp implements Comparator<Map.Entry<Integer,Integer>>{


    HashMap<Integer,Integer> temp;
    frequencycomp(HashMap<Integer,Integer> map){
        temp=map;
    }

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

        if(o1.getValue().equals(o2.getValue())){
            return temp.get(o1.getKey())-temp.get(o2.getKey());
        }
        else{
            return o2.getKey().compareTo(o1.getKey());
        }
    }
}