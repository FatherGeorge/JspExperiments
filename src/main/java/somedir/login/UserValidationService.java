package somedir.login;

/**
 * Created by sbt-staruhin-yv on 17.05.2017.
 */
public class UserValidationService {
    public boolean isUserValid(String user, String pass) {
        if (user.equals("1") && pass.equals("2")) {
            return true;
        } else
            return false;
    }
}
