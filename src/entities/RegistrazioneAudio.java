package entities;

import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume));
        }
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", volume=" + volume +
                '}';
    }
}
