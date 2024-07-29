package controller;

import interfaces.FiguraInterfaces;
import model.CirculoModel;

/**
 *
 * @author Jose Torres
 */
public class CirculoController implements FiguraInterfaces {

    private CirculoModel circulo_model;

    /*
        @param radio: radio del circulo
     */
    public void crearCirculo(double radio) {
        circulo_model = new CirculoModel(radio);
    }

    public CirculoModel obternerCirculo() {
        return circulo_model;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(circulo_model.getRadio(), 2);
    }

}
