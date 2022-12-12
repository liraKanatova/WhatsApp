package whatsApp.classes;

import java.util.Map;

public class WhatsApp {
    private Passport person;
    private String possword;
    private  Profile profile;
    private Map<String,String>contacts;

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public WhatsApp(Passport person, String possword, Profile profile) {
        this.person = person;
        this.possword = possword;
        this.profile = profile;

    }

    public Passport getPerson() {
        return person;
    }

    public void setPerson(Passport person) {
        this.person = person;
    }

    public String getPossword() {
        return possword;
    }

    public void setPossword(String possword) {
        this.possword = possword;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
