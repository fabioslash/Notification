package inspetor.pin.com.br.inspetorpublico.controllers;

import com.j256.ormlite.dao.Dao;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.OrmLiteDao;
import org.androidannotations.annotations.rest.RestService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import inspetor.pin.com.br.inspetorpublico.database.DatabaseHelper;
import inspetor.pin.com.br.inspetorpublico.model.Denuncia;
import inspetor.pin.com.br.inspetorpublico.rest.DenunciaService;
import inspetor.pin.com.br.inspetorpublico.rest.utils.RequestErrorHandler;

/**
 * Created by clail on 16/10/2015.
 */

@EBean
public class DenunciaController {

    @RestService
    DenunciaService denunciaService;

    @OrmLiteDao(helper = DatabaseHelper.class, model = Denuncia.class)
    Dao<Denuncia, Long> denunciaDao;

    @Bean
    RequestErrorHandler requestErrorHandler;


    @AfterInject
    public void afterInject() {
        denunciaService.setRestErrorHandler(requestErrorHandler);
    }


    public void fetchDenuncias() {
        List<Denuncia> denuncias = denunciaService.getDenuncias();

        if (denuncias == null || denuncias.size() == 0) {
            return;
        }

        for (Denuncia item : denuncias) {
            try {
                denunciaDao.createOrUpdate(item);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public List<Denuncia> getDenunciasDB() {
        List<Denuncia> denuncias = new ArrayList<>();
        try {
            denuncias =  denunciaDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return denuncias;
    }


}
