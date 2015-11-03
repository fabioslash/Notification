package inspetor.pin.com.br.inspetorpublico.rest.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.api.rest.RestErrorHandler;
import org.springframework.core.NestedRuntimeException;

/**
 * Created by clail on 02/11/2015.
 */

@EBean
public class RequestErrorHandler implements RestErrorHandler {

    @RootContext
    Context context;

    @Override
    public void onRestClientExceptionThrown(NestedRuntimeException e) {

        /*System.out.println("*****************************");
        System.out.println(e.getMessage());
        System.out.println("*****************************");

        String[] mensagemArray = e.getMessage().split(" ");

        int responseCode = Integer.valueOf(mensagemArray[0]);*/
        Log.d("#", "Erro na conexão com o servidor: "+ e.getMessage());

    }

}
