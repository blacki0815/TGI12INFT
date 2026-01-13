public class BankTransfer {
    public static void main(String[] args) {
        // Erzeugung der Objekte
        Person max = new Person("Max");
        Konto maxKonto = new Konto(1000);
        Transaktion transaktion = new Transaktion(max, maxKonto);

        // Aktionen
        transaktion.verarbeiten(200);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String gibName() {
        return name;
    }
}

class Konto {
    private double kontostand;

    public Konto(double kontostand) {
        this.kontostand = kontostand;
    }

    public void abheben(double betrag) {
        kontostand -= betrag;
    }

    public double gibKontostand() {
        return kontostand;
    }
}

class Transaktion {
    private Person person;
    private Konto konto;

    public Transaktion(Person person, Konto konto) {
        this.person = person;
        this.konto = konto;
    }

    public void verarbeiten(double betrag) {
        System.out.println(person.gibName() + " hebt " + betrag + " ab.");
        konto.abheben(betrag);
    }
}
