import java.util.Scanner;

/**
 * Created by Shreya on 6/21/2017.
 */
public class Q4LambdaExpression {

@FunctionalInterface
interface table{
                    void operation(int a);
    }


    public static void main(String[] args) {
        int temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number for which you want ro calculate the table::");
        temp=scan.nextInt();
        Q4LambdaExpression obj = new Q4LambdaExpression();
        table calculate = a -> {
            for(int i=1;i<=10;i++){
                System.out.println(a+" * "+i+" = "+a*i);
            }
        };

        calculate.operation(temp);

    }

}
