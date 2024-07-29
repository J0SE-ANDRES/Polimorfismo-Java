package model;

/**
 *
 * @author Jose Torres
 */
public class CuadradoModel {

    private double lado;

    public CuadradoModel() {
    }

    public CuadradoModel(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "lado: " + lado;
    }

}
