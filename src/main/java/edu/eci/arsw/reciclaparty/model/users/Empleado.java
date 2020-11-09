package edu.eci.arsw.reciclaparty.model.users;



import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="empleado")
public class Empleado extends User{

    private UUID asociacion;

    public Empleado(){

    }

    public Empleado(UUID asociacion) {
        this.asociacion = asociacion;
    }

    public Empleado(String nombre, String password, String correo, String telefono, Genre genero, Date nacimiento, int puntos, UUID asociacion) {
        super(nombre, password, correo, telefono, genero, nacimiento, puntos);
        this.asociacion = asociacion;
    }

    public UUID getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(UUID asociacion) {
        this.asociacion = asociacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "asociacion='" + asociacion + '\'' +
                '}';
    }
}
