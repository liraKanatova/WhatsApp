package whatsApp.services;

import whatsApp.Impl.PersonServiceImpl;
import whatsApp.classes.Profile;
import whatsApp.enums.Status;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public interface WhatsAppservice {
    List<Profile> getAllWhatsApp();
   String yourProfile();
    void allStatus();
    String installWhatsApp(PersonServiceImpl person);
    String changeStatus();
    String addContact();
    String sendMassage();
    Status seeStatus();
    Queue<String>seeMassage();

}
