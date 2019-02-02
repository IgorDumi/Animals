package animal;

public class Insect extends Animal {

    public int numberOfLegs = 6;

    @Override
    public void move() {
        System.out.println("Ptica leti.");
    }

    @Override
    public void eat() {
        System.out.println("Ptica kljuca.");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    
}
