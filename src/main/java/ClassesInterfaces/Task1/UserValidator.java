package ClassesInterfaces.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    void validateEmails(){

        class Email{
            private String emailAddress;

            public Email(String emailAddress){
                if(emailAddress.isEmpty() || validate(emailAddress) ){
                    this.emailAddress = "unknown";
                }else {
                    this.emailAddress = emailAddress;
                }
            }
        }



    }

    private static boolean validate(String emailAddress){
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.find();
    }
}
