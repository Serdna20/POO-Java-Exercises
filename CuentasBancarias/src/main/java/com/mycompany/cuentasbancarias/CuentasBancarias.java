package com.mycompany.cuentasbancarias;

import people.Holder;

public class CuentasBancarias {

    public static void main(String[] args) {
        Holder cuenta1 = new Holder("Charlotte", 250000);
        Holder cuenta2 = new Holder("Liam");
        cuenta2.consignMoney(10000);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println("");
        cuenta2.consignMoney(-100000);
        cuenta1.withdrawMoney(250001);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println("");
        cuenta1.withdrawMoney(25000);
        cuenta2.consignMoney(25000);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
