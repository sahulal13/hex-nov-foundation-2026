package Day_3;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    Map<String,String> map = new HashMap<>();

    public LoginService(){
        map.put("harry","potter@123");
        map.put("ronald","ronald@123");
        map.put("hermione","hermione@123");
    }

    public boolean validate(String username, String password) {

        if(map.containsKey(username)){
            String originalPassword = map.get(username);
            if(originalPassword.equals(password)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
