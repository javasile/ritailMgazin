package products.supplier;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SupplierBuilder {


    public static void findMenuSupplier() {
        Scanner scannerText = new Scanner (System.in);
        Scanner scannerNumber = new Scanner (System.in);

        List<Supplier> list = AddingSupplier.readSupplier ();

        System.out.println ("""
                1 - Do you want to find by supplier Name? Write nr.1\s
                2 - Do you want to find by supplier VIES? Write nr.2\s
                3 - Do you want to find by supplier Contact person? Write nr.3\s
                4 - Do you want to find by supplier Phone number? Write nr.4\s
                5 - Do you want to find by supplier Email adress? Write nr.5\s
                6 - Do you want ascending sort by name? Write nr.6\s
                7 - Do you want to Exit from searching menu? Write nr.7\s""");

        int questNumber = scannerNumber.nextInt ();

        switch (questNumber) {
            case 1 -> {
                System.out.print ("Insert Name of supplier: ");
                String nume = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();
                list.stream ()
                        .filter (name -> name.companyName.equals (nume))
                        .forEach (System.out::println);
            }
            case 2 -> {
                System.out.print ("Insert supplier VIES: ");
                String vies = scannerText.nextLine ().trim ();
                list.stream ()
                        .filter (ro -> ro.cui.equals (vies))
                        .forEach (System.out::println);
            }
            case 3 -> {
                System.out.print ("Insert contact person of supplier: ");
                String numeContact = scannerText.nextLine ().toUpperCase (Locale.ROOT).trim ();
                list.stream ()
                        .filter (suplierContact -> suplierContact.contactName.equals (numeContact))
                        .forEach (System.out::println);
            }
            case 4 -> {
                System.out.print ("Insert phone number of supplier: ");
                String numarTelefon = scannerText.nextLine ().trim ();
                list.stream ()
                        .filter (numarTel -> numarTel.getContactPhone.equals (numarTelefon))
                        .forEach (System.out::println);
            }
            case 5 -> {
                System.out.print ("Insert email adress of supplier: ");
                String mail = scannerText.nextLine ().trim ();
                list.stream ()
                        .filter (adressMail -> adressMail.email.equals (mail))
                        .forEach (System.out::println);
            }
            case 6 -> list.stream ().sorted (Comparator.comparing (supplier -> supplier.companyName))
                    .forEach (System.out::println);
            case 7 -> System.exit (0);
            default -> System.out.println ("Ivalid number inserted!");
        }

    }

}
