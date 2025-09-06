/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 * 
 * 
 * 
 * Um livro pode ser escrito por um ou muitos autores, por esta razão a classe Book deve 
ter um array de autores, conforme o modelo abaixo:
 *  O construtor deve receber um array de autores - Uma vez que o livro é instanciado o seu autor não pode ser adicionado ou removido. - O método toString() deve retornar a seguinte resposta: 
"Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]". 
Você deve:  - Escrever um código para a classe Book, você deve reutilizar o código do Author 
escrito no exercício 1 - Escrever uma classe de teste, chamada TestBook, para testar a classe Book. 
Dicas: 
// Crie e aloque o array de autores. 
Author[] authors = new Author[2]; 
authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm'); 
authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm'); 
// Declarar e alocar a instância de um book. 
Book testeBook = new Book("Java for Dummy", authors, 19.99, 99); 
System.out.println(testeBook);  // toString()
 * 
 * 
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