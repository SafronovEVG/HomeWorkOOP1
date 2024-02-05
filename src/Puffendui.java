public class Puffendui extends Hogwards {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, String surName, int powerMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, surName, powerMagic, transgressionDistance);
        if (hardWork < 0 || loyalty < 0 || honesty < 0) {
            throw new RuntimeException("Значение у - " + getName() + " меньше 0");
        } else if (hardWork > 100 || loyalty > 100 || honesty > 100) {
            throw new RuntimeException("Значение у - " + getName() + " больше 100");
        }
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurName() + " transgressionDistance - " + getTransgressionDistance() +
                " powerOfMagic - " + getPowerOfMagic() + " " +
                "Puffendui{" +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public static void comparison(Puffendui name1, Puffendui name2) {
        int a = name1.hardWork+ name1.honesty+name1.loyalty;
        int b = name2.hardWork+ name2.honesty+ name2.loyalty;
        if (a > b) {
            System.out.println(name1.getName()+" Лучший ученик по сравнению с - "+name2.getName());
        } else if (b>a){
            System.out.println(name2.getName()+" Лучший ученик по сравнению с - "+name1.getName());
        } else {
            System.out.println(name1.getName()+" и "+name2.getName()+" одинаковы на факультете");
        }
    }
}
