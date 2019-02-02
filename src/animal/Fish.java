
package animal;


public class Fish extends Animal {
    
     public String reproduction = "caviar";
    public String outerCovering = "scales";

    @Override
    public void move() {
        System.out.println("Riba pliva.");
    }

    @Override
    public void eat() {
        System.out.println("Riba jede crvice.");
    }
    
       @Override
    public void info(){
        super.info();
        System.out.println("Reproduction: " + this.reproduction);
        System.out.println("Outer covering: " + this.outerCovering);
         System.out.println("");
    }
    
    
}
