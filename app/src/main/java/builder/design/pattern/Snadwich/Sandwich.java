package builder.design.pattern.Snadwich;
import builder.design.pattern.Snadwich.SandwichBuilder;
public class Sandwich {
    private String Bread;
    private String Meat;
    private Boolean Chesse;
    private Boolean Vegetables;
    private Boolean Sauces;

    
    public String getBread() {
        return Bread;
    }
    public void setBread(String bread) {
        Bread = bread;
    }
    public String getMeat() {
        return Meat;
    }
    public void setMeat(String meat) {
        Meat = meat;
    }
    public Boolean getChesse() {
        return Chesse;
    }
    public void setChesse(Boolean chesse) {
        Chesse = chesse;
    }
    public Boolean getVegetables() {
        return Vegetables;
    }
    public void setVegetables(Boolean vegetables) {
        Vegetables = vegetables;
    }
    public Boolean getSauces() {
        return Sauces;
    }
    public void setSauces(Boolean sauces) {
        Sauces = sauces;
    }

    public Sandwich(SandwichBuilder sandwichBuilder) {
        this.Bread = sandwichBuilder.getBread();
        this.Meat = sandwichBuilder.getMeat();
        this.Chesse = sandwichBuilder.getChesse();
        this.Vegetables = sandwichBuilder.getVegetables();
        this.Sauces = sandwichBuilder.getSauces();
    }


    
}
