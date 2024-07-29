package controller;

import interfaces.FiguraInterfaces;
import model.CuadradoModel;

/**
 *
 * @author Jose Torres
 */
public class CuadradoController implements FiguraInterfaces {

    private CuadradoModel cuadrado_model;

    /*
        @param lado: lado del cuadrado
     */
    public void crearCuadrado(double lado) {
        cuadrado_model = new CuadradoModel(lado);
    }

    public CuadradoModel ObtenerCuadrado() {
        return cuadrado_model;
    }

    @Override
    public double calcularArea() {
        return Math.pow(cuadrado_model.getLado(), 2);
    }

}
