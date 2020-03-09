import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;


public class Main {

    public static void main(String[] args)throws Exception {
        while (true){
            String host = "https://currency-exchange.p.rapidapi.com/exchange?q=1&from=USD&to=PLN";
        String key = "d2d5e20ebamsh507d94fdb99fa06p1bb91fjsnd4b25fbb5622";
        HttpResponse<String> response = Unirest.get(host)
                .header("x-rapidapi-host", "currency-exchange.p.rapidapi.com")
                .header("x-rapidapi-key", key)
                .asString();
        System.out.println(response.getStatus());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
    }

            }

    }


