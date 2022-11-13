import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Post {
    protected int id;
    protected String author;
    protected Date fecha;
    protected int hora;
    protected ArrayList<String> hashtags;
    protected ArrayList<String> comentarios;

    public Post() {
        this.id = new Random().nextInt(100, 900) ;
    }

    public Post(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios) {
        this.id = id ;
        this.author = author;
        this.fecha = fechA;
        this.hora = hora;
        this.hashtags = hashtags;
        this.comentarios = comentarios;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getFechA() {
        return this.fecha;
    }

    public void setFechA(Date fechA) {
        this.fecha = fechA;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ArrayList<String> getHashtags() {
        return this.hashtags;
    }

    public void setHashtags(ArrayList<String> hashtags) {
        this.hashtags = hashtags;
    }

    public ArrayList<String> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public Post id(int id) {
        setId(id);
        return this;
    }

    public Post author(String author) {
        setAuthor(author);
        return this;
    }

    public Post fechA(Date fechA) {
        setFechA(fechA);
        return this;
    }

    public Post hora(int hora) {
        setHora(hora);
        return this;
    }

    public Post hashtags(ArrayList<String> hashtags) {
        setHashtags(hashtags);
        return this;
    }

    public Post comentarios(ArrayList<String> comentarios) {
        setComentarios(comentarios);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Post)) {
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", author='" + getAuthor() + "'" +
            ", fechA='" + getFechA() + "'" +
            ", hora='" + getHora() + "'" +
            ", hashtags='" + getHashtags() + "'" +
            ", comentarios='" + getComentarios() + "'" +
            "}";
    }

}
