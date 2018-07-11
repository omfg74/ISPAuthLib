import Objects.LoginPassword;
import Requests.Authorization;

public class Main {
    public static void main(String[] args) {

        boolean isAutorized = false;

        authorize(isAutorized);
    }
    public static void authorize(boolean isAuthorized){
        if(!isAuthorized){
            Auth auth = new Auth();
            LoginPassword loginPassword = auth.askLoginPass();

            getApiKey(loginPassword);
        }
    }
    private static String getApiKey(LoginPassword loginPassword){

        Authorization authorization = new Authorization();
        String apiKey= authorization.authRequest(loginPassword);

        System.out.println(apiKey);
        return apiKey;
    }
}
