import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StoresSalesAnalysis {

    static Scanner request = new Scanner(System.in);
    static List<List<Object>> sales = new ArrayList<>();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        boolean showMenu = true;
        do {
            System.out.println("""
                    \n---------------- ANÁLISIS DE VENTAS DE UNA TIENDA ----------------
                    1. Ingresar Productos
                    2. Calcular Ingreso Total
                    3. Contar Ventas por Producto
                    4. Filtrar Ventas Mayores a un Monto
                    5. Obtener Producto Más Vendido
                    6. Mostrar todas las ventas
                    0. Salir
                    """);
            System.out.print("Elija una Opción: ");
            if (request.hasNextInt()) {
                int option = request.nextInt();
                request.nextLine();
                switch (option) {
                    case 1:
                        // Ingresar Producto, cantidad y precio Unitario
                        addProductos(sales);
                        break;
                    case 2:
                        // calcular Ingreso total
                        double grossRevenue = revenueCalculation(sales);
                        System.out.println(RED + "Ingreso Total de ventas: " + grossRevenue + RESET);
                        break;

                    case 3:
                        // contar ventas por producto
                        countSalesByProduct(sales);
                        break;

                    case 4:
                        // Filtrar ventas mayores a un monto especifico
                        filterSalesOverAmount(sales);

                        break;
                    case 5:
                        // Obtener el producto mas vendido
                        getBestSellingProduct(sales);
                        break;
                    case 6:
                        // mostrar ventas
                        showSales(sales);

                        break;
                    case 0:
                        showMenu = false;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("\n Opción Invalida. Intente de Nuevo");
                }
            } else {
                System.out.println("\n Entrada Invalida. Intente de Nuevo");
                request.nextLine();
            }
        } while (showMenu);
        request.close();
    }

    private static void getBestSellingProduct(List<List<Object>> sales2) {
        if (sales.isEmpty()) {
            System.out.println("No hay ventas registradas");
            return;
        }
        Map<String, Integer> salesByProduct = new HashMap<>();
        for (List<Object> sales : sales) {
            String product = (String) sales.get(0);
            int amount = (int) sales.get(1);
            salesByProduct.put(product, salesByProduct.getOrDefault(product, 0) + amount);
        }
        String bestSellingProduct = null;
        int maxSales = 0;

        for (Map.Entry<String, Integer> entry : salesByProduct.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                bestSellingProduct = entry.getKey();
            }
        }
        System.out.printf(YELLOW + "\nProducto más vendido: %s con %d ventas\n" + RESET, bestSellingProduct, maxSales);

    }

    private static void filterSalesOverAmount(List<List<Object>> sales) {
        System.out.print("Ingrese el monto: ");
        if (request.hasNextDouble()) {
            double monto = request.nextDouble();
            request.nextLine();
            DrawLine();
            System.out.println(YELLOW + "\nVentas Mayores a:  " + monto + ": " + RESET);
            boolean found = false;

            for (List<Object> sale : sales) {
                int amount = (int) sale.get(1);
                double price = (double) sale.get(2);
                double totalSale = amount * price;

                if (totalSale > monto) {
                    found = true;
                    System.out.println("");
                    System.out.printf("""
                            Producto: %s
                            Cantidad: %d
                            Precio Unitario: %.2f
                            Total Venta: %.2f\n
                            """, sale.get(0), amount, price, totalSale);
                }
            }
            DrawLine();
            if (!found) {
                System.out.println("No se encontraron Ventas Mayores a " + monto);
            }
        } else {
            System.out.println("\nEntrada inválida. Intente de Nuevo");
            request.nextLine();
        }
    }

    private static void countSalesByProduct(List<List<Object>> sales) {

        Map<String, Integer> salesByProduct = new HashMap<>();

        for (List<Object> sale : sales) {

            String product = (String) sale.get(0);
            int amount = (int) sale.get(1);
            salesByProduct.put(product, salesByProduct.getOrDefault(product, 0) + amount);
        }

        // Imprime las ventas realizadas
        DrawLine();
        System.out.println(YELLOW + "Ventas por producto: " + RESET);
        for (Map.Entry<String, Integer> entry : salesByProduct.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue() + " ventas");
        }
        DrawLine();

    }

    private static void showSales(List<List<Object>> ventas) {
        DrawLine();
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas");
        } else {
            System.out.println(YELLOW + "           --------Ventas registradas--------\n " + RESET);
            for (List<Object> sale : ventas) {
                System.out.printf("""
                        Producto: %s
                        Cantidad: %d
                        Precio Unitario: %.2f\n
                        """, sale.get(0), (int) sale.get(1), (double) sale.get(2));
            }
        }
        DrawLine();
    }

    private static void addProductos(List<List<Object>> ventas) {
        System.out.println(YELLOW + "Ingrese Los Productos (escriba 'fin' para terminar)..." + RESET);
        String product;
        do {
            System.out.print("Ingese el nombre del producto: ");
            product = request.nextLine();
            if (product.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese la cantidad vendida: ");
            int amount = request.nextInt();

            System.out.print("Ingrese el precion Unitario: ");
            double price = request.nextDouble();
            request.nextLine(); // Consumir el salto de linea

            // Agregar el Producto como una sublista

            List<Object> sale = new ArrayList<>();
            sale.add(product);
            sale.add(amount);
            sale.add(price);
            ventas.add(sale);

            System.out.println(YELLOW + "\nProducto Agregado Exitosamente\n" + RESET);
        } while (true);
    }

    private static double revenueCalculation(List<List<Object>> sales) {
        double totalIncome = 0.0;

        for (List<Object> sale : sales) {
            int amount = (int) sale.get(1);
            double unitPrice = (double) sale.get(2);
            totalIncome += amount * unitPrice;
        }
        return totalIncome;
    }

    public static void DrawLine() {
        System.out.println(PURPLE + "====================================================================" + RESET);
    }

    public static String RESET = "\033[0m";
    public static String RED = "\033[0;31m";
    public static String GREEN = "\033[0;32m";
    public static String YELLOW = "\033[0;36m";
    public static String BLUE = "\033[0;34m";
    public static String CYAN = "\033[0;36m";
    public static String PURPLE = "\033[0;35m";
}