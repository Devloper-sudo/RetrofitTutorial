package example.reign.com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TitleResponse {

    @SerializedName("essays_word")
    @Expose
    private List<Titile> essaysWord = null;

    public List<Titile> getEssaysWord() {
        return essaysWord;
    }

    public void setEssaysWord(List<Titile> essaysWord) {
        this.essaysWord = essaysWord;
    }

}
