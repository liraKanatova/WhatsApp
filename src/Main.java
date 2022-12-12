import whatsApp.Impl.PersonServiceImpl;
import whatsApp.Impl.WhatsAppImpl;
import whatsApp.services.WhatsAppservice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl person=new PersonServiceImpl();
        WhatsAppImpl whatsApp=new WhatsAppImpl();
        while (true){
            System.out.println("""
                    ~~~~~~~~~~~~Comands~~~~~~~
                    1 Get all cityis!
                    2 Create a passport!
                    3 Get passport by first name!
                    4 Get all passport!
                    5 Go to your paddport!
                    6 Get all status!
                    7 Install whatsapp!
                    8 Get all whatsapp!
                    9 Change status!
                    10 Add contact!
                    11 Send a massage!
                    12 See a status!
                  
                    """);
           Scanner scanner=new Scanner(System.in);
           int num= scanner.nextInt();
            switch (num) {
                case 1 -> person.getAllCity();
                case 2 -> person.creatPassport();
                case 3 -> System.out.println(person.getPassByFirstName());
                case 4 -> System.out.println(person.getAllPassport());
                case 5 -> System.out.println(whatsApp.yourProfile());
                case 6 -> whatsApp.allStatus();
                case 7 -> System.out.println(whatsApp.installWhatsApp(person));
                case 8 -> System.out.println(whatsApp.getAllWhatsApp());
                case 9 -> System.out.println(whatsApp.changeStatus());
                case 10 -> System.out.println(whatsApp.addContact());
                case 11 -> System.out.println(whatsApp.sendMassage());
                case 12 -> System.out.println(whatsApp.seeStatus());
                case 13-> {
                  for (String s:whatsApp.seeMassage()){
                      System.out.println(s);
                  }
                }
            }
        }

    }
}