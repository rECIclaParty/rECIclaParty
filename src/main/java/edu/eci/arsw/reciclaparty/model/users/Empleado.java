package edu.eci.arsw.reciclaparty.model.users;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="empleado")
public class Empleado extends User{

    private String asociacion;

    public Empleado(){

    }

    public Empleado(String asociacion) {
        this.asociacion = asociacion;
    }

    public Empleado(String nombre, String password, String correo, String telefono, Genre genero, Date nacimiento, int puntos, String asociacion) {
        super(nombre, password, correo, telefono, genero, nacimiento, puntos);
        this.asociacion = asociacion;
    }

    public String getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(String asociacion) {
        this.asociacion = asociacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "asociacion='" + asociacion + '\'' +
                '}';
    }
}
