package v1;

public class Avtomobil extends Transport {
    int kolDverej;

    void signalit() {
        System.out.println("Биииип!");
    }

    @Override
    void ehat() {
        System.out.println("Автомобиль едет по дороге");
    }
}