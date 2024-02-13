package odev15;

import java.lang.module.ModuleDescriptor;
import java.util.Locale;

public class Product {
    private String name;
    private String category;
    private double price;

    private Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory(){
        return category;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder {
        private String name;
        private String category;
        private double price = 0.0;

        public Builder(String name, String category) {
            this.name = name;
            this.category = category;
        }

        public Builder price( double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(name, category, price);
        }
    }
    public static void main(String[] args) {
        Product product = new Builder("Kalem", "Kırtasiye Ürünü")
                .price(20.99)
                .build();

        System.out.println("Ürün Adı: " + product.getName());
        System.out.println("Kategori: " + product.getCategory());
        System.out.println("Fiyatı: " + product.getPrice() + " TL");
    }
}
