package Exercise;

/**
 * Created by Shreya on 6/19/2017.
 */
public class Q6 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,4,5,5};

        int result = 0;
        for(int a : arr)
            result ^=a;     //xor operation (2^2)^(3^3)^(4^4)^(5^5)^1
                            //              0^0^0^0^1=1
        System.out.println(result);
    }

}
