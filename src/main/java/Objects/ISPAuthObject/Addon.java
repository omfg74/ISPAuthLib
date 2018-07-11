package Objects.ISPAuthObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Addon {
    @SerializedName("body")
    @Expose
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
}
}
