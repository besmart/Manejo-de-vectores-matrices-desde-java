/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/

public class Inicializa_stock {
    // Inicializar inventario de productos con 5 unidades cada producto
    public static void Llenar_matriz (int fila, int columna, int contador, int [][] cantidad) {
 
        for(int x = 0; x <= fila-1; x++) {
            for (int y = 0; y <= columna-1; y++) {

                cantidad[x][y] = contador;
            }
        }

    };

    // Visualizar matriz, cantidad x productos
    public static void Imprime_matriz (int fila, int columna, int contador, int [][] cantidad){

        for(int x = 0; x <= fila-1; x++) {
            for (int y = 0; y <= columna-1; y++) {
                System.out.println("" + cantidad[x][y]);
            }
        }
    };
}
