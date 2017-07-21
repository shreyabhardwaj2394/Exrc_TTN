package dao;

import entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Shreya on 7/11/2017.
 */
@Component
public class UserDao {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Transactional
    public void createTable(){
        jdbcTemplate.execute("CREATE TABLE ACCOUNT(ID INTEGER ,NAME VARCHAR(20),BALANCE DOUBLE ) ");
        System.out.println("TABLE CREATED!!");
    }

    @Transactional
    public int save(User user){
        String query="insert into ACCOUNT(id,name,balance) values('"+user.getId()+"','"+user.getName()+"','"+user.getBalance()+"')";
        return jdbcTemplate.update(query);
    }

    @Transactional
    public int update(User user){
        String query="update ACCOUNT set name='"+user.getName()+"',balance='"+user.getBalance()+"' where id='"+user.getId()+"'";
        return jdbcTemplate.update(query);
    }

    @Transactional
    public int delete(int id){
        String query="delete from ACCOUNT where id='"+id+"'";
        return jdbcTemplate.update(query);
    }

    @Transactional
    public List<User> getAllUsers(){
        return  jdbcTemplate.query("select * from ACCOUNT",new RowMapper<User>(){
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user=new User(rs.getInt(1),rs.getString(2),rs.getDouble(3));
                return user;
            }
        });
    }



    @Transactional(propagation = Propagation.REQUIRED)
    public boolean transfer(User sender,User receiver,int amount){
        String query="update ACCOUNT set balance ='"+(sender.getBalance()-amount)+"' where id='"+sender.getId()+"'";
        String query2="update ACCOUNT set balance ='"+(receiver.getBalance()+amount)+"' where id='"+receiver.getId()+"'";
        int result=jdbcTemplate.update(query);
        int result2=jdbcTemplate.update(query2);
        if(result>0 && result2>0)
            return true;
        return false;
    }

}
