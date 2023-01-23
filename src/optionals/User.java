package optionals;

public class User {
    private Address address;

    public Address getAddress() {
        return address;
    }
}

class Address {
    private Country country;

    public Country getCountry() {
        return country;
    }
}

class Country {
    private String isoCode;

    public String getIsoCode() {
        return isoCode;
    }
}
