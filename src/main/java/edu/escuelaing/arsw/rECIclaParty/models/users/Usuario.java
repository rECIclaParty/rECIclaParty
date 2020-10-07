package edu.escuelaing.arsw.rECIclaParty.models.users;

import javax.persistence.*;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String correo;
    private Genero genero;
    private String telefono;
    private String nacimiento;

    public Usuario(){}

    public Usuario(String nombre, String correo, Genero genero, String telefono, String nacimiento) {
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", genero=" + genero +
                ", telefono='" + telefono + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
