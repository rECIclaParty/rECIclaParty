package edu.escuelaing.arsw.rECIclaParty.web;
import edu.escuelaing.arsw.rECIclaParty.models.users.Genero;
import edu.escuelaing.arsw.rECIclaParty.models.users.Repositories.ClienteRepository;
import edu.escuelaing.arsw.rECIclaParty.models.users.Repositories.UsuarioRepository;
import edu.escuelaing.arsw.rECIclaParty.models.users.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {

    @Autowired(required = true)
    private UsuarioRepository usuarioRepository;
    @Autowired(required = true)
    private ClienteRepository clienteRepository;

    @RequestMapping("/holaPrueboUser")
    public ResponseEntity<String> index() {
        Usuario aux  = new Usuario("Jota Mario","jm@f.com", Genero.HOMBRE,"311","10-10-1999");
        System.out.println("Aqui cree el usuario"+aux);
        usuarioRepository.save(aux);
        usuarioRepository.getByCorreo("jm@f.com").forEach(x -> System.out.println(x));
        usuarioRepository.findAll().forEach(x -> System.out.println(x));
        return new ResponseEntity<>("Greetings from Spring Boot!", HttpStatus.ACCEPTED);
    }
}
