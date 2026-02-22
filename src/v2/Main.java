package v2;

public class Main {
    public static void main(String[] args) {
        // Создаём автомобиль через конструктор
        Avtomobil toyota = new Avtomobil("Toyota", 2020, 220, 4, true);
        System.out.println();

        Velosiped stels = new Velosiped("Stels", 2022, 30, 7, true);
        System.out.println();

        Samolet boeing = new Samolet("Boeing", 2018, 900, 11000, true);
        System.out.println();

        // Показываем информацию
        toyota.pokazatInfo();
        System.out.println();

        stels.pokazatInfo();
        System.out.println();

        boeing.pokazatInfo();

        // Используем методы
        System.out.println("\n= Методы =");
        toyota.checkAutoTransmission();
        toyota.ehat();
        toyota.signalit();
        toyota.ostanovitsya();

        System.out.println();

        stels.checkMountainVersion();
        stels.ehat();
        stels.krutitPedali();
        stels.ostanovitsya();

        System.out.println();

        boeing.checkIsPassengers();
        boeing.vzletat();
        boeing.ehat();
        boeing.ostanovitsya();

        // Используем сеттеры для изменения данных
        System.out.println("\n= Изменяем данные через сеттеры =");

        toyota.setGodVypuska(2025);
        System.out.println("Новый год выпуска: " + toyota.getGodVypuska());
        toyota.setMarka("");
        System.out.println("Новое название: " + toyota.getMarka());
        toyota.setAutoTransmission(false);
        System.out.print("Поменяли трансмиссию, теперь, ");
        toyota.checkAutoTransmission();

        System.out.println();

        stels.setGodVypuska(2026);
        System.out.println("Новый год выпуска: " + stels.getGodVypuska());
        stels.setMarka("BMX");
        System.out.println("Новое название: " + stels.getMarka());
        stels.setMountainVersion(false);
        System.out.print("Поменяли назначение, теперь, ");
        stels.checkMountainVersion();

    }
}
