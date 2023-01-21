import java.util.ArrayList;
import java.util.List;

public class Ventas_totales {
    public static List<String> Totaliza_ventas(String Venta, String pcto, String Precio, List<String> myList) {
        myList.add("Cantidad vendida : " + Venta +"," + "Producto: " + pcto +"," + "Precio: " + Precio);
        return myList;
   }
    public static  void Imprimir_ventas( List<String> myList){
        int x = 0;
        int y = 1;
        while (x < myList.size()) {
            System.out.println("Venta # :" + y + "," + myList.get(x));
            x++;
            y++;
        }
    }

}
