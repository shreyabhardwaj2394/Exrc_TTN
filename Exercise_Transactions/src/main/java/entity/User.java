package entity;

/**
 * Created by Shreya on 7/11/2017.
 */
public class User {
    int id;
    String name;
    double balance;

    public User(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
