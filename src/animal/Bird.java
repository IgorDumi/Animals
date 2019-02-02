package animal;

public class Bird extends Animal {

    private String reproduction = "egg";
    private String outerCovering = "feather";
    private Insect favouriteInsert;
    
    
    
    @Override
    public void move() {
        System.out.println("Ptica leti.");
    }

    @Override
    public void eat() {
        System.out.println("Ptica kljuca.");
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Reproduction: " + this.reproduction);
        System.out.println("Outer covering: " + this.outerCovering);
         System.out.println("");
         
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }

    public Insect getFavouriteInsert() {
        return favouriteInsert;
    }

    public void setFavouriteInsert(Insect favouriteInsert) {
        this.favouriteInsert = favouriteInsert;
    }
    
  
    
}
