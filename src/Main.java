import products.AddingNewProduct;
import products.ProductDetail;

import java.util.List;
import java.util.Scanner;

import static products.AddingNewProduct.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerText = new Scanner (System.in);
        Scanner scannerNumber = new Scanner (System.in);
        int menu = 0;
        String answer;

        while (menu != 6) {

            System.out.print ("Menu" +
                    "\n 1. Open the existing product" +
                    "\n 2. Add a new product to existing list" +
                    "\n 3. Open the supplier list" +
                    "\n 4. Add a new supplier to list" +
                    "\n 5. Create a bill for a customer" +
                    "\n 6. Exit application!" +
                    "\n**********************************************" +
                    "\n * Enter the number of the app you need: ");

            menu = scannerNumber.nextInt ();
            switch (menu) {
                case 1:
                    List<ProductDetail> lineProduct = AddingNewProduct.readFile ();
                    lineProduct.forEach (System.out::println);
                    break;
                case 2:
                    adingTheProduct ();
                    break;
                case 3:
                    System.out.println ("The list is empty!");
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println ("Tank you for using the application!");
                    break;
                default:
                    System.out.println ("The number is not valid!" +
                            "\n Please try again!");
                    break;
            }
        }
    }
}
