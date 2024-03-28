package figura;

import dimension.Dimension;
import superheroe.Superheroe;

public class Figura {
    String code;
    double price;
    Dimension dimentions;
    Superheroe superheroe;

    public Figura(String code, double price, Dimension dimentions, Superheroe superheroe) {
        this.code = code;
        this.price = price;
        this.dimentions = dimentions;
        this.superheroe = superheroe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dimension getDimentions() {
        return dimentions;
    }

    public void setDimentions(Dimension dimentions) {
        this.dimentions = dimentions;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    @Override
    public String toString() {
        return "Figura{" + "code=" + code + ", price=" + price + ", dimentions=" + dimentions.toString() + ", superheroe=" + superheroe.toString() + '}';
    }
    
    public void subirPrecio(double extra) {
        this.price = this.price + extra;
    }
    
    
    
}
