package animal;

public class Eagle extends Bird {
    
    private String name = "Orao";
    private int lifespan = 15;
    
    public void info(){
        super.info();
        System.out.println("Naziv ptice je: " + this.name);
        System.out.println("Zivotni vek je: " + this.lifespan);
        System.out.println("");
    }
    
}
