package model;

/**
 *
 * @author Jose Torres
 */
public class TrianguloModel {

    private double base;
    private double altura;

    public TrianguloModel() {
    }

    public TrianguloModel(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "base: " + base + "\naltura: " + altura;
    }

}
