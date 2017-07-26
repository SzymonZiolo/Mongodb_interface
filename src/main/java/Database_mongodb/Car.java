package Database_mongodb;

/**
 * Created by RENT on 2017-07-26.
 */
public class Car {
    private String model;
    private String manufacturer;
    private String[] addons;
    private String productionYear;
    private int enginePower;

    public Car(String model, String manufacturer, String[] addons, String productionYear, int enginePower) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.addons = addons;
        this.productionYear = productionYear;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String[] getAddons() {
        return addons;
    }

    public void setAddons(String[] addons) {
        this.addons = addons;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
