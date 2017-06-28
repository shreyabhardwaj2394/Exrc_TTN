package Q6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Shreya on 6/22/2017.
 */
public class Employee {
    String Name;
    int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        Name = name;
        this.age = age;
    }
}

class Q6 {


    public static  void evaluate(List<Employee> list, Predicate<Employee> p)
    {
        for(Employee n:list){
            if(p.test(n))
            {
                System.out.println("Name:"+n.getName());
                System.out.println("Name:"+n.getAge());

            }
        }
    }




    public static void main(String[] args) {

        Employee e=new Employee("shreya",22);
        Employee e3=new Employee("nitin",26);
        Employee e1=new Employee("nipun",28);
        Employee e2=new Employee("shaan",22);
        List<Employee> elist=new ArrayList<>();
        elist.add(e);
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);

        evaluate(elist,(n)->{
            String name=n.getName();
            if(name.endsWith("n"))
            {
                if(n.getAge()>24)
                    return true;
                else
                    return false;
            }
            else
                return false;
        });

    }
}

