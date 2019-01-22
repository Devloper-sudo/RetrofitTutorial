package example.reign.com.retrofitexample;


import android.database.Observable;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NetworkTaskService {



//    @POST("webservices/ins_userinfo.php")
//    @FormUrlEncoded
//    Single<UserInformation> insertUserInformation(@Field("fname") String firstName, @Field("lname") String lastName, @Field("email") String emailId, @Field("mobilenum") String mobileNume, @Field("exam_id") String examId);


//    @GET("webservices/get_all_subject.php?exam_id=" + Constants.GRE_EXAM_ID)
//    Single<SubjectResponse> fetchSubjects();
//
//
//
//
//
    @GET("webservices/get_all_words.php?start=2&&end=3681")
    Call<WordsResponse> fetchChapters();

//
//    @POST("webservices/get_all_question.php")
//    @FormUrlEncoded
//    Observable<QuestionsResponse> fetchAllQuestions(@Field("sub_id") int subjectId, @Field("chap_id") int chapId, @Field("diff_mode") int difficultmode, @Field("exam_id") int examId);
//
//
//    @POST("webservices/get_all_comprehension.php")
//    @FormUrlEncoded
//    Observable<ParagraphResponse> fetchAllParagraphs(@Field("sub_id") int subjectId, @Field("exam_id") int examId);
//
//
//    @POST("webservices/get_all_comprehension_question.php")
//    @FormUrlEncoded
//    Observable<ParagraphResponse.ParagraphQuestionsResponse> fetchAllParagraphsQuestions(@Field("sub_id") int subjectId, @Field("exam_id") int examId);
//
//
//    @GET("webservices/get_all_words.php?start=2&&end=3681")
//    Maybe<WordsResponse> getAllWordsOne();
//
//
//
//    @GET("webservices/get_all_essay_category.php")
//    Maybe<CategoryResponse> getAllCategoryList();
//
//
    @POST("webservices/get_all_essay_title.php")
    @FormUrlEncoded
    Call<TitleResponse> getAllTitileList(@Field("category") String category);

//
//    @POST("webservices/get_all_essay.php")
//    @FormUrlEncoded
//    Maybe<EssayResponse> getEssayOneByeOne(@Field("category") String category, @Field("id") int id);



}
