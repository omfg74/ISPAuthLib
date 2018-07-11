package Objects.ISPAuthObject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doc {

    @SerializedName("$lang")
    @Expose
    private String $lang;
    @SerializedName("$func")
    @Expose
    private String $func;
    @SerializedName("$binary")
    @Expose
    private String $binary;
    @SerializedName("$host")
    @Expose
    private String $host;
    @SerializedName("$themename")
    @Expose
    private String $themename;
    @SerializedName("$theme")
    @Expose
    private String $theme;
    @SerializedName("$stylesheet")
    @Expose
    private String $stylesheet;
    @SerializedName("$features")
    @Expose
    private String $features;
    @SerializedName("$notify")
    @Expose
    private String $notify;
    @SerializedName("$css")
    @Expose
    private String $css;
    @SerializedName("$logo")
    @Expose
    private String $logo;
    @SerializedName("$logolink")
    @Expose
    private String $logolink;
    @SerializedName("$favicon")
    @Expose
    private String $favicon;
    @SerializedName("$localdir")
    @Expose
    private String $localdir;
    @SerializedName("addon")
    @Expose
    private Addon addon;
    @SerializedName("auth")
    @Expose
    private Auth auth;
    @SerializedName("messages")
    @Expose
    private Messages messages;
    @SerializedName("saved_filters")
    @Expose
    private SavedFilters savedFilters;
    @SerializedName("tparams")
    @Expose
    private Tparams tparams;

    public String get$lang() {
        return $lang;
    }

    public void set$lang(String $lang) {
        this.$lang = $lang;
    }

    public String get$func() {
        return $func;
    }

    public void set$func(String $func) {
        this.$func = $func;
    }

    public String get$binary() {
        return $binary;
    }

    public void set$binary(String $binary) {
        this.$binary = $binary;
    }

    public String get$host() {
        return $host;
    }

    public void set$host(String $host) {
        this.$host = $host;
    }

    public String get$themename() {
        return $themename;
    }

    public void set$themename(String $themename) {
        this.$themename = $themename;
    }

    public String get$theme() {
        return $theme;
    }

    public void set$theme(String $theme) {
        this.$theme = $theme;
    }

    public String get$stylesheet() {
        return $stylesheet;
    }

    public void set$stylesheet(String $stylesheet) {
        this.$stylesheet = $stylesheet;
    }

    public String get$features() {
        return $features;
    }

    public void set$features(String $features) {
        this.$features = $features;
    }

    public String get$notify() {
        return $notify;
    }

    public void set$notify(String $notify) {
        this.$notify = $notify;
    }

    public String get$css() {
        return $css;
    }

    public void set$css(String $css) {
        this.$css = $css;
    }

    public String get$logo() {
        return $logo;
    }

    public void set$logo(String $logo) {
        this.$logo = $logo;
    }

    public String get$logolink() {
        return $logolink;
    }

    public void set$logolink(String $logolink) {
        this.$logolink = $logolink;
    }

    public String get$favicon() {
        return $favicon;
    }

    public void set$favicon(String $favicon) {
        this.$favicon = $favicon;
    }

    public String get$localdir() {
        return $localdir;
    }

    public void set$localdir(String $localdir) {
        this.$localdir = $localdir;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public SavedFilters getSavedFilters() {
        return savedFilters;
    }

    public void setSavedFilters(SavedFilters savedFilters) {
        this.savedFilters = savedFilters;
    }

    public Tparams getTparams() {
        return tparams;
    }

    public void setTparams(Tparams tparams) {
        this.tparams = tparams;
    }

}