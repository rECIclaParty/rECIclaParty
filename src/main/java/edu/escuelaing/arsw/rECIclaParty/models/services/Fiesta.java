package edu.escuelaing.arsw.rECIclaParty.models.services;

import edu.escuelaing.arsw.rECIclaParty.models.users.Cliente;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Entity
public class Fiesta extends Publicacion implements Serializable {
    @Id
    private int identificador;
    //private ClientRepository participantes;
    //@Column()
    private Date startDate;
    private Date endDate;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Cliente> participantes;
    private int idMiniJuego;


}
