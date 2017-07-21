import dao.UserDao;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

import java.util.List;

/**
 * Created by Shreya on 7/11/2017.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-transactions.xml");


      //Question 1
        UserDao user=(UserDao) applicationContext.getBean("userDao");
        user.createTable();
        System.out.println("TABLE HAS BEEN CREATED, CHECK DB!!");


        //Question 2
        //Add user
        AccountService user2=(AccountService) applicationContext.getBean("accountService");
        user2.addUser(new User(1,"Ross",10000));
        user2.addUser(new User(2,"Rachel",10740));
        user2.addUser(new User(3,"Joey",78000));
        user2.addUser(new User(4,"Monika",98222));
        user2.addUser(new User(5,"Chandler",64543));
        user2.addUser(new User(6,"Pheobe",756420));
        user2.addUser(new User(7,"Matt",9184713));

        //Read
        List<User> list=user2.getAll();
        list.forEach(System.out::println);

        //Update
        int listLength=list.size();
        User updatedUser=list.get(listLength-1);
        updatedUser.setName("Updated Name");
        user2.update(updatedUser);
        System.out.println("Updation Done!!");

        //Delete
        user2.deleteUser(list.get(listLength-2).getId());
        System.out.println("deleted user "+list.get(listLength-2).getName());

        //Question 4
        user2.transfer(list.get(listLength-1),list.get(listLength-3),1000);



    }
}
