/**
 * Created by Shreya on 6/22/2017.
 */
interface Test{

    default void testFunction1(){
        System.out.println("Inside default fuction of the interface!!");
    }

    static void testFunction2(){
        System.out.println("Inside static function of the interface!!");
    }

    public void method();
}
public class Q5 implements Test {
    @Override
    public void method(){
        System.out.println("Inside overridden method");
    }

    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.method();
        obj.testFunction1();
        Test.testFunction2();

    }

}
