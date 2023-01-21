/*
Autor: Ing. Carlos Alberto Diaz Raigosa
Empresa: Tata Consultancy Services
Mentor: Gonzalo Villegas Marin
Curso básico : Java SE
*/
public class Productos {
    Precios precios = new Precios();
    public  String Golosinas (String producto, int fila, int columna) {
        // Matriz llenado de descripción de productos
        String[][] nombresGolosinas = {
                {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                {"Cheetos", "M&M'S", "Papa Delta", "Chicles de menta"},
                {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        return  nombresGolosinas[fila][columna];
    }

    public String ImprimeMatriz(String pcto, int precio) {
        // Metodo de impresión productos
        int longitud = 0;
        Double precio_final = Double.valueOf(precio);
        String[][] nombresGolosinas = {
                {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                {"Cheetos", "M&M'S", "Papa Delta", "Chicles de menta"},
                {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        longitud = nombresGolosinas.length;
        for (int fila = 0; fila <= longitud-1; fila++) {
            for(int columna =0; columna <= longitud-1; columna++) {
               pcto = nombresGolosinas[fila][columna];
               precio_final = precios.Valores(precio_final,fila,columna);
               System.out.println("Código ubicación : " + "(" + fila + "," + columna + ")" + ", " +
                       "Producto: " + pcto +", " + "Precio: " + "$ " + precio_final);
            }
        }
        return pcto;
    }
}
