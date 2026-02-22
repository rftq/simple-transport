package v2;

public class Transport {
    String marka;
    int godVypuska;
    int skorost;

    public Transport(String marka, int godVypuska, int skorost) {
        this.marka = marka;
        this.godVypuska = godVypuska;
        this.skorost = skorost;
        System.out.println("Создан транспорт: " + marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka != null && !marka.isEmpty()) {
            this.marka = marka;
        } else {
            System.out.println("Ошибка: марка не может быть без названия!");
        }
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        if (godVypuska > 0 && godVypuska <= 2026) {
            this.godVypuska = godVypuska;
        } else {
            System.out.println("Ошибка: некорректный год выпуска!");
        }
    }

    public int getSkorost() {
        return skorost;
    }

    public void setSkorost(int skorost) {
        this.skorost = skorost;
    }

    void ehat() {
        System.out.println("Транспорт едет");
    }

    void ostanovitsya() {
        System.out.println("Транспорт остановился");
    }

    void pokazatInfo() {
        System.out.println("= Информация =");
        System.out.println("Марка: " + marka);
        System.out.println("Год выпуска: " + godVypuska);
        System.out.println("Скорость: " + skorost);
    }
}