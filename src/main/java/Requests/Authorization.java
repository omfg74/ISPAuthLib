package Requests;

import Interfaces.BillingInterface;
import Objects.ISPAuthObject.Auth;
import Objects.ISPAuthObject.PostModel;
import Objects.LoginPassword;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;

public class Authorization {
    public String authRequest(LoginPassword loginPassword){
       String key = "";




        BillingInterface billingInterface;
        Retrofit retrofit;
        retrofit  = new Retrofit.Builder()
                .baseUrl("https://"+loginPassword.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        billingInterface = retrofit.create(BillingInterface.class);


        try{
            Response<PostModel> response = null;
            try {
                response = billingInterface.getAuth("auth",loginPassword.getLogin(),loginPassword.getPassword()).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }


           Auth auth = new Auth();
            auth.set$(response.body().getDoc().getAuth().get$());
            auth.set$id(response.body().getDoc().getAuth().get$id());
            auth.set$level(response.body().getDoc().getAuth().get$level());

            key = auth.get$id();
            System.out.println("Key "+key);

        }catch (Exception e){
            e.printStackTrace();
        }
        return key;
    }
}
