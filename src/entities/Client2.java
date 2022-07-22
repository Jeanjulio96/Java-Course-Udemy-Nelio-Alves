package entities;

import java.util.Objects;

public class Client2 {

    private String name;
    private String email;

    public Client2(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client2 client2 = (Client2) o;
        return Objects.equals(name, client2.name) && Objects.equals(email, client2.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
