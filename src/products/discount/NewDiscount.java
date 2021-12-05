package products.discount;

import products.detailProductPack.AddingNewProduct;
import java.util.Scanner;

public class NewDiscount {
    public static Discount ProductDiscount(){
        Scanner scannerNumber = new Scanner (System.in);

            double percentage;
            double valueOfPrice;

        Discount discount = new Discount ();

        System.out.println ("Insert SKU number of product adding discount: ");
        discount.setSku (scannerNumber.nextInt ());

        System.out.println ("Ad the percentage discount of product: ");
        percentage = scannerNumber.nextDouble ();
          valueOfPrice= AddingNewProduct.readFile ().get (discount.sku).getPrice () * (percentage/100);
        discount.setDiscountPrice (valueOfPrice);

        return discount;
    }
}
