package Assignement4.StaffPortal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showHome() {
        return "home";
    }
    @GetMapping("login")
    public String Login() {

        return "login";

    }
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "login";
    }
    @GetMapping("/leaders")
    public String showLeaders(){
        return "leader";
    }
    @GetMapping("/systems")
    public String admin(){
        return "admin";
    }
    @GetMapping("/access-denied")
    public  String no(){
        return "home";
    }

}
