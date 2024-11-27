public class Main {
    public static void main(String[] args) {
        // Testen des Polymorphismus
        Vogel meinVogel = new Vogel();
        meinVogel.fliegen(); // Ausgabe: "Ein Vogel fliegt."

        Vogel meineEnte = new Ente();
        meineEnte.fliegen(); // Ausgabe: "Eine Ente fliegt."

        Vogel meinHuhn = new Huhn();
        meinHuhn.fliegen(); // Ausgabe: "Ein Huhn kann nur ein bisschen flattern."


        Ente echteEnte = new Ente();
        echteEnte.schwimmen(); // Ausgabe: "Eine Ente schwimmt."

        Huhn echtesHuhn = new Huhn();
        echtesHuhn.gackern(); // Ausgabe: "Ein Huhn gackert."
    }
}