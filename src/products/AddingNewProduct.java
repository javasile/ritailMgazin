package products;
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

            List<ProductDetail> list = readFile ();
            readFile ();
            writeFile (list);

        }catch (Exception e){
            e.printStackTrace ();
        }
    }

    public static List<ProductDetail> readFile() {

        List<ProductDetail> list = new ArrayList<> ();


        try {

            Files.lines(Path.of (productDoc ))
                    .map(line -> line.split (" :.: "))
                    .map (line -> new ProductDetail (Integer.parseInt (line[0]), line[1], (Double.parseDouble (line[2])), Integer.parseInt (line[3]), line[4], line[5], line[6], line[7], line[8]))
                    .forEach (list::add);

        }catch (Exception e) {
            e.printStackTrace ();
        }
        return list;

    }

    public static void writeFile(List<ProductDetail> list){

       ProductDetail newProduct = NewProduct.Product ();
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
