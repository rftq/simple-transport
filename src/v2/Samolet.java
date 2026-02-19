package v2;

public class Samolet extends Transport {
    double maksVysota;

    public Samolet(String marka, int godVypuska, int skorost) {
        super(marka, godVypuska, skorost);
    }

    void vzletat() {
        System.out.println("Самолёт взлетает!");
    }

    @Override
    void ehat() {
        System.out.println("Самолёт летит в небе");
    }
}