package Objects.ISPAuthObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Messages {

    @SerializedName("$name")
    @Expose
    private String $name;
    @SerializedName("$checked")
    @Expose
    private String $checked;
    @SerializedName("msg")
    @Expose
    private Msg msg;

    public String get$name() {
        return $name;
    }

    public void set$name(String $name) {
        this.$name = $name;
    }

    public String get$checked() {
        return $checked;
    }

    public void set$checked(String $checked) {
        this.$checked = $checked;
    }

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

}