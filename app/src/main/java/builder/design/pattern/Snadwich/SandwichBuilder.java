package builder.design.pattern.Snadwich;

public class SandwichBuilder {

    private String Bread;
    private String Meat;
    private Boolean Chesse;
    private Boolean Vegetables;
    private Boolean Sauces;
    
    public String getBread() {
        return Bread;
    }
    public String getMeat() {
        return Meat;
    }
    public Boolean getChesse() {
        return Chesse;
    }
    public Boolean getVegetables() {
        return Vegetables;
    }
    public Boolean getSauces() {
        return Sauces;
    }

    public SandwichBuilder setBread(String Bread){
        this.Bread = Bread;
        return this;
    }
    public SandwichBuilder setMeat(String Meat){
        this.Meat = Meat;
        return this;
    }
    public SandwichBuilder setChesse(Boolean Chesse){
        this.Chesse = Chesse;
        return this;
    }
    public SandwichBuilder setVegetables(Boolean Vegetables){
        this.Vegetables = Vegetables;
        return this;
    }
    public SandwichBuilder setSauces(Boolean Sauces){
        this.Sauces = Sauces;
        return this;
    }
    public SandwichBuilder(String Bread , String Meat){
        this.Bread = Bread;
        this.Meat = Meat;
    }
    public Sandwich build(){
        return new Sandwich(this);
    }


}
