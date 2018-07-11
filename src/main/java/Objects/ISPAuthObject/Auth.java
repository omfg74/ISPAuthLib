package Objects.ISPAuthObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Auth {

    @SerializedName("$id")
    @Expose
    private String $id;
    @SerializedName("$level")
    @Expose
    private String $level;
    @SerializedName("$")
    @Expose
    private String $;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public String get$level() {
        return $level;
    }

    public void set$level(String $level) {
        this.$level = $level;
    }

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}