
package Errors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("$level")
    @Expose
    private String $level;
    @SerializedName("$user")
    @Expose
    private String $user;
    @SerializedName("$")
    @Expose
    private String $;

    public String get$level() {
        return $level;
    }

    public void set$level(String $level) {
        this.$level = $level;
    }

    public String get$user() {
        return $user;
    }

    public void set$user(String $user) {
        this.$user = $user;
    }

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}
