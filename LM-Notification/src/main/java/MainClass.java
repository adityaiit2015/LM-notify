import java.util.Scanner;
import

public class MainClass {

    public static void main(String[] args){
        boolean flag = true;
        while(flag) {
            System.out.println("PRESS 1  FOR ADD USER");
            System.out.println("PRESS 2  FOR ADD TOPIC");
            System.out.println("PRESS 3  FOR SUBSCRIBE TOPIC");
            System.out.println("PRESS 4  FOR POSTEVENT_MESSGAE");
            System.out.println("PRESS 5  FOR Process_message");
            Syetem.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Username and Role");
                    String username = scanner.next();
                    String role = scanner.next();
                    System.out.println(username + "  " + role);
                    Users user = new Users(username, role);
                    break;

                case 2:
                    System.out.println("Enter Topic Name and user name");
                    String topic_name = scanner.next();
                    String username = scanner.next();
                    System.out.println(topic_name + "   " + username);
                    Topics topic  = new Topics(topic_name,username);
                    break;
                case 3:
                    System.out.println("Enter Topicname and username");
                    String topic_name = scanner.next();
                    String username = scanner.next();
                    System.out.println(topic_name + "   " + username);
                    Subscribe sub = new Subscribe(topic_name,usernam);
                    break;
                case 4:
                    System.out.println("Enter message body");
                    String message = scanner.next();
                    PsotEvent post = new PostEvent(message);
                    break;
                case 5:
                    System.out.println("Process_Message");
                    break;
                default:
                    flag =false;
                    break;
            }
        }
    }
}
