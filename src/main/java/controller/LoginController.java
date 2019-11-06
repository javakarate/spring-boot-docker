package controller;

import com.nc.utils.LogUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return LogUtil.getCurrentDateTime() +  " Logged in user!";
    }
}
