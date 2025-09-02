package org.ejercicio.banco;


public class Main {
    
    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("David Coba", 25672946);
       CuentaBancaria cuenta1 = new CuentaBancaria(6831531,cliente1,10000);

       Cliente cliente2 = new Cliente("David ku", 29872946);
       CuentaBancaria cuenta2 = new CuentaBancaria(61531,cliente1,1000);


    }
}