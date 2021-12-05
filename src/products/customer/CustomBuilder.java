package products.customer;

import java.util.Locale;
import java.util.Scanner;

public class CustomBuilder {


    public static void CustomerAndCompanyAdding() {
        Scanner scannerText = new Scanner (System.in);
        SetCustomer.addingCustomer ();
        System.out.println ("Want billing for the company? \n Y/N: ");
        String answer = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();

        if (answer.equals ("Y")) {
            SetCustomer.addingCompany ();
        }
    }

}
