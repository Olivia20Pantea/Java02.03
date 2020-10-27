package com.company;

public class Clothing {
    private String type;
    private String material;
    private Boolean recomandation;
    private Integer amount;
    private  Float price;

    public Clothing()
    {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Boolean getRecomandation() {
        return recomandation;
    }

    public void setRecomandation(Boolean recomandation) {
        this.recomandation = recomandation;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Clothing{" +
                " type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", recomandation=" + recomandation +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}