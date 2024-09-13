package com.e_shop.e_shop.backend.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * A product available for purchasing.
 */
@Entity
@Table(name = "product")
public class Product {

    /**
     * Unique id for the product.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * The brand of the product.
     */
    @Column(name = "brand", nullable = false)//changed from name
    private String brand;
    /**
     * The title of the product.
     */
    @Column(name = "title") //changed from longDescription
    private String title;
    /**
     * The picture location?? of the product.
     */
    @Column(name = "pictureLocation") //changed from longDescription
    private String pictureLocation;
    /**
     * The color of the product.
     */
    @Column(name = "color") //changed from longDescription
    private String color;
    /**
     * The price of the product.
     */
    @Column(name = "price", nullable = false)
    private Double price;
    /**
     * The short description of the product.
     */
    @Column(name = "short_description", nullable = false)
    private String shortDescription;
    /**
     * The stock availability of the product.
     */ //is it the same as stockAvailability
    @OneToOne(mappedBy = "product", cascade = CascadeType.REMOVE, optional = false, orphanRemoval = true)
    private Inventory inventory;
    //@Column(name = "stock_availability", nullable = false)
    //private Integer stockAvailability;

    /**
     * Gets the id of the product.
     *
     * @return The id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the product.
     *
     * @param id The id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the brand of the product.
     *
     * @return The brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the name of the product.
     *
     * @param brand The brand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }


    /**
     * Gets the title of the product.
     *
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the product.
     *
     * @param title The title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the picture location of the product???.
     *
     * @return The picture location.
     */
    public String getPictureLocation() {
        return pictureLocation;
    }

    /**
     * Sets the picture location of the product.
     *
     * @param pictureLocation The long description.
     */
    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    /**
     * Gets the color of the product.
     *
     * @return The color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the product.
     *
     * @param color The color of the product.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the price of the product.
     *
     * @return The price.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The price.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Gets the short description of the product.
     *
     * @return The short description.
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the short description of the product.
     *
     * @param shortDescription The short description.
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * Gets the stock availability of the product.
     *
     * @return The stock availability.
     */
    public Integer getStockAvailability() {
        return stockAvailability;
    }
    /**
    * Sets the inventory of the product.
    * @param stockAvailability The stock availability.
    */
    public void setStockAvailability (Integer stockAvailability) {
        this.stockAvailability = stockAvailability;
}

}