import org.json.JSONObject;

public class apitester {
    public static void main(String[] args) {
        AsyncHttpClient client = new DefaultAsyncHttpClient();
        client.prepare("GET", "https://api-football-beta.p.rapidapi.com/timezone")
                .setHeader("X-RapidAPI-Key", "116d185a23mshac5af6394f28449p124b34jsn7b9fac59dca2")
                .setHeader("X-RapidAPI-Host", "api-football-beta.p.rapidapi.com")
                .execute()
                .toCompletableFuture()
                .thenAccept(System.out::println)
                .join();

        client.close();
    }
}
