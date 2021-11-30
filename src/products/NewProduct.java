package products;

import java.util.Scanner;

public class NewProduct {


    public static ProductDetail Product(){

        Scanner scannerText = new Scanner (System.in);
        Scanner scannerNumber = new Scanner (System.in);

        ProductDetail productDetail = new ProductDetail();
        System.out.printf ("Set the SKU of product: ");
        productDetail.setSKU (scannerNumber.nextInt ());
        System.out.printf ("Insert the name of adding product: ");
        productDetail.setProductName (scannerText.nextLine ());
        System.out.printf ("Setting the basic price of the selling product: ");
        productDetail.setPrice (scannerNumber.nextDouble ());
        System.out.printf ("Insert quantity of handling product:");
        productDetail.setStock (scannerNumber.nextInt ());
        System.out.printf ("Write the categorii of the product " +
                "- e.g.: Footwear, Pants, T-shirt/Shirt, Jacket: ");
        productDetail.setCategory (scannerText.nextLine ());
        System.out.printf ("Insert the Brand of product: ");
        productDetail.setBrand (scannerText.nextLine ());
        System.out.printf ("Insert the size of the product: ");
        productDetail.setSize (scannerText.nextLine ());
        System.out.printf ("Add the color of the product: ");
        productDetail.setColor (scannerText.nextLine ());
        System.out.printf ("Describe the product insert: ");
        productDetail.setDescription (scannerText.nextLine ());


        return productDetail;
    }
}
