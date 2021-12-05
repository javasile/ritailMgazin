package products.detailProductPack;
import products.customer.CompanyCustomer;
import products.customer.Customer;
import products.customer.SetCustomer;

import java.util.*;

import static products.customer.SetCustomer.readCompany;
import static products.customer.SetCustomer.readCustomer;

public class Searching {
    public static final String supplierDoc = "src/products/supplier/SupplyerList";

    public static final String discountDoc = "src/products/discount/ProductDiscountList";
    public static void main(String[] args) {

        int index=1;
//        readCustomer ().stream()
//                .map (readCustomer ()
//                        .sort (Comparator.comparing (id1->id1.id))->readCompany ().sort (Comparator.comparing (id->id.id)));

        List<Customer> customersId = new ArrayList<> ();


//        readCustomer ().stream ()
//                .filter (category -> category.)
//                        .forEach (System.out::println);


//    readCompany ().forEach (readCompany ().get (index).id);




        System.out.println (">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        Scanner scannerNumber = new Scanner (System.in);
//        LocalDate = LocalDate.now ();
//        System.out.println ("Insert number of Discount days: ");
//        int daysOfDiscount = scannerNumber.nextInt ();
//        System.out.println (localDate.plusDays (daysOfDiscount));
//        System.out.println (SetDiscount.readDiscount ());

//        List<ProductDetail> lineProduct = AddingNewProduct.readFile ();
//        Scanner scannerText = new Scanner (System.in);
//        System.out.print ("Insert product name: ");
//        String nume = scannerText.nextLine ().toUpperCase(Locale.ROOT).trim ();
//        lineProduct.stream ()
//                .filter (name -> name.productName.toUpperCase(Locale.ROOT).equals (nume))
//                .forEach (lineProduct::add);
//
//        System.out.print ("Insert size of product: ");
//        String marime = scannerText.nextLine ().toUpperCase(Locale.ROOT).trim ();
//        lineProduct.stream ()
//                .filter (size -> size.size.equals (marime))
//                .forEach (System.out::println);


//
//        System.out.println (productDetails.stream ().max (Comparator.comparing (productDetail -> productDetail.SKU)));
////        productDetails.stream().map (line -> line.split)
//
//        System.out.println (productDetails.size ());
//        int lastSKU = 0;
//        productDetails.stream ().max (Comparator.comparing (productDetail -> productDetail.SKU))
//                .map (line-> ProductDetail(Integer.parseInt (line[0]));

        System.out.println (AddingNewProduct.readFile ().stream().max (Comparator.comparing (productDetail -> productDetail.SKU)));


        System.out.println (AddingNewProduct.readFile ().get (2).price +AddingNewProduct.readFile ().get (2).productName +AddingNewProduct.readFile ().get (2).stock);
        List<ProductDetail> listutaDeTestNume = AddingNewProduct.readFile ();
                listutaDeTestNume.stream ()
                .max (Comparator.comparing (productDetail -> productDetail.productName.equals( "ACG GORE-TEX")));

                listutaDeTestNume.stream ().filter (name-> name.productName.equals ("ACG GORE-TEX")).forEach (System.out::println);


    }

}
