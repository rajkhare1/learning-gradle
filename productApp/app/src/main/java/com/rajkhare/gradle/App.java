/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.rajkhare.gradle;
import com.rajkhare.gradle.Product;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Product product = new Product("Ipad","9th generation",39000.00);
        System.out.println("product name: "+product.getName());
        System.out.println("product desciption: "+product.getDescription());
        System.out.println("product name: "+product.getPrice());
    }
}
