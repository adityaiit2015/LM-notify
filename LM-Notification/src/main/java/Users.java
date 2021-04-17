import java.util.HashMap;
import java.util.Map;

public class Users {

    String username;
    String role ;
    //add a user and role

    Map<String,String> users;
    public String Users(String username , String role){
//             user_util user = new user_util(username,role);
        this.username = username;
        this.role = role;
        if (username !=null && role != null)
        this.users.put(username,role);
        return "user and role is added successfully";
    }
    public boolean check_role(String username){
        this.username = username;
        if (users.containsKey(username) && username !=null){
            if users.containsKey(username) =="ADMIN")
            return true;
        }
        return false;
    }

}
