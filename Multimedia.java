import java.util.ArrayList;
import java.util.Date;

public class Multimedia extends Post{
    protected String formato;
    protected int tamanio;
    protected String hipervinculo;

    public Multimedia() {
    }

    public Multimedia(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios, String formato, int tamanio, String hipervinculo) {
        super(tamanio, hipervinculo, fechA, hora, hashtags, comentarios);
        this.formato = formato;
        this.tamanio = tamanio;
        this.hipervinculo = hipervinculo;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getHipervinculo() {
        return this.hipervinculo;
    }

    public void setHipervinculo(String hipervinculo) {
        this.hipervinculo = hipervinculo;
    }

    public Multimedia formato(String formato) {
        setFormato(formato);
        return this;
    }

    public Multimedia tamanio(int tamanio) {
        setTamanio(tamanio);
        return this;
    }

    public Multimedia hipervinculo(String hipervinculo) {
        setHipervinculo(hipervinculo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Multimedia)) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
            " formato='" + getFormato() + "'" +
            ", tamanio='" + getTamanio() + "'" +
            ", hipervinculo='" + getHipervinculo() + "'" +
            "}";
    }

}
