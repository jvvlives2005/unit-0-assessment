package nyc.c4q;

public class Person {
    private String name;
    private long phoneNumber;                             //changed from string to long since the phone number should give integers
    private String city;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhoneNumber() {                      //changed from string to long since the phone number should give integers
        return phoneNumber;
    }

    public long setPhoneNumber(long phoneNumber) {     //changed from string to long since the phone number should give integers
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
