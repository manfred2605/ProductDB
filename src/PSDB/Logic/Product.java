package PSDB.Logic;

import java.util.Objects;

public class Product {
    public Product() {
    }

    public Product(String proName, String idNumber) {
        this.proName = proName;
        this.idNumber = idNumber;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(idNumber, product.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }

    private String proName;
    private String idNumber;
}
