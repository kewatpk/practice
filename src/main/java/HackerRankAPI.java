import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class HackerRankAPI {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        System.out.println(getAverageTemperatureForUser(1));
    }

    public static String getAverageTemperatureForUser(int userId) throws IOException, URISyntaxException, InterruptedException {
        String avgTemp = null;
        String url ="https://jsonmock.hackerrank.com/api/medical_records?userId=" + String.valueOf(userId);
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
        HttpResponse<String > response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();
        JSONObject result= new JSONObject(responseBody);
        int numofPages = result.getInt("total_pages");
        List<Double> temp = new ArrayList<>();
        for (int i = 1; i <= numofPages; i++) {
            String  newUrl = url + "&page=" + String.valueOf(i);
            HttpRequest request1 = HttpRequest.newBuilder().uri(new URI(newUrl)).GET().build();
            HttpResponse<String> response1 = HttpClient.newHttpClient().send(request1, HttpResponse.BodyHandlers.ofString());
            String responseBody1 = response1.body();
            JSONObject result1= new JSONObject(responseBody1);
            JSONArray data = result1.getJSONArray("data");
            for (int j = 0; j < data.length(); j++) {
                JSONObject records = data.getJSONObject(j);
                JSONObject vitals = records.getJSONObject("vitals");
                Double t = vitals.getDouble("bodyTemperature");
                temp.add(t);
            }
        }

        Double finaltemp = temp.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        avgTemp = String.format("%.2f", finaltemp);

        return avgTemp;
    }

}
