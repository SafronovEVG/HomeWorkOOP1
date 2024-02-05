public class Slizorin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizorin(String name, String surName, int powerMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surName, powerMagic, transgressionDistance);
        if (cunning < 0 || determination < 0 || ambition < 0 || resourcefulness < 0 || lustForPower < 0) {
            throw new RuntimeException("Значение умения у - " + getName() + " отрицательное");
        } else if (cunning > 100 || determination > 100 || ambition > 100 || resourcefulness > 100 || lustForPower > 100) {
            throw new RuntimeException("Значиние умения у " + getName() + " больше 100");
        }
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurName() + " transgressionDistance - " + getTransgressionDistance() +
                " powerOfMagic - " + getPowerOfMagic() + " " +
                "Slizorin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';

    }

    public static void comparison(Slizorin name1, Slizorin name2) {
        int b = name2.getCunning()+name2.getDetermination()+name2.getAmbition()+name2.getResourcefulness()+name2.getLustForPower();
        int a = name1.getCunning()+name1.getDetermination()+name1.getAmbition()+name1.getResourcefulness()+name1.getLustForPower();
        if (a > b) {
            System.out.println(name1.getName()+" Лучший ученик по сравнению с - "+name2.getName());
        } else if (b>a){
            System.out.println(name2.getName()+" Лучший ученик по сравнению с - "+name1.getName());
        } else {
            System.out.println(name1.getName()+" и "+name2.getName()+" одинаковы на факультете");
        }

    }
}


