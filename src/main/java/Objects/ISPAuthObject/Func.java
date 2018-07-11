
package Objects.ISPAuthObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Func {

    @SerializedName("$")
    @Expose
    private String $;

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}