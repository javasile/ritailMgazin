import products.detailProductPack.ProductBulider;
import products.supplier.AddingSupplier;
import products.supplier.SupplierBuilder;

import java.util.Scanner;

import static products.customer.CustomBuilder.CustomerAndCompanyAdding;

public class Main {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner (System.in);
        int menu = 0;

        while (menu != 8) {

            System.out.print ("""
                    Menu
                     1. Open or find existing product
                     2. Add a new product to existing list
                     3. Open or find supplier in list
                     4. Add a new supplier to list
                     5. Open or find existing customer
                     6. Add a new customer to list
                     7. Create a bill for a customer
                     8. Exit application!
                    **********************************************
                     * Enter the number of the app you need:\s""");

            menu = scannerNumber.nextInt ();
            switch (menu) {
                case 1 -> ProductBulider.findMenuProduct ();
                case 2 -> ProductBulider.addingProductOrDiscount ();
                case 3 -> SupplierBuilder.findMenuSupplier ();
                case 4 -> AddingSupplier.addingSupplier ();
                case 5 -> System.out.println ("The list is on progres!");
                case 6 ->CustomerAndCompanyAdding();
                case 7 -> System.out.println ("The list is empty!");
                case 8 -> System.out.println ("Tank you for using the application!");
                default -> System.out.println ("The number is not valid!" +
                        "\n Please try again!");
            }
        }
    }
}
