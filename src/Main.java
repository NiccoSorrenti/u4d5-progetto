import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {

    System.out.println("REGISTRAZIONE AUDIO");
    //REGISTRAZIONE AUDIO
    RegistrazioneAudio registrazioneAudio = new RegistrazioneAudio("Titolo registrazione audio", 3, 4);
    registrazioneAudio.play();
    registrazioneAudio.abbassaVolume();
    registrazioneAudio.play();
    registrazioneAudio.alzaVolume();
    registrazioneAudio.play();

    System.out.println("\nVIDEO");
    //VIDEO
    Video video = new Video("Titolo video", 3, 4, 5);
    video.play();
    video.aumentaLuminosità();
    video.play();
    video.diminuisciLuminosità();
    video.play();

    System.out.println("\nIMMAGINE");
    //IMMAGINE
    Immagine immagine = new Immagine("Titolo immagine", 4);
    immagine.show();
    immagine.aumentaLuminosità();
    immagine.show();
    immagine.diminuisciLuminosità();
    immagine.show();


}
