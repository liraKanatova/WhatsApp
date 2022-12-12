package whatsApp.Impl;

import whatsApp.classes.Passport;
import whatsApp.classes.Profile;
import whatsApp.classes.WhatsApp;
import whatsApp.enums.Status;
import whatsApp.services.WhatsAppservice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class WhatsAppImpl implements WhatsAppservice {

    List<WhatsApp> whatsApps = new LinkedList<>();
    Queue<String>sendMassages=new LinkedList<>();

    @Override
    public List<Profile> getAllWhatsApp() {
        List<Profile> profiles = new LinkedList<>();
        for (WhatsApp whatsApp : whatsApps) {
            profiles.add(whatsApp.getProfile());

        }
        return profiles;
    }

    @Override
    public String yourProfile() {
        System.out.println("Napishite vash password: ");
        String password = new Scanner(System.in).next();
        for (WhatsApp whatsApp : this.whatsApps) {
            if (whatsApp.getPossword().equals(password)) {
                System.out.println(whatsApp.getProfile());
            }

        }
        return "Vash password ne naideno!";
    }

    @Override
    public void allStatus() {
        for (Status value : Status.values()) {
            System.out.println(value);

        }

    }

    @Override
    public String installWhatsApp(PersonServiceImpl person) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Napishite vash ID: ");
        int id = scanner.nextInt();
        System.out.print("Napishite nomer phone: ");
        String phoneNumber = scanner.next();
        System.out.print("Napishite user name: ");
        String userName = scanner.next();
        System.out.print("Napishite password: ");
        String password = scanner.next();
        Profile profile = new Profile(phoneNumber, null, null, userName);
        for (Passport passport : person.getAllPassport()) {
            if (passport.getId() == id) {
                WhatsApp whatsApp = new WhatsApp(passport, password, profile);
                this.whatsApps.add(whatsApp);
                System.out.print("Uspeshno installed!");
                return "~~~~~~~~~~~~~~~~~~~~~~~";
            }
        }
        return "Vash id ne naideno!";
    }

    @Override
    public String changeStatus() {
        System.out.print("Napishite vash whatsApp password: ");
        String password = new Scanner(System.in).next();
        for (WhatsApp whatsApp : this.whatsApps) {
            if (whatsApp.getPossword().equals(password)) {
                System.out.print("Vash tekushiy ststus: " + whatsApp.getProfile());
                System.out.print("Napishite vash noviy status:");
                Status status1 = Status.valueOf(new Scanner(System.in).next());
                whatsApp.getProfile().setStatus(status1);
                return "Vash profile uspeshno pomenialsia! ";
            }

        }
        return "Ne naideno whatsApp polzovatelia! ";
    }

    @Override
    public String addContact() {
        System.out.print("Napishite password: ");
        String password = new Scanner(System.in).next();
        System.out.print("Napishite ,phone nomber: ");
        String phoneNumber = new Scanner(System.in).next();
        for (WhatsApp whatsApp : whatsApps) {
            if (whatsApp.getPossword().equals(password)) {
                for (WhatsApp app : whatsApps) {
                    if (app.getProfile().getPhoneNumber().equals(phoneNumber)) {
                        whatsApp.getContacts().put(app.getProfile().getPhoneNumber(), app.getProfile().getUserName());
                        System.out.println(app.getProfile().getUserName() + "---->");
                        return "Uspeshno dobavili!";
                    }
                }
            }

        }
        return "porol ne pravilno!";
    }

    @Override
    public String sendMassage() {
        System.out.println("Napishite vash password: ");
        String password=new Scanner(System.in).next();
        System.out.println("Komy ty hochesh napisat?");
        String userName=new Scanner(System.in).next();
        boolean correct=true;
        for (WhatsApp whatsApp : whatsApps) {
            if(whatsApp.getPossword().equals(password)){
                while (correct){
                    String massage=new Scanner(System.in).next();
                    if(massage.equals("send")){
                        correct=false;
                        return "massage uspeshno sent!";
                    }else {
                        this.sendMassages.add(whatsApp.getProfile().getUserName()+": "+ massage);
                    }
                }
            }

        }

        return" ";
    }


    @Override
    public Queue<String> seeMassage() {
        return this.sendMassages;
    }

    @Override
    public Status seeStatus() {
        System.out.println("Napishite user name: ");
        String userName = new Scanner(System.in).next();
        for (WhatsApp whatsApp : this.whatsApps) {
            if (whatsApp.getProfile().getUserName().equals(userName))
                return whatsApp.getProfile().getStatus();

            }
            return null;
        }
    }