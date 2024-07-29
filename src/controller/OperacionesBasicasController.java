package controller;

/**
 *
 * @author Jose Torres
 */
public class OperacionesBasicasController {

    /*
        Metodo sumar con dos parametros
        
        @param a
        @param b
        @return valor total de la suma
     */
    public double sumar(int a, int b) {
        return a + b;
    }

    /*
        Metodo sumar con tres parametros
        
        @param a
        @param b
        @param c
        @return valor total de la suma
     */
    public double sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double restar(int a, int b) {
        return a - b;
    }

    public double multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        return a / b;
    }

}
