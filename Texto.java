import java.util.ArrayList;
import java.util.Date;

public class Texto extends Post{
    private String texto;


    public Texto() {
    }

    public Texto(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios, String texto) {
        super(id, author, fechA, hora, hashtags, comentarios);
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Texto texto(String texto) {
        setTexto(texto);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Texto)) {
            return false;
        }
        return false;  
    }

    @Override
    public String toString() {
        return
            "------------------------------------\n" + getAuthor() +
            "\n" + getFechA() +
            "\n\n" + getTexto() +
            "\n\n" + getHashtags() +
            "\n" + getComentarios() + "\n-----------------------------------" ;
    }
}
