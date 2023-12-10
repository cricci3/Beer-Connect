package com.example.testproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "LimitedEditionBeer")
public class LimitedEditionBeer extends Beer {
    @Id
    @Column(name = "limited_edition_id")
    private Long limitedEditionId;

    @Column(name = "original_beer_name")
    private String originalBeerName;

    @Column(name = "limited_edition_name")
    private String limitedEditionName;

    @Column(name = "production_year")
    private int productionYear;

    @Column(name = "limited_quantity")
    private int limitedQuantity;
    public LimitedEditionBeer(String name_beer, String type, String aroma, Double alcohol, String color, String label, String country, String ingredients, String description, Float price, Integer quantityInStock, Long limitedEditionId, String originalBeerName, String limitedEditionName, int productionYear, int limitedQuantity) {
        super(name_beer, type, aroma, alcohol, color, label, country, ingredients, description, price, quantityInStock);
        this.limitedEditionId = limitedEditionId;
        this.originalBeerName = originalBeerName;
        this.limitedEditionName = limitedEditionName;
        this.productionYear = productionYear;
        this.limitedQuantity = limitedQuantity;
    }

    // Additional methods specific to LimitedEditionBeer
    public Long getLimitedEditionId() {
        return limitedEditionId;
    }

    public void setLimitedEditionId(Long limitedEditionId) {
        this.limitedEditionId = limitedEditionId;
    }

    public String getOriginalBeerName() {
        return originalBeerName;
    }

    public void setOriginalBeerName(String originalBeerName) {
        this.originalBeerName = originalBeerName;
    }

    public String getLimitedEditionName() {
        return limitedEditionName;
    }

    public void setLimitedEditionName(String limitedEditionName) {
        this.limitedEditionName = limitedEditionName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getLimitedQuantity() {
        return limitedQuantity;
    }

    public void setLimitedQuantity(int limitedQuantity) {
        this.limitedQuantity = limitedQuantity;
    }

    @Override
    public String toString() {
        // You can override the toString method to include the additional fields
        return super.toString() + ", limitedEditionId=" + limitedEditionId +
                ", originalBeerName='" + originalBeerName + '\'' +
                ", limitedEditionName='" + limitedEditionName + '\'' +
                ", productionYear=" + productionYear +
                ", limitedQuantity=" + limitedQuantity;
    }
}
