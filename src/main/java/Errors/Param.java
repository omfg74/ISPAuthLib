
package Errors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Param {

    @SerializedName("$name")
    @Expose
    private String $name;
    @SerializedName("$type")
    @Expose
    private String $type;
    @SerializedName("$")
    @Expose
    private String $;

    public String get$name() {
        return $name;
    }

    public void set$name(String $name) {
        this.$name = $name;
    }

    public String get$type() {
        return $type;
    }

    public void set$type(String $type) {
        this.$type = $type;
    }

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

}
