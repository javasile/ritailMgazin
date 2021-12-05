package products.supplier;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AddingSupplier {
    public static final String supplierDoc = "src/products/supplier/SupplyerList";

    public static void addingSupplier(){

        try {
            List<Supplier> supplierList = readSupplier();
            readSupplier();
            writeSupplier(supplierList);
        }catch (Exception e){
            e.printStackTrace ();
        }
    }

    public static List<Supplier> readSupplier(){

        List<Supplier> supplierList = new ArrayList<> ();
        try {
            Files.lines (Path.of (supplierDoc))
                    .map(line -> line.split (" :.: "))
                    .map (line-> new Supplier (Integer.parseInt (line[0]), line[1], line[2], line[3], line[4], line[5], line[6]))
                    .forEach (supplierList::add);
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return supplierList;
    }
    public static void writeSupplier(List<Supplier> supplierList){

        Supplier newSupplier = NewSupplier.supplier ();
        Object listOfSupplier = newSupplier.toString ();
        StringBuilder content = new StringBuilder ();
        supplierList.forEach (threadmill-> content.append (threadmill.toString ()).append ("\n"));

        try ( FileWriter fileWriter = new FileWriter (supplierDoc)){
            fileWriter.write (content.toString () + listOfSupplier);

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
