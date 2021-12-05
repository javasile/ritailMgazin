package products.detailProductPack;

import java.util.*;

public class SearchingProduct {

    public static void ApplySherching() {

        Scanner scannerText = new Scanner (System.in);
        Scanner scannerNumber = new Scanner (System.in);

        List<ProductDetail> lineProduct = AddingNewProduct.readFile ();

        System.out.println ("""
                1 - Do you want to find by Category product? Write nr.1\s
                2 - Do you want to find by Name product? Write nr.2\s
                3 - Do you want to find by Size product? Write nr.3\s
                4 - Do you want to find by Color product? Write nr.4\s
                5 - Do you want to find by Brand product? Write nr.5\s
                6 - Do you want ascending sort by price? Write nr.6\s
                7 - Do you want to Exit from searching menu? Write nr.7\s""");

        int numbQuest = scannerNumber.nextInt ();

        switch (numbQuest) {
            case 1 -> {
                System.out.print ("Insert the category of product: ");
                String categorie = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();
                lineProduct.stream ()
                        .filter (category -> category.category.equals (categorie))
                        .forEach (System.out::println);
            }
            case 2 -> {
                System.out.print ("Insert product name: ");
                String nume = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();
                lineProduct.stream ()
                        .filter (name -> name.productName.toUpperCase (Locale.ROOT).equals (nume))
                        .forEach (System.out::println);
            }
            case 3 -> {
                System.out.print ("Insert size of product: ");
                String marime = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();
                lineProduct.stream ()
                        .filter (size -> size.size.equals (marime))
                        .forEach (System.out::println);
            }
            case 4 -> {
                System.out.print ("Insert the color of product: ");
                String culoare = scannerNumber.nextLine ().toUpperCase (Locale.ROOT).trim ();
                lineProduct.stream ()
                        .filter (color -> color.color.equals (culoare))
                        .forEach (System.out::println);
            }
            case 5 -> {
                System.out.print ("Insert brand for searching: ");
                String brands = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();
                lineProduct.stream ()
                        .filter (brand -> brand.brand.equals (brands))
                        .forEach (System.out::println);
            }
            case 6 -> lineProduct.stream ().sorted (Comparator.comparing (productDetail -> productDetail.price))
                    .forEach (System.out::println);
            case 7 -> System.exit (0);
            default -> System.out.println ("Invalid number inserted!");
        }
    }
}