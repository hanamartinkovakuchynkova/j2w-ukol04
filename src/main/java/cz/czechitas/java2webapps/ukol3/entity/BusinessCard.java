package cz.czechitas.java2webapps.ukol3.entity;

public class BusinessCard {
    private String name;
    private String company;
    private String street;
    private String cityZipCode;
    private String email;
    private String telephone;
    private String webAddress;

    public BusinessCard() {
    }

    public BusinessCard(String name, String company, String street, String cityZipCode, String email, String telephone, String webAddress) {
        this.name = name;
        this.company = company;
        this.street = street;
        this.cityZipCode = cityZipCode;
        this.email = email;
        this.telephone = telephone;
        this.webAddress = webAddress;
    }

    public String getAddress() {
        return street + ", " + cityZipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityZipCode() {
        return cityZipCode;
    }

    public void setCityZipCode(String cityZipCode) {
        this.cityZipCode = cityZipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
}
