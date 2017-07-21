package service;

import dao.UserDao;
import entity.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shreya on 7/13/2017.
 */
public class AccountService {
    UserDao userDao;
    LoggingService loggingService;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Transactional
    public void addUser(User user){
        userDao.save(user);
    }

    @Transactional
    public void deleteUser(int id){
        userDao.delete(id);
    }

    @Transactional
    public void update(User user){
        userDao.update(user);
    }

    @Transactional
    public List<User> getAll(){
        return userDao.getAllUsers();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void transfer(User sender,User receiver,int amount){

        System.out.println("transfer of Rs."+amount+" being done from "+sender.getName()+" to "+receiver.getName());
        userDao.transfer(sender,receiver,amount);

        try{
            loggingService.logTransaction(sender,receiver,amount);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
