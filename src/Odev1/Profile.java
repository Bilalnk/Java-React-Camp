package Odev1;

public class Profile {

    private static int ID = 1;
    private String name;
    private String surname;
    private String email;
    private Address address;

    public Profile(String name, String surname, String email, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public int getId() { return ID; }

    public static void setId() { Profile.ID += 1; }
}
