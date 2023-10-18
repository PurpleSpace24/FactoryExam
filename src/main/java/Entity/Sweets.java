package Entity;

import java.time.LocalDate;
import java.util.Comparator;

public class Sweets {
    private long regNumber;
    private String name;
    private LocalDate productionDate;
    private Double productionPrice;
    private Integer producedQuantity;
    private SweetType sweetsType;

    public Sweets() {
    }

    public Sweets(long regNumber, String name, LocalDate productionDate, Double productionPrice, Integer producedQuantity, SweetType sweetsType) {
        this.regNumber = regNumber;
        this.name = name;
        this.productionDate = productionDate;
        this.productionPrice = productionPrice;
        this.producedQuantity = producedQuantity;
        this.sweetsType = sweetsType;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public Double getProductionPrice() {
        return productionPrice;
    }

    public void setProductionPrice(Double productionPrice) {
        this.productionPrice = productionPrice;
    }

    public Integer getProducedQuantity() {
        return producedQuantity;
    }

    public void setProducedQuantity(Integer producedQuantity) {
        this.producedQuantity = producedQuantity;
    }

    public SweetType getSweetsType() {
        return sweetsType;
    }

    public void setSweetsType(SweetType sweetsType) {
        this.sweetsType = sweetsType;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "regNumber=" + regNumber +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                ", productionPrice=" + productionPrice +
                ", producedQuantity=" + producedQuantity +
                ", sweetsType=" + sweetsType +
                '}';
    }

    public static Comparator<Sweets> sweetsProductionDate = new Comparator<Sweets>() {
        @Override
        public int compare(Sweets sweets, Sweets sweets1) {
            return sweets.getProductionDate().compareTo(sweets1.getProductionDate());
        }
    };

    public static Comparator<Sweets> sweetsName = new Comparator<Sweets>() {
        @Override
        public int compare(Sweets o1, Sweets o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
