/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class TestBook {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO CLASSE BOOK ===");
        
        // 1. Criar array de autores (como no exemplo)
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
        
        // 2. Testar construtores
        System.out.println("\nCriando livros...");
        Book book1 = new Book("Java for Dummy", authors, 19.99);
        Book book2 = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println("Livros criados com sucesso!");
        
        // 3. Testar toString()
        System.out.println("\nMétodo toString():");
        System.out.println("Book 1: " + book1.toString());
        System.out.println("Book 2: " + book2.toString());
        
        // 4. Testar getters
        System.out.println("\nTestando Getters:");
        System.out.println("Nome do livro: " + book2.getName());
        System.out.println("Preço: " + book2.getPrice());
        System.out.println("Quantidade: " + book2.getQty());
        System.out.println("Nomes dos autores: " + book2.getAuthorNames());
        
        // 5. Testar setters
        System.out.println("\nTestando Setters:");
        book2.setPrice(29.99);
        book2.setQty(50);
        System.out.println("Após alterações: " + book2.toString());
        
        System.out.println("\n=== TESTE CONCLUÍDO ===");
    }
}
