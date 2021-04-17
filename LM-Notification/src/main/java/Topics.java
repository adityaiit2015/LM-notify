import java.util.Map;

public class Topics {
    String topic_name;
    String username;

    Map<String ,String> topic ;


    public String Topics(String topic_name , String username){
        this.topic_name = topic_name;
        this.username = username;
        if (Users.check_role(username) &&  username !=null && topic_name !=null){
             this.topc.put(topic_name,username);
        }
        else {
            return "Sorry access denied";
        }
    }

    public static boolean check_topic(String topic_name){
        this.topic_name = topic_name;
        if (topic.containsValue(topic_name))
            return true;
        }
        return false;
    }

}
