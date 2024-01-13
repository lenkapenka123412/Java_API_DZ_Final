public class Laptop {
    private String brand;
    private int ramSize;
    private int storageSize;
    private String operatingSystem;
    private String color;

    public Laptop(String brand, int ramSize, int storageSize, String operatingSystem, String color) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }
}
