import clases.*;

public class Aplicacion{
    public static void main(String[]args){
        
        Persona persona1 = new Persona("Jesús", 21);
        Persona persona2 = new Persona("Jorge", 23);
        Persona persona3 = new Persona("Victor", 17);

        CuentaBancaria cuenta1 = new CuentaBancaria(persona1, 5500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria(persona2, 3300.0);
        CuentaBancaria cuenta3 = new CuentaBancaria(persona3, 1700.0);

        System.out.println("Saldo cuenta1: " + String.valueOf(cuenta1.getSaldo()));
        cuenta1.depositar(1000.0);
        System.out.println("Saldo cuenta1: " + String.valueOf(cuenta1.getSaldo()));
        cuenta1.retirar(5000.0);
        System.out.println("Saldo cuenta1: " + String.valueOf(cuenta1.getSaldo()));

        System.out.println("Saldo cuenta2: " + String.valueOf(cuenta2.getSaldo()));
        cuenta2.depositar(100.0);
        System.out.println("Saldo cuenta2: " + String.valueOf(cuenta2.getSaldo()));
        cuenta2.retirar(5000.0);
        System.out.println("Saldo cuenta2: " + String.valueOf(cuenta2.getSaldo()));

        System.out.println("Saldo cuenta3: " + String.valueOf(cuenta3.getSaldo()));
        cuenta3.retirar(5000.0);
        System.out.println("Saldo cuenta3: " + String.valueOf(cuenta3.getSaldo()));
        cuenta3.depositar(5000.0);
        System.out.println("Saldo cuenta3: " + String.valueOf(cuenta3.getSaldo()));

        System.out.println("");

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}