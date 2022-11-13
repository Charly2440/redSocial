import java.util.ArrayList;
import java.util.Date;

public class Emoticon extends Post{
    private String emoticon;


    public Emoticon() {
    }

    public Emoticon(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios, String emoticon) {
        super(id, author, fechA, hora, hashtags, comentarios);
        this.emoticon = emoticon;
    }

    public String getEmoticon() {
        return this.emoticon;
    }

    public void setEmoticon(String emoticon) {
        this.emoticon = emoticon;
    }

    public Emoticon emoticon(String emoticon) {
        setEmoticon(emoticon);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Emoticon)) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return
            "------------------------------------\n" + getAuthor() +
            "\n" + getFechA() +
            "\n\n" + getEmoticon() +
            "\n\n" + getHashtags() +
            "\n" + getComentarios() + "\n-----------------------------------" ;
    }
}
