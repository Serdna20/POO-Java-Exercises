package lightbulbs;

import values.LightbulbType;

public class Lightbulb {
    int id;
    boolean on;
    LightbulbType type;

    public Lightbulb(int id, LightbulbType type) {
        this.id = id;
        this.on = true;
        this.type = type;
    }

    public void toggleOn() {
        this.on = !on;
        System.out.println("Lightbulb #"+this.id+" On: "+this.on);
    }

    public LightbulbType getType() {
        return type;
    }    
    
}
