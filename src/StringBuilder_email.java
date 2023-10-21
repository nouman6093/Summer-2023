import java.util.*;
public class StringBuilder_email {
    //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    //Example :
    //email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
    //email = “helloWorld123@gmail.com”; username = “helloWorld123”
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        StringBuilder email_builder = new StringBuilder(email);
        String result = "";
        for (int i = 0; i < email_builder.length(); i++){
            if (email_builder.charAt(i) != '@'){
                result += email_builder.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}