enum JahreszeitMomentan {
    FRUEHLING,
    SOMMER,
    HERBST,
    WINTER;

    public String getBeschreibung() {
        switch (this) {
            case FRUEHLING:
                return "Die Natur erwacht, und die Blumen beginnen zu blühen.";
            case SOMMER:
                return "Es ist heiß und die Sonne scheint lange.";
            case HERBST:
                return "Die Blätter fallen und es wird kühler.";
            case WINTER:
                return "Es ist kalt und manchmal schneit es.";
            default:
                return "";
        }
    }
}

public class Jahreszeit {
    private JahreszeitMomentan momentan;

    public Jahreszeit() {
        this.momentan = JahreszeitMomentan.WINTER;
    }
    public void naechsteJahreszeit() {
        switch (momentan) {
            case WINTER:
                momentan = JahreszeitMomentan.FRUEHLING;
                break;
            case FRUEHLING:
                momentan = JahreszeitMomentan.SOMMER;
                break;
            case SOMMER:
                momentan = JahreszeitMomentan.HERBST;
                break;
            case HERBST:
                momentan = JahreszeitMomentan.WINTER;
                break;
        }
        System.out.println("Jahreszeit: " + momentan);
        System.out.println("Beschreibung: " + momentan.getBeschreibung());
    }
    public static void main (String[] args) {
        Jahreszeit jahreszeit = new Jahreszeit();
        jahreszeit.naechsteJahreszeit();
        jahreszeit.naechsteJahreszeit();
        jahreszeit.naechsteJahreszeit();
        jahreszeit.naechsteJahreszeit();
    }
}
