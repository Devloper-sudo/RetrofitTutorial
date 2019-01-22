package example.reign.com.retrofitexample;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.io.Serializable;


public class Words implements Serializable {




    private int id;


    @SerializedName("word")
    @Expose
    private String word;
    @SerializedName("meaning")
    @Expose
    private String meaning;
    @SerializedName("paragraph")
    @Expose
    private String paragraph;


//    private boolean favourite;
//    public void setFavourite(boolean favourite) {
//        this.favourite = favourite;
//    }
//
//
//    public boolean isFavourite() {
//        return favourite;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

}
