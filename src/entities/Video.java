package entities;

import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int luminosità;
    private int durata;

    public Video(String titolo, int volume, int luminosità, int durata) {
        super(titolo);
        this.volume = volume;
        this.luminosità = luminosità;
        this.durata = durata;
    }

    public void aumentaLuminosità() {
        luminosità++;
    }

    public void diminuisciLuminosità() {
        luminosità--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosità));
        }
    }
}
