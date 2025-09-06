/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO CLASSE AUTHOR ===");
        
        // 1. Testar construtor
        Author author = new Author("Wellington Tuler", "tulermorales@yahoo.com", 'm');
        System.out.println("Autor criado com sucesso!");
        
        // 2. Verificar o método toString()
        System.out.println("\nMétodo toString():");
        System.out.println(author.toString());
        
        // 3. Testar o Setter
        System.out.println("\nTestando setEmail():");
        author.setEmail("novoemail@yahoo.com");
        System.out.println("Email alterado: " + author.toString());
        
        // 4. Testar os Getters
        System.out.println("\nTestando Getters:");
        System.out.println("getName(): " + author.getName());
        System.out.println("getEmail(): " + author.getEmail());
        System.out.println("getGender(): " + author.getGender());
        
        System.out.println("\n=== TESTE CONCLUÍDO ===");
    }
}
