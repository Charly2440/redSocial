import java.util.ArrayList;
import java.util.Date;

public class Video extends Multimedia{
    private int frameRates;

    public Video() {
    }

    public Video(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios, String formato, int tamanio, String hipervinculo, int frameRates) {
        super(id, author, fechA, hora, hashtags, comentarios, formato, tamanio, hipervinculo);
        this.frameRates = frameRates;
    }

    public int getFrameRates() {
        return this.frameRates;
    }

    public void setFrameRates(int frameRates) {
        this.frameRates = frameRates;
    }

    public Video frameRates(int frameRates) {
        setFrameRates(frameRates);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Video)) {
            return false;
        }
        Video video = (Video) o;
        return frameRates == video.frameRates;
    }

    @Override
    public String toString() {
        return
            "------------------------------------\n" + getAuthor() +
            "\n" + getFechA() +
            "\n\n" + getHipervinculo() +
            "\n\nFrames Rate: " + getFrameRates() +
            "\nFormato: " + getFormato() + ", tamaño: " + getTamanio() + "Mb" +
            "\n" + getHashtags() +
            "\n" + getComentarios() + "\n-----------------------------------" ;
    }

}