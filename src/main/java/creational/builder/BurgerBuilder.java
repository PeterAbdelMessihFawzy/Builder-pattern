package main.java.creational.builder;
public class BurgerBuilder 
{
    private Burger burger;	

	public BurgerBuilder () { this.burger = new Burger(); }

 	public void addBread(String bread) { burger.setBread(bread); }

 	public void addPatty(String patty ) { burger.setPatty(patty); }

 	public void addVeggies(String veggies ) { burger.setVeggies(veggies ); }

 	public void addSauce(String sauce) { burger.setSauces(sauce); }

 	public void addCheeze( String cheeze) { burger.setWithExtraCheese(cheeze); }

 	public Burger build() { return this.burger; }
    
}
