package edu.escuelaing.arsw.rECIclaParty.models.users;

import java.util.Date;
import java.util.List;

public class Asociacion extends Usuario {
    private String NIT;
    private String razonSocial;
    private List<Sede> sedes;

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



}
