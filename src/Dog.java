public class Dog extends Animals{

    private int maxSwim;

    public Dog(String species, String color, String name, int maxRun, int maxSwim) {
        super(species, color, name, maxRun);
        this.maxSwim = maxSwim;
    }

    @Override
    public void swim(int swimDist) {

        if (swimDist <= maxSwim) {
            System.out.println(species + " " + name + " swim " + swimDist + "m");
        } else {
            System.out.println("Sorry, " + species + " " + name + " is not a Michael Phelps ");
        }
    }

}
