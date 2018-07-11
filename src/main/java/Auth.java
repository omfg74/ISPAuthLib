import Objects.LoginPassword;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Auth {

    String baseUrl;
    LoginPassword loginPassword = new LoginPassword();
    public void askLoginPass(){

        System.out.println("Enter your ISP Billing login");
        Scanner scanner = new Scanner(System.in);
        loginPassword.setLogin( scanner.next());
        System.out.println("Enter your ISP billing Password");
        loginPassword.setPassword(scanner.next());

    }
}
