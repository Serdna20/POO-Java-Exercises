package com.mycompany.cuentasbancarias;

import people.Holder;

public class CuentasBancarias {

    public static void main(String[] args) {
        Holder cuenta1 = new Holder("Charlotte", 250_000);
        Holder cuenta2 = new Holder("Liam");
        cuenta2.withdrawMoney(50_000);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println("");
        cuenta2.consignMoney(-100_000);
        cuenta1.withdrawMoney(250_001);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println("");
        cuenta1.withdrawMoney(25_000);
        cuenta2.consignMoney(25_000);
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
