package sample;

public class ContactClass implements Contact {
    private String name;
    private String phoneNumber;

    public ContactClass() {

        this.name = "Ivanov, Ivan";
        this.phoneNumber = "+38(050)123-45-6";

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
