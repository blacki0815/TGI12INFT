public class BuchAusleihen {
    public static void main(String[] args) {
        Leser anna = new Leser("Anna");
        Buch dieVerwandlung = new Buch("Die Verwandlung", "Franz Kafka");
        Ausleihe ausleihe = new Ausleihe(anna, dieVerwandlung);
        ausleihe.starten();
    }
}

class Leser {
    private String name;

    public Leser(String name) {
        this.name = name;
    }

    public String gibName() {
        return name;
    }
}

class Buch {
    private String titel;
    private String autor;

    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
    }

    public String gibTitel() {
        return titel;
    }

    public String gibAutor() {
        return autor;
    }
}

class Ausleihe {
    private Leser leser;
    private Buch buch;

    public Ausleihe(Leser leser, Buch buch) {
        this.leser = leser;
        this.buch = buch;
    }

    public void starten() {
        System.out.println(leser.gibName() + " leiht das Buch \"" + buch.gibTitel() + "\" von " + buch.gibAutor() + " aus.");
    }
}