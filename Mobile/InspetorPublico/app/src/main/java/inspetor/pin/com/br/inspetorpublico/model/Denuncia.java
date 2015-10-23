package inspetor.pin.com.br.inspetorpublico.model;

import android.graphics.Bitmap;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by clail on 12/10/2015.
 */

@DatabaseTable
public class Denuncia {

    @DatabaseField(id = true)
    private String id;
    @DatabaseField
    private String descricao;
    @DatabaseField
    private String valor;
    @DatabaseField
    private String cidade;
    @DatabaseField
    private String estado;
    @DatabaseField
    private String objetivo;
    @DatabaseField(foreign = true, canBeNull = false, foreignAutoRefresh = true, columnName = "idPatrocinador")
    private Patrocinador patrocinador;
    @DatabaseField
    private String dataInicio;
    @DatabaseField
    private String dataFim;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }


}
