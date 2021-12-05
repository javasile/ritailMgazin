package products.customer;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NewCustomer {
    public static Customer CustomerQuest() {
        Scanner scannerText = new Scanner (System.in);

        Customer customer = new Customer ();
        List<Customer> customers = SetCustomer.readCustomer ();
        customer.setId (customers.size () + 1);


        System.out.print ("Insert first name and last name of new customer: ");
        customer.setFirstAndLastName (scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ());
        System.out.print ("Insert phone of new customer: ");
        customer.setPhone (scannerText.nextLine ().trim ());
        System.out.print ("Inset email for new customer: ");
        customer.setEmail (scannerText.nextLine ().trim ());
        System.out.print ("Insert delivery address of customer: ");
        customer.setDeliveryAddress (scannerText.nextLine ().trim ());

        return customer;
    }

    public static CompanyCustomer CompanyQuest() {
        Scanner scannerText = new Scanner (System.in);

        CompanyCustomer companyCustomer = new CompanyCustomer ();
        List<Customer> customers = SetCustomer.readCustomer ();
        companyCustomer.setId (customers.size ());

        System.out.println ("Insert VIES of new company: ");
        companyCustomer.setVies (scannerText.nextLine ().trim ());
        System.out.println ("Insert the bill company address: ");
        companyCustomer.setBillAddress (scannerText.nextLine ().trim ());

        return companyCustomer;
    }
}
