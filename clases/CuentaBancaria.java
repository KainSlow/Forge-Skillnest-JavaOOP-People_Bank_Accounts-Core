package clases;

import java.util.ArrayList;
import clases.Persona;

public class CuentaBancaria{
    
    public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<CuentaBancaria>();

    private Persona titular;
    private Double saldo;
    private int numeroCuenta;
    
    public CuentaBancaria(Persona titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
        numeroCuenta =  100000 + (int)Math.floor(Math.random() * (999999.0 - 100000.0));

        CuentaBancaria.listaDeCuentasBancarias.add(this);
    }

    public Persona getTitular(){return titular;}
    public void setTitular(Persona p){ titular = p;}

    public Double getSaldo(){return saldo;}
    public void setSaldo(Double s){saldo = s;}

    public int getNumeroCuenta(){return numeroCuenta;}
    public void setNumeroCuenta(int n){
        if(n < 100000 || n > 999999){
            System.out.println("Número no válido");
            return;
        }
        numeroCuenta = n;
    }

    public void depositar(Double monto){
        saldo += monto;
    }

    public void retirar(Double monto){
        
        if (saldo - monto < 0.0){
            System.out.println("No hay suficiente salto para retirar el monto indicado.");
            return;
        }

        saldo -= monto;
    }

    public void despliegaInformacion(){
        System.out.println("Datos de la cuenta:");
        System.out.println("Numero de cuenta: " + String.valueOf(numeroCuenta));
        System.out.println("Saldo: " + String.valueOf(saldo));
        titular.despliegaInformacion();
        System.out.println("");
    }

    public static void imprimeInformacionDeTodasLasCuentas(){
        for(CuentaBancaria cuenta : listaDeCuentasBancarias){
            cuenta.despliegaInformacion();
        }
    }
}