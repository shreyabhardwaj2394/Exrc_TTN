package Q5;

import java.util.*;

/**
 * Created by Shreya on 6/21/2017.
 * Q5
 */
public class Student {
    String Name;
    double Score;
    double Age;

    Student(String name,double score,double age){
        this.Name=name;
        this.Score=score;
        this.Age=age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        Age = age;
    }
}

class StudentComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.Score==o2.Score){
            return o1.Name.compareTo(o2.Name);
        }
        else{
            return (int)(o2.Score-o1.Score);
        }
    }
}


class Show{

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("STUDENT1",(double)63,(double)16));
        list.add(new Student("STUDENT2",(double)43,(double)17));
        list.add(new Student("STUDENT3",(double)35,(double)15));
        list.add(new Student("STUDENT4",(double)90,(double)16));
        list.add(new Student("STUDENT5",(double)42,(double)15));
        list.add(new Student("STUDENT6",(double)63,(double)15));
        list.add(new Student("STUDENT7",(double)68,(double)16));
        System.out.println("Sorting by Scores and Scores are same then sorting by names::");

        Collections.sort(list,new StudentComparator());

        Iterator itr=list.iterator();
        while(itr.hasNext()){

            Student student=(Student) itr.next();
            System.out.println(student.getScore()+" "+student.getName()+" "+(int)student.getAge());
        }


    }
}