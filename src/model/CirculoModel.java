package model;

/**
 *
 * @author Jose Torres
 */
public class CirculoModel {

    private double radio;

    public CirculoModel() {
    }

    public CirculoModel(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "radio: " + radio;
    }

}
