package semana9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cfjimbo
 */
public class Tarea1BM2 {

    public static void main(String[] args) {
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"Sucursal 1", "Sucursal 2", "Sucursal 3", "Sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];

        double suma1 = 0;
        String cadenafinal = "";
        cadenafinal = String.format("\t\t%s\t\t%s\t\t%s\t%s\t\t%s\n", "Agosto", "Octubre", "Diciembre", "Total", "Promedio");

        for (int contador = 0; contador < ventas_mes_3.length; contador++) {
            double suma = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador]; //Cálculo de la suma de las ventas de cada sucursal
            double promedio = suma / 3; // Cálculo del promedio de las ventas de cada sucursal
            venta_total_sucursal[contador] = suma; //Suma de las ventas de cada sucursal
            venta_promedio_sucursal[contador] = promedio; // Promedio de las ventas de cada sucursal
        } //Fin For

        System.out.println("Reporte\n");
        System.out.printf("%s", cadenafinal);
        for (int i = 0; i < ventas_mes_3.length; i++) {
            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[i], ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]);
            suma1 = suma1 + venta_total_sucursal[i]; // Suma de Total
        } //Fin For
        System.out.printf("\nTotales de ventas de todas la sucursales es: %.1f\n", suma1);
    } //Fin Main
} //Fin Class Tarea1BM2
