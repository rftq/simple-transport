package v1;

public class Main {
    public static void main(String[] args) {
        Avtomobil toyota = new Avtomobil();
        toyota.marka = "Toyota";
        toyota.godVypuska = 2020;
        toyota.skorost = 220;
        toyota.pokazatInfo();
        toyota.ehat();
        toyota.signalit();

        System.out.println("==========");

        Velosiped stels = new Velosiped();
        stels.marka = "Stels";
        stels.godVypuska = 2022;
        stels.skorost = 30;
        stels.pokazatInfo();
        stels.ehat();
        stels.krutitPedali();

        System.out.println("==========");

        Samolet boeing = new Samolet();
        boeing.marka = "Boeing";
        boeing.godVypuska = 2018;
        boeing.skorost = 900;
        boeing.pokazatInfo();
        boeing.ehat();
        boeing.vzletat();

        System.out.println("==========");

        // Бонусное задание:
        // Создай массив из всех трёх транспортов и в цикле вызови для каждого метод ehat().
        // Увидишь полиморфизм в действии!
        Transport[] transports = new Transport[3];
        transports[0] = new Avtomobil();
        transports[1] = new Velosiped();
        transports[2] = new Samolet();

        // Каждый транспорт будет двигаться по-своему
        for (Transport tr : transports) {
            tr.ehat();
        }

    }
}
