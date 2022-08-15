package Adress;


public class Address {
    private int index, house, apartament;
    private String street, country, city;
    public Address() {
    }

    public int getindex() {
        return index;
    }
    public void setindex(int index) {
        this.index = index;
    }

    public String getcountry() {
        return country;
    }
    public void setcountry(String country) {
        this.country = country;
    }

    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
    }

    public String getstreet() {
        return street;
    }
    public void setstreet(String street) {
        this.street = street;
    }

    public int gethouse() {
        return house;
    }
    public void sethouse(int house) {
        this.house = house;
    }

    public int getapartament() {
        return apartament;
    }
    public void setapartament(int apartament) {
        this.apartament = apartament;
    }


}
