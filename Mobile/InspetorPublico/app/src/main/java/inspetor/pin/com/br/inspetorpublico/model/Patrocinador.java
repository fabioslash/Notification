package inspetor.pin.com.br.inspetorpublico.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by clail on 16/10/2015.
 */

@DatabaseTable
public class Patrocinador {

    @DatabaseField(id = true)
    private String id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private String logo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


}
