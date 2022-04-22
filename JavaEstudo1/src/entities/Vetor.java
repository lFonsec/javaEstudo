package entities;

public class Vetor {
    private String name;
    public double price;


    public Vetor(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
