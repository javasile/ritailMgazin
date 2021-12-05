package products.discount;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SetDiscount {
    public static final String discountDoc = "src/products/discount/ProductDiscountList";

    public static void addingDiscount() {
try {
    List<Discount> discountList = readDiscount ();
    readDiscount ();
    writeDiscount (discountList);
}catch (Exception e){
    e.printStackTrace ();
}
    }

    public static List<Discount> readDiscount() {
        List<Discount> discountList = new ArrayList<> ();

        try {
            Files.lines (Path.of (discountDoc))
                    .map (line -> line.split (" :.: "))
                    .map (line -> new Discount (Integer.parseInt (line[0]), Double.parseDouble (line[1])))
                    .forEach (discountList::add);
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return discountList;
    }

    public static void writeDiscount(List<Discount> discountList) {

        Discount newDiscount = NewDiscount.ProductDiscount ();
        Object listOfDiscount = newDiscount.toString ();
        StringBuilder content = new StringBuilder ();
        discountList.forEach (threadmill-> content.append (threadmill.toString ()).append ("\n"));

        try( FileWriter fileWriter = new FileWriter (discountDoc)) {
            fileWriter.write (content.toString () + listOfDiscount);

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
