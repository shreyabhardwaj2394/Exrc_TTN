package Q3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Shreya on 6/22/2017.
 */
public class Ques {
    public static void main(String[] args) {

        Field[] fields=Employee.class.getDeclaredFields();
        for (Field field: fields) {
            System.out.println("Field Type::"+field.getType());
            System.out.println("Field Name::"+field.getName());

        }
        Method[] methods=Employee.class.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println("Method Name::"+method.getName());
            System.out.println("Method Modifer:"+method.getModifiers());
        }
    }
}
