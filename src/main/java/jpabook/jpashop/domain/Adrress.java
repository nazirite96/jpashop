package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Adrress {

    private String city;
    private String street;
    private String zipcode;

    public Adrress() {
    }

    public Adrress(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adrress adrress = (Adrress) o;
        return Objects.equals(getCity(), adrress.getCity())
                && Objects.equals(getStreet(), adrress.getStreet())
                && Objects.equals(getZipcode(), adrress.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getZipcode());
    }
}
