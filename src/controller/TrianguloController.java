package controller;

import interfaces.FiguraInterfaces;
import model.TrianguloModel;

/**
 *
 * @author Jose Torres
 */
public class TrianguloController implements FiguraInterfaces {

    private TrianguloModel triangulo_model;

    /*
        @param base: base del triangulo
        @param altura: altura del triangulo
     */
    public void crearTriangulo(double base, double altura) {
        triangulo_model = new TrianguloModel(base, altura);
    }

    public TrianguloModel obtenerTriangulo() {
        return triangulo_model;
    }

    @Override
    public double calcularArea() {
        return (triangulo_model.getBase() * triangulo_model.getAltura()) / 2;
    }

}
