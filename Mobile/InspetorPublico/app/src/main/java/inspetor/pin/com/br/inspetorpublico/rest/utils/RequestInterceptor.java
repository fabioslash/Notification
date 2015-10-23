package inspetor.pin.com.br.inspetorpublico.rest.utils;

import android.util.Log;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * Created by clail on 18/10/2015.
 */
public class RequestInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        Log.d("#", "------------Request Interceptor----------");
        String stringBody = new String(body);
        Log.d("#", "Body: "+ stringBody);
        Log.d("#", "------------Fim Request Interceptor----------");

        return execution.execute(request, body);

    }

}
