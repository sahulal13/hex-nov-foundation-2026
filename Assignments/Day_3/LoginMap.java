package Day_3;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LoginMap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username:");
        String username = sc.next();
        System.out.println("Enter the password:");
        String password = sc.next();

        LoginService loginService = new LoginService();
        boolean isValid = loginService.validate(username , password);

        if(isValid){
            System.out.println("Access Granted");
        }else{
            System.out.println("Wrong Credentials");
            System.out.println("Access Denied");
        }

        System.out.println("**************************");
        sc.close();
    }



}
