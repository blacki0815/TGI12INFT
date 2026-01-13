interface Schwimmfaehig {
    void schwimmen();
}

interface Fahrbar {
    int MAX_HOECHSTGESCHWINDIGKEIT = 250;
    void fahren();
}

interface schwimmbar {
    void schwimmen();
}

class Amphibienfahrzeug implements Fahrbar, Schwimmfaehig {
    @Override
    void fahren() {
        System.out.println("Es kann fahren");
    }
    @Override
    void schwimmen() {
        System.out.println("Es kann schwimmen");
    }
}

class Auto implements Fahrbar {
    @Override
    void fahren() {
        System.out.println("Es kann fahren");
    }
}

class Boot implements Schwimmfaehig {
    @Override 
    void schwimmen() {
        System.out.println("Es kann schwimmen");
    }
}