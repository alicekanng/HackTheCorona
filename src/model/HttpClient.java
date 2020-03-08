package model;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClient {

    public final CloseableHttpClient httpClient = HttpClients.createDefault();

    public void placeSearch (String placeName) throws Exception {
        URIBuilder builder = new URIBuilder("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?");
        builder.setParameter("input", placeName)
                .setParameter("inputtype" , "textquery")
                .setParameter("fields", "formatted_address,name,geometry")
                .setParameter("key", "AIzaSyAZg7MZ9kwk47HDaNATzBIsceXCAl4gBKc");
        HttpGet request = new HttpGet(builder.build());
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            //System.out.println(response.getStatusLine().toString());
            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);
            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }

        }

    }
}
