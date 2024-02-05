public class Hogwards {
    private String name;
    private String surName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwards(String name, String surName, int powerOfMagic, int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
        this.powerOfMagic = powerOfMagic;
        this.name = name;
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwards{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public static void comparison(Hogwards name1, Hogwards name2) {
        int a = name1.powerOfMagic+name1.transgressionDistance;
        int b = name2.powerOfMagic+ name2.transgressionDistance;
        if (a > b) {
            System.out.println(name1.getName()+" Лучший ученик по сравнению с - "+name2.getName());
        } else if (b>a){
            System.out.println(name2.getName()+" Лучший ученик по сравнению с - "+name1.getName());
        } else {
            System.out.println(name1.getName()+" и "+name2.getName()+" одинаковы на факультете");
        }
    }
}
