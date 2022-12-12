package whatsApp.services;

import whatsApp.classes.Passport;

import java.util.List;

public interface Personservice {
    List<Passport> getAllPassport();
    Passport getPassByFirstName();
    void getAllCity();
    void creatPassport();
}