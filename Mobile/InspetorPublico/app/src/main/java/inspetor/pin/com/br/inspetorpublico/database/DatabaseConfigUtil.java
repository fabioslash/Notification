package inspetor.pin.com.br.inspetorpublico.database;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

/**
 * Created by clail on 23/10/2015.
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    public static void main(String[] args) throws Exception {
        writeConfigFile("ormlite_config.txt");
    }

}
