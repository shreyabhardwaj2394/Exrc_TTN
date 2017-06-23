package Q4;

import java.util.*;

/**
 * Created by Shreya on 6/21/2017.
 * Q4
 */
public class Employee {
    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    Double Age;
    Double Salary;
    String Name;

    public Employee(Double age,Double salary,String name){
        this.Age=age;
        this.Salary=salary;
        this.Name=name;
    }

}


class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {

       return (int)(o2.getSalary()-o1.getSalary());

    }
}


class Display{

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee((double)25,(double)15000,"EMP1"));
        list.add(new Employee((double)22,(double)15780,"EMP2"));
        list.add(new Employee((double)35,(double)25100,"EMP3"));
        list.add(new Employee((double)45,(double)1000,"EMP4"));

        System.out.println("Sorting by salary::");

        Collections.sort(list,new EmployeeComparator());

        Iterator itr=list.iterator();
        while(itr.hasNext()){

            Employee emp=(Employee) itr.next();
            System.out.println(emp.getAge()+" "+emp.getSalary()+" "+emp.getName());
        }


    }
}