package Metodos_Numericos;

public class Gauss {
    /**
     * Método que realiza la triangulación de la matriz usando Eliminación Gaussiana simple.
     * @param matriz Matriz aumentada [A | b] que será modificada directamente en memoria.
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matriz[j][i] / matriz[i][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Método que realiza la sustitución regresiva (la bajada) para despejar las variables.
     * @param matriz Matriz ya convertida en triangular superior.
     * @return Un arreglo unidimensional con los valores de las soluciones.
     */
    public static double[] sustitucionRegresiva(double[][] matriz) {
        int n = matriz.length;
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double suma = 0;
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j] * x[j];
            }
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }
        return x;
    }
}
