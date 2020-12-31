package sample;

public class IncomeDataClass implements IncomeData {

    private String countryCode;
    private String company;
    private  String contactFirstName;
    private    String contactLastName;
    private   int phoneCode;
    private    int phoneNumber;

    public IncomeDataClass() {

        this.countryCode = "UA";
        this.company = "JavaRush Ltd.";
        this.contactFirstName = "Ivan";
        this.contactLastName = "Ivanov";
        this.phoneCode = 38;
        this.phoneNumber = 50123456;
    }


    @Override
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getContactFirstName() {
        return contactFirstName;
    }

    @Override
    public String getContactLastName() {
        return contactLastName;
    }

    @Override
    public int getCountryPhoneCode() {
        return phoneCode;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }
}
