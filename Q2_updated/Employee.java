package Q2; /**
 * Created by Shreya on 6/22/2017.
 */
import java.io.Serializable;
public class Employee implements Serializable{
    int Id;
    String Name;
    String Profile;
    public Employee(int id,String name,String profile){
        this.Id=id;
        this.Name=name;
        this.Profile=profile;
    }
}
