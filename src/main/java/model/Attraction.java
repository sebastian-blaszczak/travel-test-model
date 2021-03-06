package model;

import java.util.Objects;

public final class Attraction implements Place {


    private final String name;
    private final Address address;
    private Tip tip;

    public Attraction(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    @Override
    public Tip getTip() {
        return tip;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attraction that = (Attraction) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(tip, that.tip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, tip);
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
