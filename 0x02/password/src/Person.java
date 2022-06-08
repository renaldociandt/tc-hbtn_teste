
import java.util.regex.Pattern;

public class Person{

    public boolean checkUser(String userName){

        if (userName.matches("(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")){
            return true;

        }
        return false;
    }

    public boolean checkPassword(String userName){
        if (userName.matches("(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")) {
            return true;
        }
        return false;

    }

}
