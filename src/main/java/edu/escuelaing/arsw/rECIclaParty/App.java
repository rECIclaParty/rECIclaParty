package edu.escuelaing.arsw.rECIclaParty;

import edu.escuelaing.arsw.rECIclaParty.models.services.UserRepository;
import edu.escuelaing.arsw.rECIclaParty.models.users.Genero;
import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class App {
    @Autowired
    private static UserRepository users;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("Hola aqui estoy");
        Usuario aux  = new Usuario("Jota Mario","jm@f.com", Genero.HOMBRE,"311","10-10-1999");
        System.out.println("Aqui cree el usuario"+aux);
        users.save(aux);
        System.out.println(users.getByCorreo("jm@f.com"));
        users.findAll().forEach(x -> System.out.println(x));
    }

}

