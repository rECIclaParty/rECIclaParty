package edu.escuelaing.arsw.rECIclaParty;

import edu.escuelaing.arsw.rECIclaParty.models.services.UserRepository;
import edu.escuelaing.arsw.rECIclaParty.models.users.Genero;
import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Date;

@SpringBootApplication
public class App 
{
    @Autowired
    private UserRepository users;
    public static void main( String[] args )
    {

        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

    public void run(String[] args){
        users.save(new Usuario("Jota Mario","jm@f.com", Genero.HOMBRE,"311","10-10-1999"));
        System.out.println(users.getByCorreo("jm@f.com"));
        users.findAll().forEach(x -> System.out.println(x));


    }
}
