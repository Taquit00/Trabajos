/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

import java.util.ArrayList;

public class Estudiante {
    int id;
    String name;
    String address;
    String phone;
    
    
    ArrayList<Materia>materias;

    public Estudiante(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        materias = new ArrayList<>();
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }
    
    public int id() {
        return id;
    }
    public String name() {
        return name;
    }
    
    public String address(){
        return address;
    }
    public String phone(){
        return phone;
    }
    
        
}
