package LECTURE_Stream_API_And_Lambdas.Task3_Product3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Product> listProduct = new ArrayList<>();
        Product product = new Product("BubbleGum", 2.50, 2.0);
        Product product2 = new Product("Lays", 3.20, 10.0);
        Product product3 = new Product("Milk", 1.50, 0.0);
        Product product4 = new Product("Cucumber", 6.0, 35.0);
        Product product5 = new Product("Bread", 1.20, 15.0);
        Product product6 = new Product("Ice-cream", 1.30, 5.0);
        Product product7 = new Product("Sugar", 1.60, 0.0);
        Product product8 = new Product("Mineral water Darida", 0.90, 40.0);

        listProduct.add(product);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);
        listProduct.add(product7);
        listProduct.add(product8);

        Double maxDiscount = listProduct.stream()
                .map(it -> it.getDiscount())
                .max(Comparator.naturalOrder())
                .orElse(0.0);

        Double minPrise = listProduct.stream()
                .map(it -> it.getPrice())
                .min(Comparator.naturalOrder())
                .orElse(0.0);

        List<Product> minPriceInTheCollectionWithTheMaxDiscount = listProduct.stream()
                .filter(it -> it.getPrice().equals(minPrise) && it.getDiscount().equals(maxDiscount))
                .collect(Collectors.toList());

        System.out.println(minPriceInTheCollectionWithTheMaxDiscount);
    }
}
