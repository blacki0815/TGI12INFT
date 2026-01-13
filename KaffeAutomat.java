enum KaffeZustand {
    BEREIT,
    KAFFE_WIRD_GEMACHT,
    FERTIG;

    public String getZustand() {
        switch (this) {
            case BEREIT:
                return "Der Automat ist bereit.";
            case KAFFE_WIRD_GEMACHT:
                return "Kaffe wird gemacht...";
            case FERTIG:
                return "Ihr Kaffe ist fertig!";
            default:
                return "";
        }
    }
}

public class KaffeAutomat {
    private KaffeZustand zustand;

    public KaffeAutomat() {
        this.zustand = KaffeZustand.FERTIG;
    }
    public void naechsterZustand() {
        switch (zustand) {
            case BEREIT:
                zustand = KaffeZustand.KAFFE_WIRD_GEMACHT;
                break;
            case KAFFE_WIRD_GEMACHT:
                zustand = KaffeZustand.FERTIG;
                break;
            case FERTIG:
                zustand = KaffeZustand.BEREIT;
                break;
        }
        System.out.println(zustand.getZustand());
    }

    public static void main (String[] args) {
        KaffeAutomat kaffeautomat = new KaffeAutomat();
        kaffeautomat.naechsterZustand();
        kaffeautomat.naechsterZustand();
        kaffeautomat.naechsterZustand();
        kaffeautomat.naechsterZustand();
    }
}