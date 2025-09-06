/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 * 
 * 
 * Uma classe chamada Author é desenhada para servir de modelo para autores de livros, 
veja abaixo: 
 * 
 * 
 * 3 atributos privados name (String), email (String), and gender (char contendo 'm' or 
'f'); - Um construtor para inicializar os atributos com base nos 3 parâmetros. - Não existe um construtor default para Author [Author()]. - Criar métodos públicos: getName(), getEmail(), setEmail(), and getGender(). - Não existe setter para name e gender, estes atributos não podem ser alterados. - Um método chamado toString() que retorna "Author[name=?,email=?,gender=?]", 
exemplo "Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]". - Escreva a classe Author e desenvolva uma de teste, com os seguintes itens: - Testar construtor. - Verificar o método toString(). - Testar o Setter - Testar os Getters 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    // Construtor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public char getGender() {
        return gender;
    }
    
    // Setter apenas para email
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
