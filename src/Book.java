/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    // Construtor com qty padrão 0
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }
    
    // Construtor com qty especificado
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public Author[] getAuthors() {
        return authors;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQty() {
        return qty;
    }
    
    // Setters
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    // Método para obter nomes dos autores
    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());
            if (i < authors.length - 1) {
                names.append(",");
            }
        }
        return names.toString();
    }
    
    // Método toString
    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        authorsStr.append("[");
        for (int i = 0; i < authors.length; i++) {
            authorsStr.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsStr.append(",");
            }
        }
        authorsStr.append("]");
        
        return "Book[name=" + name + ",authors=" + authorsStr.toString() + 
               ",price=" + price + ",qty=" + qty + "]";
    }
}