package model;

public class store {
    private String name;
    private double maskPrice;
    private double toiletPaperPrice;
    private double handSanitizerPrice;

    public store(String name, double maskPrice, double toiletPaperPrice, double handSanitizerPrice){
        this.name = name;
        this.maskPrice = maskPrice;
        this.toiletPaperPrice = toiletPaperPrice;
        this.handSanitizerPrice = handSanitizerPrice;
    }

    public double getHandSanitizerPrice() {
        return handSanitizerPrice;
    }

    public double getMaskPrice() {
        return maskPrice;
    }

    public double getToiletPaperPrice() {
        return toiletPaperPrice;
    }
}
