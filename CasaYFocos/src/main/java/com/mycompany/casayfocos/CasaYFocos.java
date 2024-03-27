package com.mycompany.casayfocos;

import lightbulbs.Lightbulb;
import person.Person;
import values.LightbulbType;
import values.PersonType;

public class CasaYFocos {

    public static void main(String[] args) {
        Person charlotte = new Person("Charlotte", 28, PersonType.RESIDENT);
        Person parker = new Person("Parker", 30, PersonType.RESIDENT);
        Person charlie = new Person("Charlie", 1, PersonType.RESIDENT);
        Person liam = new Person("Liam", 25, PersonType.ELECTRICIAN);
        Person bryce = new Person("Bryce", 28, PersonType.ELECTRICIAN);
        
        Lightbulb lb1 = new Lightbulb(1, LightbulbType.NORMAL);
        Lightbulb lb2 = new Lightbulb(2, LightbulbType.DANGEROUS);
        Lightbulb lb3 = new Lightbulb(3, LightbulbType.NORMAL);
        
        charlotte.toggleOn(lb2);
        parker.toggleOn(lb1);
        charlie.toggleOn(lb1);
        liam.toggleOn(lb2);
        liam.toggleOn(lb2);
        bryce.toggleOn(lb3);
        bryce.toggleOn(lb2);
    }
}
