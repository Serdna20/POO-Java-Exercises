package people;

public class Holder {
    String name;
    double money;

    public Holder(String name) {
        this.name = name;
        this.money = 0;
    }

    public Holder(String titular, double cantidad) {
        this.name = titular;
        this.money = cantidad;
    }

    public String getName() {
        return name;
    }
    
    /*
    public void setName(String name) {
        this.name = name;
    }
    */
    
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    public void consignMoney(double cantidad) {
        if (cantidad>=0) {
            this.money = this.money + cantidad;
        }
    }
    
    public void withdrawMoney(double money) {
        if (money <= this.money) {
            this.money = this.money - money;
        }
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "name=" + name + ", money=" + money + '}';
    }
    
}
