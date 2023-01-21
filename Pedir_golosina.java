/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/
import java.util.List;
import java.util.Scanner;

public class Pedir_golosina {
    public static Object solicita_golosina(int[][] cantidad2,List<String> myList) {
        // Definir variables de trabajo
        String x1 = "0";
        String y1 = "0";
        String c1 = "0";
        int stock = 0;
        int recarga = 0;
        double precio = 0;
        String producto = null;
        int [][] cantidad = cantidad2 ;

        // Instanciar objetos, productos, precios e inventario
        Productos productos = new Productos();
        Precios precios = new Precios();
        Inventarios inventario = new Inventarios();

        // Mensajes de validación
        System.out.println("1");
        System.out.println("Entre ubicación golosina Fila = : " + x1 + "," );
        Scanner entraEscaner = new Scanner(System.in);
        x1 = entraEscaner.nextLine();
        System.out.println("Entre ubicación golosina Columna = : " + y1 );
        Scanner entra2Escaner = new Scanner(System.in);
        y1 = entra2Escaner.nextLine();
        int x = Integer.parseInt(String.valueOf(x1));
        int y = Integer.parseInt(String.valueOf(y1));

        if ( x < 4 && y < 4) {
            producto = productos.Golosinas(producto, x, y);
            precio = precios.Valores(precio, x, y);
            System.out.println("Entre cantidad a comprar = : " + c1);
            Scanner entraComrpaEscaner = new Scanner(System.in);
            c1 = entraComrpaEscaner.nextLine();
            int compra = Integer.parseInt(String.valueOf(c1));
            stock = inventario.cantidades(compra, x, y, recarga, cantidad);
            if (stock == 99) {
                System.out.println("No existe cantidad a comprar");
                return myList;
            } else {
                System.out.println("Golosina elegida es : " + producto);
                System.out.println("Su precio es: " + precio);
                System.out.println("Cantidad actual es: " + stock);
                Ventas_totales ventas = new Ventas_totales();
                String Vent = String.valueOf(stock);
                String Pducto = String.valueOf(producto);
                String Pesos = String.valueOf(precio);
                String Compras = String.valueOf(compra);
                myList = ventas.Totaliza_ventas(Compras, Pducto, Pesos, myList);
                return myList;
            }
        } else {
            System.out.println("No existe cantidad a comprar");
            return myList;
        }
    }
}
