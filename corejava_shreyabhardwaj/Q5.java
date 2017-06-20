package Exercise;

/**
 * Created by Shreya on 6/19/2017.
 */
public class Q5 {

    public static void main(String[] args) {
        int[] arr1={1,2,4,5,7,8,0};
        int[] arr2={2,5,7,12,32,90,9};

        System.out.println("Common Elements are::");
        for(int i=0;i<arr1.length;i++)
            for (int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                    System.out.println(arr1[i]);
            }
    }
}
