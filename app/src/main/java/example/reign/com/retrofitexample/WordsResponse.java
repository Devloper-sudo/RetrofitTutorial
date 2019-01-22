package example.reign.com.retrofitexample;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class WordsResponse implements Serializable {
    @SerializedName("words")
    @Expose
    private List<Words> words = null;
    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("msg")
    @Expose
    private String msg;

    public List<Words> getWords() {
        return words;
    }

    public void setWords(List<Words> words) {
        this.words = words;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
