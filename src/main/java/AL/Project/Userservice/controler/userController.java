package AL.Project.Userservice.controler;


import AL.Project.Userservice.model.user;
import AL.Project.Userservice.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class userController {

    @Autowired
    private userRepository userRepository;

    //Create user
    @PostMapping("/register")
    public user creaUser( user a) {
        return userRepository.save(a);
    }

    //Login
    @GetMapping("/login")
    user login( String username,  String passeword){
        return userRepository.findUserByUsernameAndPasseword(username,passeword);
    }





}
