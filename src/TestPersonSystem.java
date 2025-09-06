/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melin
 */
public class TestPersonSystem {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO SISTEMA PERSON ===");
        
        // Testar Person
        System.out.println("\n1. Testando Person:");
        Person person = new Person("João Silva", "Rua A, 123");
        System.out.println("Person: " + person.toString());
        person.setAddress("Rua B, 456");
        System.out.println("Após mudança de endereço: " + person.toString());
        
        // Testar Student
        System.out.println("\n2. Testando Student:");
        Student student = new Student("Maria Santos", "Av. Principal, 789", 
                                    "Engenharia", 2023, 1500.00);
        System.out.println("Student: " + student.toString());
        
        // Testar métodos Student
        student.setProgram("Medicina");
        student.setYear(2024);
        student.setFee(2000.00);
        System.out.println("Após alterações: " + student.toString());
        
        // Testar Staff
        System.out.println("\n3. Testando Staff:");
        Staff staff = new Staff("Carlos Oliveira", "Praça Central, 321", 
                              "IFSP Cubatão", 5000.00);
        System.out.println("Staff: " + staff.toString());
        
        // Testar métodos Staff
        staff.setSchool("IFSP Santos");
        staff.setPay(5500.00);
        System.out.println("Após alterações: " + staff.toString());
        
        // Testar todos os getters
        System.out.println("\n4. Testando todos os Getters:");
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());
        System.out.println("Student Fee: " + student.getFee());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Pay: " + staff.getPay());
        
        System.out.println("\n=== TESTE CONCLUÍDO ===");
    }
}
