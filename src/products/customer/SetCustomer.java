package products.customer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SetCustomer {

    public static final String customerDoc = "src/products/customer/CustomerList";
    public static final String companyDoc = "src/products/customer/CompanyList";

    public static void readingCustomerAndCompany() {

    }

    public static void addingCustomer() {
        try {
            List<Customer> customerList = readCustomer ();
            readCustomer ();
            writeCustomer (customerList);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public static void addingCompany() {
        try {
            List<CompanyCustomer> companyList = readCompany ();
            readCompany ();
            writeCompany (companyList);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public static List<Customer> readCustomer() {
        List<Customer> customerList = new ArrayList<> ();
        try {
            Files.lines (Path.of (customerDoc))
                    .map (line -> line.split (" :.: "))
                    .map (line -> new Customer (Integer.parseInt (line[0]), line[1], line[2], line[3], line[4]))
                    .forEach (customerList::add);
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return customerList;
    }

    public static void writeCustomer(List<Customer> customerList) {

        Customer newCustomer = NewCustomer.CustomerQuest ();
        Object listOfCustomer = newCustomer.toString ();
        StringBuilder content = new StringBuilder ();
        customerList.forEach (threadmill -> content.append (threadmill.toString ()).append ("\n"));
        try (FileWriter fileWriter = new FileWriter (customerDoc)) {
            fileWriter.write (content.toString () + listOfCustomer);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    public static List<CompanyCustomer> readCompany() {
        List<CompanyCustomer> companyCustomers = new ArrayList<> ();
        try {
            Files.lines (Path.of (companyDoc))
                    .map (line -> line.split (" :.: "))
                    .map (line -> new CompanyCustomer (Integer.parseInt (line[0]), line[1], line[2]))
                    .forEach (companyCustomers::add);
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return companyCustomers;
    }

    public static void writeCompany(List<CompanyCustomer> companyCustomers) {

        CompanyCustomer newCompany = NewCustomer.CompanyQuest ();
        Object listOfCompany = newCompany.toString ();
        StringBuilder content = new StringBuilder ();
        companyCustomers.forEach (threadmill -> content.append (threadmill.toString ()).append ("\n"));
        try (FileWriter fileWriter = new FileWriter (companyDoc)) {
            fileWriter.write (content.toString () + listOfCompany);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
