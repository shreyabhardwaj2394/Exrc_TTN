import java.util.*;

/**
 * Created by Shreya on 6/21/2017.
 */
public class Q6 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {9,9,9,8,7,6,9,6,5,5,4,3,4,3};
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
        }
        System.out.println("Unsorted::");
        printMap(map);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new frequencycomp());
        System.out.println("Sorted::");
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                arr[index++] = entry.getKey();
            }
            System.out.println(entry);
        }

    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}

class frequencycomp implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}