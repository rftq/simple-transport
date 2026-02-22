package v2;

public class Samolet extends Transport {
    double maksVysota;
    private boolean isPassengers;

    public Samolet(String marka, int godVypuska, int skorost, double maksVysota, boolean isPassengers) {
        super(marka, godVypuska, skorost);
        this.maksVysota = maksVysota;
        this.isPassengers = isPassengers;
        System.out.println("Максимальная высота: " + maksVysota);
        System.out.println("Пассажирский : " + isPassengers);
    }

    public double getMaksVysota() {
        return maksVysota;
    }

    public void setMaksVysota(double maksVysota) {
        this.maksVysota = maksVysota;
    }

    public boolean isPassengers() {
        return isPassengers;
    }

    public void setPassengers(boolean passengers) {
        isPassengers = passengers;
    }

    void vzletat() {
        System.out.println("Самолёт взлетает!");
    }

    @Override
    void ehat() {
        System.out.println("Самолёт летит в небе");
    }
    @Override
    void ostanovitsya() {
        System.out.println("Самолёт совершил посадку в аэропорту");
    }

    // Свой уникальный метод
    public void checkIsPassengers() {
        if (isPassengers) {
            System.out.println(getMarka() + " пассажирский самолёт");
        } else {
            System.out.println(getMarka() + " не пассажирский самолёт");
        }
    }

    // Переопределяем показ информации, добавляя свои данные
    @Override
    public void pokazatInfo() {
        super.pokazatInfo();  // Вызываем метод родителя
        System.out.println("Максимальная высота: " + maksVysota);
        System.out.println("Пассажирский : " + (isPassengers ? "Да" : "Нет"));
    }

}