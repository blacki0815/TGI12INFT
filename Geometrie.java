public class Geometrie {

    double berechneFlache(double seitenlaenge) {
        return seitenlaenge * seitenlaenge;
     }

    double berechneFlache(double laenge, double breite) {
        return laenge * breite;
    }

    double berechneFlache(double radius, boolean kreis) {
        if (kreis) {
            return Math.PI * radius * radius;
        }
        return 0;
    }

    double berechneFlache(double grundlinie, double hoehe, String dreieck) {
        if ("Dreieck".equalsIgnoreCase(dreieck)) {
            return 0.5 * grundlinie * hoehe;
        }   
        return 0;
    }

    public static void main(String[] args) {
        Geometrie g = new Geometrie();
        System.out.println("Quadrat (Seite 5): " + g.berechneFlache(5));
        System.out.println("Rechteck (4x6): " + g.berechneFlache(4, 6));
        System.out.println("Kreis (Radius 4): " + g.berechneFlache(3, true));
        System.out.println("Dreieck (Grundlinie 4, Höhe 5): " + g.berechneFlache(4, 5, "Dreieck"));   
    }
}