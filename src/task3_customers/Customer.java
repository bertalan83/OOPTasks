package task3_customers;

public class Customer {

    // TODO

    private int id;
    private String name;
    private String postCode;
    private String country;
    private String city;

    public Customer() {
    }

    public Customer(int id, String name, String postCode, String country, String city) {
        this.id = id;
        this.name = name;
        this.postCode = postCode;
        this.country = country;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
