/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Acer Nitro 5
 */
public class Main {
     public static void main(String[] args) {
        Person person = new Person("Rina", "Bandung", "08123456789", "rina@email.com");
        Student student = new Student("Budi", "Jakarta", "08129876543", "budi@email.com", Student.FRESHMAN);
        Employee employee = new Employee("Sari", "Surabaya", "08124567890", "sari@email.com", "Room 101", 5000000, new MyDate(2022, 4, 12));
        Faculty faculty = new Faculty("Pak Dedi", "Bogor", "08213456789", "dedi@email.com", "Room 201", 7000000, new MyDate(2020, 2, 10), "09:00-17:00", "Professor");
        Staff staff = new Staff("Bu Ani", "Semarang", "08234567891", "ani@email.com", "Room 301", 4000000, new MyDate(2021, 8, 20), "Admin");

        System.out.println(person + "\n");
        System.out.println(student + "\n");
        System.out.println(employee + "\n");
        System.out.println(faculty + "\n");
        System.out.println(staff);
    }
}
