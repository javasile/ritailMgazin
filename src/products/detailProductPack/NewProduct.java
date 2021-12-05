package products.detailProductPack;

import java.util.List;
import java.util.Scanner;

public class NewProduct {


    public static ProductDetail Product(){

        Scanner scannerText = new Scanner (System.in);
        Scanner scannerNumber = new Scanner (System.in);

        ProductDetail productDetail = new ProductDetail();

        List<ProductDetail> productDetails = AddingNewProduct.readFile ();
        productDetail.setSKU (productDetails.size () +1);

        System.out.print ("Insert the name of adding product: ");
        productDetail.setProductName (scannerText.nextLine ().trim ());
        System.out.print ("Setting the basic price of the selling product: ");
        productDetail.setPrice (scannerNumber.nextDouble ());
        System.out.print ("Insert quantity of handling product:");
        productDetail.setStock (scannerNumber.nextInt ());
        System.out.print ("Write the categorii of the product " +
                "- e.g.: Footwear, Pants, T-shirt/Shirt, Jacket: ");
        productDetail.setCategory (scannerText.nextLine ().trim ());
        System.out.print ("Insert the Brand of product: ");
        productDetail.setBrand (scannerText.nextLine ().trim ());
        System.out.print ("Insert the size of the product: ");
        productDetail.setSize (scannerText.nextLine ().trim ());
        System.out.print ("Add the color of the product: ");
        productDetail.setColor (scannerText.nextLine ().trim ());
        System.out.print ("Describe the product insert: ");
        productDetail.setDescription (scannerText.nextLine ().trim ());


        return productDetail;
    }
}
