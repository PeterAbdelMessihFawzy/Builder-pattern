package main.java.creational.builder ;
public class Burger {	
	private String bread;
	private String patty;
	private String veggies;
	private String sauce;
	private String withExtraCheese ;

	public String getBread() { return bread; }
	public void setBread(String bread) { this.bread = bread; }
        // <......... Getters and setters for these properties>

	@Override
	public String toString() {
	    return 
        "Burger [bread=" + bread + ", patty =" + patty + ", veggies =" + veggies + ", sauce =" + sauce + ",  Cheese =" + withExtraCheese + "]";
	}
    public void setPatty(String patty) { this.patty = patty; } 
    
    
    public void setVeggies(String veggies) { this.veggies = veggies; } 
    

    public void setSauces(String sauce) { this.sauce = sauce ; } 
    
    
    public void setWithExtraCheese(String cheese) { this.withExtraCheese = cheese; } 


    
    
}

