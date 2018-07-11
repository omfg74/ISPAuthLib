package Interfaces;

import Objects.ISPAuthObject.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BillingInterface {

    @GET("billmgr?out=json")
//    @GET("billmgr?out=json&func={func}&username={param1}&password={param2}")
    Call<PostModel> getAuth(@Query("func") String func,
                            @Query("username")String username,
                            @Query("password")String password);
}
