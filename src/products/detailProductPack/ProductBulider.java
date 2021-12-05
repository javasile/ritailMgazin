package products.detailProductPack;
import products.discount.NewDiscount;

import java.util.List;
import java.util.Scanner;

public class ProductBulider {


    static Scanner scannerText = new Scanner (System.in);
    static String answer;

    public static void findMenuProduct() {

        List<ProductDetail> lineProduct = AddingNewProduct.readFile ();
        lineProduct.forEach (System.out::println);
        SearchingProduct.ApplySherching ();
    }

    public static void addingProductOrDiscount() {
        System.out.print (" Y - Insert Y for adding new product: " +
                "\n N - Or insert N for adding discount: ");
        answer = scannerText.nextLine ().trim ();
        if (answer.equals ("Y") || answer.equals ("y")) {
            do {
                AddingNewProduct.adingTheProduct ();
                System.out.print ("Do you want to add a new product? \n Y/N: ");
                answer = scannerText.nextLine ().trim ();
            } while (answer.equals ("Y") || answer.equals ("y"));

        } else if (answer.equals ("N") || answer.equals ("n")) {

            do {
                NewDiscount.ProductDiscount ();
                System.out.print ("Do you want to add a new discount? \n Y/N: ");
                answer = scannerText.nextLine ().trim ();
            } while (answer.equals ("Y") || answer.equals ("y"));
        }else
            System.out.println ("The invalid caracter!");
    }
}
