package kr.or.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

//import kr.or.smhrd.dto.UserDTO;
import kr.or.smhrd.service.LoginService;
//import kr.or.smhrd.service.UserService;
import kr.or.smhrd.dto.LoginDTO;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginservice;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login") 
    public String loginAction(LoginDTO loginDTO, HttpServletRequest request) {
        LoginDTO result = loginservice.loginAction(loginDTO); 

        if(result != null) {
			request.getSession().setAttribute("u_id", result.getU_id());
			request.getSession().setAttribute("u_pw", result.getU_pw());
			request.getSession().setAttribute("u_name", result.getU_name());
			request.getSession().setAttribute("u_email", result.getU_email());
			request.getSession().setAttribute("u_phone", result.getU_phone());
			request.getSession().setAttribute("u_birthdate", result.getU_birthdate());
			request.getSession().setAttribute("u_gender", result.getU_gender());
			request.getSession().setAttribute("u_photo", result.getU_photo());
			// 
			return "redirect:/board";
			
        } else {
            if (request.getSession().getAttribute("u_id") != null) {
                request.getSession().removeAttribute("u_id");
            }
            if (request.getSession().getAttribute("u_pw") != null) {
                request.getSession().removeAttribute("u_pw");
            }
            if (request.getSession().getAttribute("u_name") != null) {
                request.getSession().removeAttribute("u_name");
            }
            if (request.getSession().getAttribute("u_email") != null) { 
                request.getSession().removeAttribute("u_email");
            }
            if (request.getSession().getAttribute("u_phone") != null) {
                request.getSession().removeAttribute("u_phone");
            }
            if (request.getSession().getAttribute("u_birthdate") != null) {
                request.getSession().removeAttribute("u_birthdate");
            }
            if (request.getSession().getAttribute("u_gender") != null) {
                request.getSession().removeAttribute("u_gender");
            }
            if (request.getSession().getAttribute("u_photo") != null) {
                request.getSession().removeAttribute("u_photo");
            }
            return "redirect:/board";
        }
    }
}
