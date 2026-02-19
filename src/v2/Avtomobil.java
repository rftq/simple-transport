package v2;

public class Avtomobil extends Transport {
    private int kolDverej;
    private boolean isAutoTransmission;

    public Avtomobil(String marka, int godVypuska, int skorost, int kolDverej, boolean isAutoTransmission) {
        super(marka, godVypuska, skorost);
        this.kolDverej = kolDverej;
        this.isAutoTransmission = isAutoTransmission;
        System.out.println("Количество дверей: " + kolDverej);
        System.out.println("Автоматическая трансмиссия: " + isAutoTransmission);
    }

    public int getKolDverej() {
        return kolDverej;
    }

    public void setKolDverej(int kolDverej) {
        this.kolDverej = kolDverej;
    }

    public boolean isAutoTransmission() {
        return isAutoTransmission;
    }

    public void setAutoTransmission(boolean autoTransmission) {
        this.isAutoTransmission = autoTransmission;
    }

    void signalit() {
        System.out.println("Биииип!");
    }

    @Override
    void ehat() {
        System.out.println("Автомобиль едет по дороге");
    }

    // Свой уникальный метод
    public void autoTransmission() {
        if (isAutoTransmission) {
            System.out.println(getMarka() + " едет на автомате!");
        } else {
            System.out.println(getMarka() + " едет на механике");
        }
    }

    // Переопределяем показ информации, добавляя свои данные
    @Override
    public void pokazatInfo() {
        super.pokazatInfo();  // Вызываем метод родителя
        System.out.println("Количество дверей: " + kolDverej);
        System.out.println("Автоматическая трансмиссия: " + (isAutoTransmission ? "Да" : "Нет"));
    }






}