/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/
public class Precios {
    // Matriz de precios x producto
    public double Valores (double valor, int fila, int columna) {
        double[][] precio = {
                {1.1, 0.8, 1.5, 0.9},
                {1.8, 1, 1.2, 1},
                {1.8, 1.3, 1.2, 0.8},
                {1.5, 1.1, 1.1, 1.1}
        };
        return  precio[fila][columna];
    }
}
