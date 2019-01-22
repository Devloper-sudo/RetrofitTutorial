package example.reign.com.retrofitexample;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.io.Serializable;

import javax.security.auth.Subject;

public class Chapters implements Serializable {

    @SerializedName("chapter_id")
    @Expose
    private int chapterId;


    private int chapterSubId;

    public int getChapterSubId() {
        return chapterSubId;
    }

    public void setChapterSubId(int chapterSubId) {
        this.chapterSubId = chapterSubId;
    }

    @SerializedName("name")
    @Expose
    private String name;

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
