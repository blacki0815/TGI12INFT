interface Telefonierbar {
    void telefonieren();
}

interface Internetfaehig {
    int MAX_INTERNETGESCHWINDIGKEIT = 100;
    void insInternetGehen();
}

class Handy implements Telefonierbar, Internetfaehig {
    @Override
    void telefonieren()
    void insInternetGehen();
    System.out.println("Das Handy kann telefonieren und ins Internet gehen.");
}

class Notebook implements Internetfaehig {
    @Override
    void insInternetGehen();
    System.out.println("Das Notebook geht mit einer Geschwindigkeit von 100 Mbit/s ins Internet.");
}

class FestnetzTelefon implements Telefonierbar {
    @Override
    void telefonieren();
    System.out.println("Das Festnetztelefon telefoniert.");
}