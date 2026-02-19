package v2;

public class Main {
    public static void main(String[] args) {
        // Создаём автомобиль через конструктор
        Avtomobil toyota = new Avtomobil("Toyota", 2020, 220, 4, true);
        System.out.println();

        // Показываем информацию
        toyota.pokazatInfo();

        // Используем методы
        System.out.println("\n= Методы =");
        toyota.ehat();
        toyota.signalit();
        toyota.autoTransmission();

        // Используем сеттеры для изменения данных
        System.out.println("\n= Изменяем данные через сеттеры =");

        toyota.setGodVypuska(2025);
        System.out.println("Новый год выпуска: " + toyota.getGodVypuska());

        toyota.setMarka("");
        System.out.println("Новое название: " + toyota.getMarka());

        toyota.setAutoTransmission(false);
        System.out.print("Поменяли трансмиссию, теперь, ");
        toyota.autoTransmission();

        System.out.println("==========");



    }
}
