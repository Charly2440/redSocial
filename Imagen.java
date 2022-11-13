import java.util.ArrayList;
import java.util.Date;

public class Imagen extends Multimedia{
    private String resolucion;

    public Imagen() {
    }

    public Imagen(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios, String formato, int tamanio, String hipervinculo, String resolucion) {
        super(id, author, fechA, hora, hashtags, comentarios, formato, tamanio, hipervinculo);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public Imagen resolucion(String resolucion) {
        setResolucion(resolucion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Imagen)) {
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return
            "------------------------------------\n" + getAuthor() +
            "\n" + getFechA() +
            "\n\n" + getHipervinculo() +
            "\n\nResolución: " + getResolucion() +
            "\nFormato: " + getFormato() + ", tamaño: " + getTamanio() + "Mb" +
            "\n" + getHashtags() +
            "\n" + getComentarios() + "\n-----------------------------------" ;
    }

}
