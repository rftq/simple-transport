package v2;

public class Velosiped extends Transport {
    private int kolPeredach;
    private boolean isMountainVersion;

    public int getKolPeredach() {
        return kolPeredach;
    }

    public void setKolPeredach(int kolPeredach) {
        this.kolPeredach = kolPeredach;
    }

    public boolean isMountainVersion() {
        return isMountainVersion;
    }

    public void setMountainVersion(boolean mountainVersion) {
        isMountainVersion = mountainVersion;
    }

    public Velosiped(String marka, int godVypuska, int skorost, int kolPeredach, boolean isMountainVersion) {
        super(marka, godVypuska, skorost);
        this.kolPeredach = kolPeredach;
        this.isMountainVersion = isMountainVersion;
        System.out.println("Количество передач: " + kolPeredach);
        System.out.println("Горный велосипед : " + isMountainVersion);
    }

    void krutitPedali() {
        System.out.println("Кручу педали!");
    }

    @Override
    void ehat() {
        System.out.println("Велосипед едет по велодорожке");
    }
}