import main.java.creational.builder.BurgerBuilder;

public class App {
	public static void main(String[] args) 
    {
        BurgerBuilder b = new BurgerBuilder() ;
        b.addBread("Brown");
        b.addCheeze("Motzralla");
        b.addPatty("Veggie");
        b.addSauce("All");
        b.addVeggies("Pickles");

    }

	
}