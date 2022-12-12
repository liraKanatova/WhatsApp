package whatsApp.Impl;

import whatsApp.classes.Passport;
import whatsApp.enums.City;
import whatsApp.enums.Gender;
import whatsApp.services.Personservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements Personservice {
    List<Passport>passports=new ArrayList<>();
    @Override
    public List<Passport> getAllPassport() {

        return passports;
    }

    @Override
    public Passport getPassByFirstName() {
        System.out.println("Napishite vashe imia:  ");
        String name =new Scanner(System.in).next();
        for (Passport passport :this. passports) {
            if(passport.getFirstName().equals(name)){
                return passport;
            }

            }return null;

        }


    @Override
    public void getAllCity() {
        for (City value : City.values()) {
            System.out.println(value);
    }
    }

    @Override
    public void creatPassport() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Napishite id: ");
        int id= scanner.nextInt();
        System.out.print("Napishite imia: ");
        String name= scanner.next();
        System.out.print("Napishete familia: ");
        String lastName=scanner.next();
        System.out.println("Napishete datu rojdenie(yyyy,mm,dd): ");
        LocalDate dateOfBirth=LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("Napishite gorod: ");
        City city=City.valueOf(scanner.next());
        System.out.println("Napishite gender: ");
        Gender gender= Gender.valueOf(scanner.next());
        Passport passport=new Passport(id,name,lastName,dateOfBirth,city,gender);
        passports.add(passport);
        System.out.println("Vash passport gotov!");
        System.out.println(passport);






    }
}
