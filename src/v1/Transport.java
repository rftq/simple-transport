package v1;

public class Transport {
    String marka;
    int godVypuska;
    int skorost;

    void ehat() {
        System.out.println("Транспорт едет");
    }

    void ostanovitsya() {
        System.out.println("Транспорт остановился");
    }

    void pokazatInfo() {
        System.out.println(marka + ", " + godVypuska + ", " + skorost);
    }
}