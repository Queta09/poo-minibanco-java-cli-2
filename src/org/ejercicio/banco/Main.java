package org.ejercicio.banco;


public class Main {
    
    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("David Coba", 25672946);
       CuentaBancaria cuenta1 = new CuentaBancaria(6831531,cliente1,10000);

    }
}