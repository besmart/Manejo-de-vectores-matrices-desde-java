/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/
import java.util.Scanner;

public class Recargar_golosina {
    public static int[][] recarga_golosina(int [][] cantidad2) {
        // Definir variables de trabajo
        String x1 = "0";
        String y1 = "0";
        String c1 = "0";
        String r1 = "0";
        int stock = 0;
        int recarga = 0;
        double precio = 0;
        String producto = null;
        int [][] cantidad = cantidad2;

        // Instanciar objetos, productos, precios e inventario
        Productos productos = new Productos();
        Precios precios = new Precios();
        Inventarios inventario = new Inventarios();

        // Mensajes de validación
        System.out.println("Entre ubicación golosina Fila = : " + x1 + "," );
        Scanner entraEscaner = new Scanner(System.in);
        x1 = entraEscaner.nextLine();
        System.out.println("Entre ubicación golosina Columna = : " + y1 );
        Scanner entra2Escaner = new Scanner(System.in);
        y1 = entra2Escaner.nextLine();
        int x = Integer.parseInt(String.valueOf(x1));
        int y = Integer.parseInt(String.valueOf(y1));

        if ( x < 4 && y < 4) {
            System.out.println("Entre la cantidad a recargar: " + r1);
            Scanner entraRecargaEscaner = new Scanner(System.in);
            r1 = entraRecargaEscaner.nextLine();
            int compra = 0;
            recarga = Integer.parseInt(String.valueOf(r1));
            stock = inventario.cantidades(compra, x, y, recarga, cantidad);
            producto = productos.Golosinas(producto, x, y);
            precio = precios.Valores(precio, x, y);
            if (stock == 99) {
                System.out.println("No es posible sobrecargar mas de 14 Golosinas ");
            } else {
                System.out.println("Golosina elegida es : " + producto);
                System.out.println("Su precio es: " + precio);
                System.out.println("Cantidad actual es: " + stock);
            }
        } else {
            System.out.println("No existe cantidad a recargar");
        }
        return cantidad;
    }
}
