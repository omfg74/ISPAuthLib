
package Errors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BAdPasswdError {

    @SerializedName("doc")
    @Expose
    private Doc doc;

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

}
