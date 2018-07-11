import Objects.LoginPassword;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Auth {

    String baseUrl;
    LoginPassword loginPassword = new LoginPassword();
    public LoginPassword askLoginPass(){

        System.out.println("Enter your ISP Billing login");
        Scanner scanner = new Scanner(System.in);
        loginPassword.setLogin( scanner.next());
        System.out.println("Enter your ISP billing Password");
        loginPassword.setPassword(scanner.next());
        System.out.println("Enter your ISP base URL");
        loginPassword.setBaseUrl(scanner.next());


        return loginPassword;

    }
}
