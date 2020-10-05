package edu.escuelaing.arsw.rECIclaParty.models.users;

import java.util.Date;
import java.util.List;

public class Asociacion extends Usuario {
    private String NIT;
    private String razonSocial;
    private List<Sede> sedes;
    private Genero genero;
    private String telefono;
    private Date nacimiento;

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(List<Sede> sedes) {
        this.sedes = sedes;
    }

    @Override
    public Genero getGenero() {
        return genero;
    }

    @Override
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public Date getNacimiento() {
        return nacimiento;
    }

    @Override
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
}
