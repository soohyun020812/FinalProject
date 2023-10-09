package kr.or.smhrd.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.smhrd.dao.PaymentDAO;

@Controller
public class PaymentController {
    private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private PaymentDAO PServ;

    private ModelAndView mv;

    @PostMapping("payment")
    @ResponseBody
    public String insertMPay(@RequestBody PaymentDAO Ppay, HttpSession session, RedirectAttributes rttr) {
        log.info("payment()");

        String view = ((PaymentDAO) PServ).psrv(Ppay, session, rttr);
        return view;
    }

    @GetMapping("payment")
    public ModelAndView paymentContents(String sub_no, HttpSession session) {
        log.info("paymentContents()");

        mv = ((PaymentController) PServ).paymentContents(sub_no, session);
        return mv;
    }
}
