package Objects.ISPAuthObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tparams {

    @SerializedName("func")
    @Expose
    private Func func;
    @SerializedName("out")
    @Expose
    private Out out;
    @SerializedName("username")
    @Expose
    private Username username;

    public Func getFunc() {
        return func;
    }

    public void setFunc(Func func) {
        this.func = func;
    }

    public Out getOut() {
        return out;
    }

    public void setOut(Out out) {
        this.out = out;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

}