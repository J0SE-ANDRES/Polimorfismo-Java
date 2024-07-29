package view;

import controller.OperacionesBasicasController;
import controller.CirculoController;
import controller.TrianguloController;
import controller.CuadradoController;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Torres
 */
public class MainView {

    public static void main(String[] args) {
        while (true) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      MENÚ DE OPERACIONES
                                                                      1. OPERACIONES BASICAS
                                                                      2. CALCULO DE AREA DE FIGUERAS
                                                                      3. SALIR
                                                                      """));

            switch (option) {
                case 1 -> {
                    menuOperacionesBasicas();
                }
                case 2 -> {
                    menuCalculoAreaFigura();
                }
                case 3 -> {
                    System.exit(0);
                }
                default ->
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");
            }
        }
    }

    private static final OperacionesBasicasController operaciones_basicas_controller = new OperacionesBasicasController();

    private static void menuOperacionesBasicas() {
        int num_uno = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRIMER VALOR"));
        int num_dos = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO VALOR"));
        int num_tres = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TERCER VALOR"));

        JOptionPane.showMessageDialog(null, "METODO SUMAR CON 2 PARAMETROS\nPRIMER VALOR: " + num_uno
                + "\nSEGUNDO VALOR: " + num_dos
                + "\nRESULTADO DE LA SUMA: " + operaciones_basicas_controller.sumar(num_uno, num_dos));

        JOptionPane.showMessageDialog(null, "METODO SUMAR CON 3 PARAMETROS\nPRIMER VALOR: " + num_uno
                + "\nSEGUNDO VALOR: " + num_dos + "\nTERCER VALOR: " + num_tres
                + "\nRESULTADO DE LA SUMA: " + operaciones_basicas_controller.sumar(num_uno, num_dos, num_tres));

        JOptionPane.showMessageDialog(null, "PRIMER VALOR: " + num_uno
                + "\nSEGUNDO VALOR: " + num_dos
                + "\nRESULTADO DE LA RESTA: " + operaciones_basicas_controller.restar(num_uno, num_dos));

        JOptionPane.showMessageDialog(null, "PRIMER VALOR: " + num_uno
                + "\nSEGUNDO VALOR: " + num_dos
                + "\nRESULTADO DE LA MULTIPLICACIÓN: " + operaciones_basicas_controller.multiplicar(num_uno, num_dos));

        if (num_uno != 0 && num_dos != 0) {
            JOptionPane.showMessageDialog(null, "PRIMER VALOR: " + num_uno
                    + "\nSEGUNDO VALOR: " + num_dos
                    + "\nRESULTADO DE LA DIVISIÓN: " + operaciones_basicas_controller.dividir(num_uno, num_dos));
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DIVIDIR ENTRE 0");
        }
    }

    private static void menuCalculoAreaFigura() {

        boolean control_bucle = true;
        while (control_bucle) {
            int opcion_calculo_area = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                   SELECCIONE UNA OPCION
                                                                                   1. CALCULAR AREA DEL CIRCULO
                                                                                   2. CALCULAR AREA DEL TRIANGULO
                                                                                   3. CALCULAR AREA DEL CUADRADO
                                                                                   4. SALIR
                                                                                   """));

            switch (opcion_calculo_area) {
                case 1 -> {
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL RADIO DEL CIRCULO"));
                    CirculoController circulo_controller = new CirculoController();
                    circulo_controller.crearCirculo(radio);
                    JOptionPane.showMessageDialog(null, circulo_controller.obternerCirculo()
                            + "\nRESULTADO: " + circulo_controller.calcularArea());
                }

                case 2 -> {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA BASE DEL TRIANGULO"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA ALTURA DEL TRIANGULO"));
                    TrianguloController triangulo_controller = new TrianguloController();
                    triangulo_controller.crearTriangulo(base, altura);
                    JOptionPane.showMessageDialog(null, triangulo_controller.obtenerTriangulo()
                            + "\nRESULTADO: " + triangulo_controller.calcularArea());
                }

                case 3 -> {
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL LADO DEL CUADRADO"));
                    CuadradoController cuadrado_controller = new CuadradoController();
                    cuadrado_controller.crearCuadrado(lado);
                    JOptionPane.showMessageDialog(null, cuadrado_controller.ObtenerCuadrado()
                            + "\nRESULTADO: " + cuadrado_controller.calcularArea());
                }

                case 4 -> {
                    control_bucle = false;
                }

                default ->
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");
            }
        }
    }

}
