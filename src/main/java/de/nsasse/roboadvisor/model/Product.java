package de.nsasse.roboadvisor.model;

public class Product {

    private Long id;

    private String isin;

    private String name;

    private ProductType productType;

    private Region region;

    private Double indexLevel;

    private Double performanceTotal;

    private Double performanceThisYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Double getIndexLevel() {
        return indexLevel;
    }

    public void setIndexLevel(Double indexLevel) {
        this.indexLevel = indexLevel;
    }

    public Double getPerformanceTotal() {
        return performanceTotal;
    }

    public void setPerformanceTotal(Double performanceTotal) {
        this.performanceTotal = performanceTotal;
    }

    public Double getPerformanceThisYear() {
        return performanceThisYear;
    }

    public void setPerformanceThisYear(Double performanceThisYear) {
        this.performanceThisYear = performanceThisYear;
    }
}
