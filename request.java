import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * java 调用 0.zone api（信息系统）示例
 */
public class HttpClient_Post_Sync_Call_Java11 {
    public void createEmployee() throws IOException, InterruptedException {
        String postEndpoint = "https://0.zone/api/data/";
        String inputJson = "{\"query\": \"00sec\", \"query_type\":\"site\", \"page\":1, \"pagesize\":10,\"zone_key_id\":\"xxxxxx\"}";
        var request = HttpRequest.newBuilder()
            .uri(URI.create(postEndpoint))
            .header("Content-Type", "application/json;charset=utf8;")
            .POST(HttpRequest.BodyPublishers.ofString(inputJson))
            .build();
        var client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}