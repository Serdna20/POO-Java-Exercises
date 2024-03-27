package person;

import lightbulbs.Lightbulb;
import values.LightbulbType;
import values.PersonType;

public class Person {
    String name;
    int age;
    PersonType type;

    public Person(String name, int age, PersonType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    
    public void toggleOn(Lightbulb lb) {
        if (lb.getType() == LightbulbType.NORMAL) {
            if ((this.age > 8 && this.type == PersonType.RESIDENT) || (this.type == PersonType.ELECTRICIAN)) {
                lb.toggleOn();
            }
            else {
                System.out.println("You can't do this, "+this.name);
            }
        }
        else {
            if (this.type == PersonType.ELECTRICIAN) {
                lb.toggleOn();
            }
            else {
                System.out.println("You can't do this, "+this.name);
            }
        }
    }
    
}
