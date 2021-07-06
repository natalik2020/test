import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOExeption;

public class Main {
    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();

Request request = new Request.Builder()
        .url("https://icanhazdadjoke.com/")
        .header("Accept", "Accept: application/json")
        .build();

Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
