
package Errors;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error {

    @SerializedName("$type")
    @Expose
    private String $type;
    @SerializedName("$object")
    @Expose
    private String $object;
    @SerializedName("$lang")
    @Expose
    private String $lang;
    @SerializedName("detail")
    @Expose
    private Detail detail;
    @SerializedName("msg")
    @Expose
    private Msg msg;
    @SerializedName("param")
    @Expose
    private List<Param> param = null;
    @SerializedName("stack")
    @Expose
    private Stack stack;

    public String get$type() {
        return $type;
    }

    public void set$type(String $type) {
        this.$type = $type;
    }

    public String get$object() {
        return $object;
    }

    public void set$object(String $object) {
        this.$object = $object;
    }

    public String get$lang() {
        return $lang;
    }

    public void set$lang(String $lang) {
        this.$lang = $lang;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    public List<Param> getParam() {
        return param;
    }

    public void setParam(List<Param> param) {
        this.param = param;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

}
