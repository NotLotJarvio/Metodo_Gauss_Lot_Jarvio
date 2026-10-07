package Metodos_Numericos;

public class Lanzador_gaus {
    public static void main(String[] args) {
        // 1. Mandamos llamar a la función que nos entrega la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();
        
        // 2. Aplicar la eliminación gaussiana (fase de triangulación superior)
        Gauss.eliminacionGaussiana(matriz);
        
        // 3. Obtener los resultados mediante sustitución regresiva
        double[] soluciones = Gauss.sustitucionRegresiva(matriz);
        
        // 4. Imprimir resultados finales en consola de manera limpia
        System.out.println("Soluciones del sistema:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
