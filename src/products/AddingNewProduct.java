package products;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AddingNewProduct {
    public static final String productDoc = "src/products/ProductList";

    public static void adingTheProduct() {
        try {

            readFile ();
            writeFile(readFile ());

        }catch (Exception e){
            e.printStackTrace ();
        }
    }

    public static List<Treadmill> readFile() {

        List<Treadmill> list = new ArrayList<> ();


        try {

            Files.lines(Path.of (productDoc ))
                    .forEach (lines -> System.out.println ());

        }catch (Exception e) {
            e.printStackTrace ();
        }
        return list;

    }

    public static void writeFile(List<Treadmill>list){

       ProductDetail newProduct = new  NewProduct().Product ();
       Object listOfProducts = newProduct.toString ();
       StringBuilder content = new StringBuilder ();
       list.forEach (treadmill -> content.append (treadmill.toString ()).append ("\n"));

       try (FileWriter fileWriter = new FileWriter (productDoc)){
           fileWriter.write (content.toString () + listOfProducts);
       } catch (IOException e) {
           e.printStackTrace ();
       }

    }

}
