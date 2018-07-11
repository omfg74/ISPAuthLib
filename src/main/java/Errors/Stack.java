
package Errors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stack {

    @SerializedName("action")
    @Expose
    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}
