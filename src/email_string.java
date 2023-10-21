import java.util.*;
public class email_string {
    //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    //Example :
    //email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
    //email = “helloWorld123@gmail.com”; username = “helloWorld123”
    public static void main(String[] args){
        Scanner email_object = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = email_object.next();
        String username = "";
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.print("Your username is: "+username);
    }
}