package Objects;

import java.io.Serializable;

public class LoginPassword implements Serializable {
    String login;
    String password;
    String baseUrl;

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {

        return baseUrl;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {

        return login;
    }

    public String getPassword() {
        return password;
    }
}
