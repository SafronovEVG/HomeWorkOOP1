public class Main {
    public static void main(String[] args) {
        Slizorin Germiona = new Slizorin("Germiona", "Granger", 11, 11, 11, 11, 11, 11, 11);
        Slizorin Harry = new Slizorin("Harry", "Pother", 11, 11, 11, 11, 11, 11, 11);
        Cogtevran Czhoy = new Cogtevran("Czhoy", "Chang", 55, 55, 55, 55, 55, 55);
        Cogtevran Padma = new Cogtevran("Padma", "Patil", 45, 55, 45, 55, 55, 55);
        Cogtevran.comparison(Czhoy, Padma);
        Hogwards.comparison(Germiona, Padma);
    }
}