package v1;

public class Velosiped extends Transport {
    int kolPeredach;

    void krutitPedali() {
        System.out.println("Кручу педали!");
    }

    @Override
    void ehat() {
        System.out.println("Велосипед едет по велодорожке");
    }
}