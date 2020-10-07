package edu.escuelaing.arsw.rECIclaParty;

import edu.escuelaing.arsw.rECIclaParty.models.users.Genero;
import edu.escuelaing.arsw.rECIclaParty.models.users.Repositories.UsuarioRepository;
import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class App {



    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("Hola aqui estoy");

    }

}

