public class Main {
    public static void main(String[] args) {

        boolean isAutorized = false;

        authorize(isAutorized);
    }
    public static void authorize(boolean isAuthorized){
        if(!isAuthorized){
            Auth auth = new Auth();
            auth.askLoginPass();
        }
    }
}
