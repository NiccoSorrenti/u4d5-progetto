package entities;

import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int luminosità;

    public Video(String titolo, int volume, int luminosità) {
        super(titolo);
        this.volume = volume;
        this.luminosità = luminosità;
    }


    @Override
    public void play() {

    }
}
