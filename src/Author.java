/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
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
