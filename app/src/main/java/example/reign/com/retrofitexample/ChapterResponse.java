package example.reign.com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class ChapterResponse {

    @SerializedName("chapter")
    @Expose
    private List<Chapters> chapter = null;
    @SerializedName("success")
    @Expose
    private Integer success;

    public List<Chapters> getChapter() {
        return chapter;
    }

    public void setChapter(List<Chapters> chapter) {
        this.chapter = chapter;
    }
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

}
