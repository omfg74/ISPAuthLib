
package Errors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doc {

    @SerializedName("error")
    @Expose
    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}
