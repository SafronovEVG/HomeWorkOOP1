import jdk.dynalink.linker.ConversionComparator;

public class Grifindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String name, String surName, int powerMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surName, powerMagic, transgressionDistance);
        if (nobility < 0 || honor < 0 || bravery < 0) {
            throw new RuntimeException("Значение у - " + getName() + " меньше 0");
        } else if (nobility > 100 || honor > 100 || bravery > 100) {
            throw new RuntimeException("Значение у - " + getName() + " больше 100");
        }
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurName() + " transgressionDistance - " + getTransgressionDistance() +
                " powerOfMagic - " + getPowerOfMagic() + " " +
                "Grifindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public static void comparison(Grifindor name1, Grifindor name2) {
        int a = name1.bravery+name1.honor+ name1.nobility;
        int b = name2.bravery+ name2.honor+ name2.nobility;
        if (a > b) {
            System.out.println(name1.getName()+" Лучший ученик по сравнению с - "+name2.getName());
        } else if (b>a){
            System.out.println(name2.getName()+" Лучший ученик по сравнению с - "+name1.getName());
        } else {
            System.out.println(name1.getName()+" и "+name2.getName()+" одинаковы на факультете");
        }
    }
}
