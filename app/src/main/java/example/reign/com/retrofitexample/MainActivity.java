package example.reign.com.retrofitexample;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NetworkTaskService apiService = ApiClient.getClient(this).create(NetworkTaskService.class);

        Call<WordsResponse> call = apiService.fetchChapters();
        call.enqueue(new Callback<WordsResponse>() {
            @Override
            public void onResponse(Call<WordsResponse> call, Response<WordsResponse> response) {
                int statusCode = response.code();
                List<Words> movies = response.body().getWords();
                Log.e("onResponse: ", movies.size() + "");

            }

            @Override
            public void onFailure(Call<WordsResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e("onFailure: ", t.toString());

            }
        });


        setData(apiService);
    }


    private void setData(NetworkTaskService taskService) {
        Call<TitleResponse> call = taskService.getAllTitileList("facts");
        call.enqueue(new Callback<TitleResponse>() {
            @Override
            public void onResponse(Call<TitleResponse> call, Response<TitleResponse> response) {
                int statusCode = response.code();
                List<Titile> movies = response.body().getEssaysWord();
                Log.e("onResponses: ", movies.size() + "");

            }

            @Override
            public void onFailure(Call<TitleResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e("onFailure: ", t.toString());

            }
        });

    }


}
