package inspetor.pin.com.br.inspetorpublico.rest;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.List;

import inspetor.pin.com.br.inspetorpublico.model.Denuncia;
import inspetor.pin.com.br.inspetorpublico.rest.utils.RequestInterceptor;
import inspetor.pin.com.br.inspetorpublico.rest.utils.RequestPath;

/**
 * Created by clail on 16/10/2015.
 */

@Rest(rootUrl = RequestPath.ROOT_URL, converters = {GsonHttpMessageConverter.class}, interceptors = {RequestInterceptor.class})
public interface DenunciaService {

    @Get(RequestPath.GET_OBRA)
    @Accept(MediaType.APPLICATION_JSON)
    public List<Denuncia> getDenuncias();

}
