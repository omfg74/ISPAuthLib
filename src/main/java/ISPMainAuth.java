import Objects.LoginPassword;
import Requests.Authorization;
import Utils.FileWorker;

import java.io.*;

public class ISPMainAuth {
    public String authorize(String filename){
        String key = "";
        File file = new File(filename);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            LoginPassword loginPassword = (LoginPassword) objectInputStream.readObject();
            key = getApiKey(loginPassword);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return key;
    }

    public  String  authorize(boolean isAuthorized){
        String key;
        if(!isAuthorized){
            Auth auth = new Auth();
            LoginPassword loginPassword = auth.askLoginPass();

           key = getApiKey(loginPassword);
        }else {
            LoginPassword loginPassword = new LoginPassword();
            if(loginPassword.getLogin().equalsIgnoreCase("")){
            key = "";
            System.out.println("Error. Key is emty ");
        }else {
                Auth auth = new Auth();
               loginPassword = auth.askLoginPass();
               FileWorker fileWorker = new FileWorker("user_data.sav",loginPassword);
               fileWorker.writeToFile();


                key = getApiKey(loginPassword);
            }
        }
        return key;
    }
    private  String getApiKey(LoginPassword loginPassword){

        Authorization authorization = new Authorization();
        String apiKey= authorization.authRequest(loginPassword);

        System.out.println(apiKey);
        return apiKey;
    }
}
