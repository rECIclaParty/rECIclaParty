package edu.eci.arsw.reciclaparty.model.users;


import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario {
    @Id
    private UUID id = UUID.randomUUID();
    @Column(nullable = false)
    private String nombre;
    @Column(name = "contrasena",nullable = false)
    private String password;
    @Column(nullable = false)
    private String correo;
    private String telefono;
    private Genre genero;
    private Date nacimiento;
    private int puntos;
    private String token;

    public Usuario(){

    }

    public Usuario(String nombre, String password, String correo, String telefono, Genre genero, Date nacimiento, int puntos) {
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.nacimiento = nacimiento;
        this.puntos = puntos;
    }

    public Usuario(String nombre, String password, String correo, String telefono, Genre genero, Date nacimiento, int puntos, String token) {
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.nacimiento = nacimiento;
        this.puntos = puntos;
        this.token = token;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Genre getGenero() {
        return genero;
    }

    public void setGenero(Genre genero) {
        this.genero = genero;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }



    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean addPuntos(int puntos){
        this.puntos+=puntos;
        return true;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", genero=" + genero +
                ", nacimiento=" + nacimiento +
                ", puntos=" + puntos +
                ", token='" + token + '\'' +
                '}';
    }
}
