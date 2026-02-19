package v1;

public class Samolet extends Transport {
    double maksVysota;

    void vzletat() {
        System.out.println("Самолёт взлетает!");
    }

    @Override
    void ehat() {
        System.out.println("Самолёт летит в небе");
    }
}