/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/
public class Inventarios {
    public int cantidades(int compra, int fila, int columna, int recarga, int [][] cantidad2) {
        int total;
        int [][] cantidad = cantidad2;

        // Validar compras
        if (compra > 0 ) {
            if (compra > cantidad[fila][columna] || fila > 3 || columna > 3) {
                compra = 99;
                return compra;
            } else {
                cantidad[fila][columna] = cantidad[fila][columna] - compra;
            }
        } else if (recarga > 0) {   // validar recargas
            if (recarga + cantidad[fila][columna] > 14 || fila > 3 || columna > 3) {
                recarga = 99;
                return recarga;
            } else {
                cantidad[fila][columna] = cantidad[fila][columna] + recarga;
            }
        }
        return  cantidad[fila][columna];
    }
}
