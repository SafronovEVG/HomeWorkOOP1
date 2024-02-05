public class Cogtevran extends Hogwards {
    private int mind;
    private int wit;
    private int wisdom;
    private int creation;

    public Cogtevran(String name, String surName, int powerMagic, int transgressionDistance, int mind, int wit, int wisdom, int creation) {
        super(name, surName, powerMagic, transgressionDistance);
        if (mind < 0 || wit < 0 || wisdom < 0 || creation < 0) {
            throw new RuntimeException("Значение у - " + getName() + " меньше 0");
        } else if (mind > 100 || wit > 100 || wisdom > 100 || creation > 100) {
            throw new RuntimeException("Значение у - " + getName() + " больше 100");
        }
        this.mind = mind;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creation = creation;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurName() + " transgressionDistance - " + getTransgressionDistance() +
                " powerOfMagic - " + getPowerOfMagic() + " " +
                "Cogtevran{" +
                "mind=" + mind +
                ", wit=" + wit +
                ", wisdom=" + wisdom +
                ", creation=" + creation +
                '}';
    }

    public static void comparison(Cogtevran name1, Cogtevran name2) {
        int a = name1.creation+name1.mind+name1.wisdom+name1.wit;
        int b = name2.creation+ name2.mind+name2.wisdom+ name2.wit;
        if (a > b) {
            System.out.println(name1.getName()+" Лучший ученик по сравнению с - "+name2.getName());
        } else if (b>a){
            System.out.println(name2.getName()+" Лучший ученик по сравнению с - "+name1.getName());
        } else {
            System.out.println(name1.getName()+" и "+name2.getName()+" одинаковы на факультете");
        }
    }
}
