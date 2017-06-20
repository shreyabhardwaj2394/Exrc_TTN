package Exercise;

/**
 * Created by Shreya on 6/19/2017.
 * Q12
 */
public class Bank {
    public void getDetails() {
        System.out.println("Function of Bank class");
    }

}

class SBI extends Bank{
    static float ROI=(float)6.6;
    static String name="SBI";
    static String location="DELHI";
    @Override
    public void getDetails() {
        System.out.println("ROI::"+ROI);
        System.out.println("NAME::"+name);
        System.out.println("LOCATION::"+location);
    }

    public static void main(String[] args) {
        Bank b=new Bank();
        b.getDetails();
        Bank sbi=new SBI();
        sbi.getDetails();
        Bank boi=new BOI();
        boi.getDetails();
        Bank icici=new ICICI();
        icici.getDetails();
    }

}

class BOI extends Bank{
    static float ROI=(float)9.6;
    static String name="BOI";
    static String location="GUJRAT";

    @Override
    public void getDetails() {
        System.out.println("ROI::"+ROI);
        System.out.println("NAME::"+name);
        System.out.println("LOCATION::"+location);

    }
}

class ICICI extends Bank{
    static float ROI=(float)12.6;
    static String name="ICICI";
    static String location="GOA";
    @Override
    public void getDetails() {
        System.out.println("ROI::"+ROI);
        System.out.println("NAME::"+name);
        System.out.println("LOCATION::"+location);

    }
}
