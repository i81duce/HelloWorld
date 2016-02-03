/**
 * Created by KevinBozic on 2/1/16.
 */
public class Pants {

    public int size;
    public String material;
    public boolean ifMale = true;
    public double price; // Aware that double shouldn't be used for currency, just using it as an example
    public boolean ifAvailable;

    public Pants(int size, String material, boolean ifMale, double price, boolean ifAvailable) {
        setSize(size);
        setMaterial(material);
        setIfMale(ifMale);
        setPrice(price);
        setIfAvailable(ifAvailable);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        if (newSize >= 30 && newSize <= 42) {
            System.out.println("This item is Available.");
        } else {
            System.out.println("This item is unavailable.");
        }
        size = newSize;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

    public boolean getIfMale() {
        return ifMale;
    }

    public void setIfMale(boolean newIfMale) {
        ifMale = newIfMale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public boolean getIfAvailable() {
        return ifAvailable;
    }

    public void setIfAvailable(boolean newIfAvailable) {
            ifAvailable = newIfAvailable;
    }

}
