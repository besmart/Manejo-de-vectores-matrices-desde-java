/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String producto = null;
        int [][] cantidad;
        cantidad = new int[4][4];
        int precio = 0;
        Inicializa_stock llena_matriz = new Inicializa_stock();
        llena_matriz.Llenar_1
    matriz(4, 4, 5, cantidad);

        Productos productos = new Productos();
        Precios precios = new Precios();
        Ventas_totales ventas_totales = new Ventas_totales();
        List<String> myList = new ArrayList<>();
        //llena_matriz.Imprime_matriz(4, 4, 5, cantidad); // Solo para pruebas
        Inventarios inventario = new Inventarios();
        inventario.cantidades(0,0,0,0,cantidad);
        cantidad = cantidad;

        String entradaTeclado = "";
        String entradaTeclado2 = "";
        String usuario = "MaquinaExpendedora2022";
        // Programa menú de expendedora de golosinas
        do {
            System.out.println ("!----------------------------------------------------!");
            System.out.println ("!  E X P E N D E D O R A    D E   G O L O S I N A S  !");
            System.out.println ("!----------------------------------------------------!" + "\n");
            System.out.println("M E N U    D E    G O L O S I N A S" + "\n");
            System.out.println("1. Pedir golosina");
            System.out.println("2. Mostrar golosina");
            System.out.println("3. Rellenar golosinas");
            System.out.println("4. Ventas totales de la máquina");
            System.out.println("5. Apagar máquina");

            Scanner entradaEscaner = new Scanner(System.in);
            entradaTeclado = entradaEscaner.nextLine();

            if("1".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("2");
                System.out.println("S O L I C I T A R    G O L O S I N A S " + "\n");
                myList = (List<String>) Pedir_golosina.solicita_golosina(cantidad, myList);
            }
            if("2".equalsIgnoreCase(entradaTeclado)){
                System.out.println("2");
                System.out.println("I N V E T A R I O   D E   G O L O S I N A S " + "\n");
                productos.ImprimeMatriz(producto, precio);
            }
            if("3".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("3");
                System.out.println("R E L L E N A R    G O L O S I N A S " + "\n");
                System.out.println("Entre contraseña para rellenar:" + "\n");
                Scanner usuarioEscaner = new Scanner(System.in);
                entradaTeclado2 = usuarioEscaner.nextLine();
                if ("MaquinaExpendedora2022".equalsIgnoreCase(entradaTeclado2)) {
                    Recargar_golosina.recarga_golosina(cantidad);
                } else {
                    System.out.println("Contraseña ingresada: " + entradaTeclado2 + "  N0 VALIDA para rellenar golosinas" + "\n" +"\n" + "\n" );
                }
            }
             if("4".equalsIgnoreCase(entradaTeclado)) {
                 System.out.println("4");
                 System.out.println("V E N T A S    T O T A L E S " + "\n");
                 ventas_totales.Imprimir_ventas(myList);
             }
        }  while (!"5".equals(entradaTeclado));

    }
}
