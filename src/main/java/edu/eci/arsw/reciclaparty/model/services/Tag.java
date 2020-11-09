package edu.eci.arsw.reciclaparty.model.services;

import javax.persistence.*;

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long objeto;
    private long valor;

    public Tag(){}

    public Tag(long objeto, long valor) {
        this.objeto = objeto;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getObjeto() {
        return objeto;
    }

    public void setObjeto(long objeto) {
        this.objeto = objeto;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", objeto=" + objeto +
                ", valor=" + valor +
                '}';
    }

}
