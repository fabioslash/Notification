package inspetor.pin.com.br.inspetorpublico.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import inspetor.pin.com.br.inspetorpublico.R;
import inspetor.pin.com.br.inspetorpublico.model.Denuncia;
import inspetor.pin.com.br.inspetorpublico.model.Patrocinador;

/**
 * Created by clail on 23/10/2015.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NOME = "inspetorpublic.db";
    private static final int DATABASE_VERSION = 1;

    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NOME, null, DATABASE_VERSION, R.raw.ormlite_config);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Denuncia.class);
            TableUtils.createTable(connectionSource, Patrocinador.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Denuncia.class, true);
            TableUtils.dropTable(connectionSource, Patrocinador.class, true);
            onCreate(database, connectionSource);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
