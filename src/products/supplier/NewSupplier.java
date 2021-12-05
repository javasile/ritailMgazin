package products.supplier;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NewSupplier {

    public static Supplier supplier(){

        Scanner scannerText = new Scanner (System.in);
        Scanner scannerNumber = new Scanner (System.in);

        Supplier supplierad = new Supplier ();
        List<Supplier>supplierList = AddingSupplier.readSupplier ();
        supplierad.setId (supplierList.size () + 1);

        System.out.print ("Insert Name of Company: ");
        supplierad.setCompanyName (scannerText.nextLine ().toUpperCase(Locale.ROOT).trim ());
        System.out.print ("Insert VIES: ");
        supplierad.setCui (scannerText.nextLine ().trim ());
        System.out.print ("Insert Name of contact person: ");
        supplierad.setContactName (scannerNumber.nextLine ().toUpperCase(Locale.ROOT).trim ());
        System.out.print ("Insert phone number for contact: ");
        supplierad.setGetContactPhone (scannerText.nextLine ().trim ());
        System.out.print ("Insert email contact: ");
        supplierad.setEmail (scannerText.nextLine ().trim ());
        System.out.print ("Insert billAdress of supplier: ");
        supplierad.setBillAdress (scannerText.nextLine ().trim ());

        return supplierad;

    }
}
