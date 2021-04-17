import java.util.Map;

public class Subscribe {
    /// need user name and topic name

    String Topicname;
    String username;
    Map<String,String> sub ;
    public String addSubscribe(String Topicname, string username){
        this.Topicname = Topicname;
        this.username - username;
        if (Topics.check_topic(Topicname) && username !=null){
            sub.put(Topicname,username);
            return "Topic Subscriber Successfully"
        else    
            return "Sorry no Topic found";
    }
}

