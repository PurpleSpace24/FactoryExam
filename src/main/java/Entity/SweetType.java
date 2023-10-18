package Entity;

public enum SweetType {
    CHOCOLATE(1) , BISQUITS(2) ,WAFFLE(3);

    private Integer n;

    SweetType(Integer n) {
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}
