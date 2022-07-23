package api.mahasiswa.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mahasiswa/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome To The Controller";
    }
}
