import java.util.ArrayList;
import java.util.Date;

public class Audio extends Multimedia{
    private float SampleRate;
    private int bigDepth;

    public Audio() {
    }

    public Audio(int id, String author, Date fechA, int hora, ArrayList<String> hashtags, ArrayList<String> comentarios, String formato, int tamanio, String hipervinculo, float SampleRate, int bigDepth) {
        super(id, author, fechA, hora, hashtags, comentarios, formato, tamanio, hipervinculo);
        this.SampleRate = SampleRate;
        this.bigDepth = bigDepth;
    }

    public float getSampleRate() {
        return this.SampleRate;
    }

    public void setSampleRate(float SampleRate) {
        this.SampleRate = SampleRate; 
    }

    public int getBigDepth() {
        return this.bigDepth;
    }

    public void setBigDepth(int bigDepth) {
        this.bigDepth = bigDepth;
    }

    public Audio SampleRate(float SampleRate) {
        setSampleRate(SampleRate);
        return this;
    }

    public Audio bigDepth(int bigDepth) {
        setBigDepth(bigDepth);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) o;
        return SampleRate == audio.SampleRate && bigDepth == audio.bigDepth;
    }

    @Override
    public String toString() {
        return
            "------------------------------------\n" + getAuthor() +
            "\n" + getFechA() +
            "\n\n" + getHipervinculo() +
            "\n\nSample Rate: " + getSampleRate() + ", " + "Big Depth" + getBigDepth() +
            "\nFormato: " + getFormato() + ", tamaño: " + getTamanio() + "Mb" +
            "\n" + getHashtags() +
            "\n" + getComentarios() + "\n-----------------------------------" ;
    }

}
