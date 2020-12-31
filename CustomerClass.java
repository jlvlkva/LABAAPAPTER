package sample;

public class CustomerClass implements Customer {
    private String companyName;
    private String countryName;

    public CustomerClass() {
        this.companyName = "JavaRush Ltd.";
        this.countryName = "Ukraine";
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getCountryName() {

        return countryName;
    }
}
