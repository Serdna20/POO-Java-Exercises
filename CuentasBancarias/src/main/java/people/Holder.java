package people;

public class Holder {
    String name;
    double money;

    public Holder(String name) {
        this.name = name;
        this.money = 0;
    }

    public Holder(String name, double money) {
        this.name = name;
        this.money = money;
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
            this.money += cantidad;
            System.out.println("Consignación realizada.");
            return;
        }
        System.out.println("No se puede consignar.");
    }
    
    public void withdrawMoney(double money) {
        if (money <= this.money) {
            this.money -= money;
            System.out.println("Retiración realizada.");
            return;
        }
        System.out.println("Saldo insuficiente.");
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "name=" + name + ", money=" + money + '}';
    }
    
}
