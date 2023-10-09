package kr.or.smhrd.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.smhrd.dao.PaymentDAO;
import kr.or.smhrd.dto.PaymentDTO;

@Service
public class PaymentService {

    @Autowired
    private PaymentDAO paymentDao;
	private Object sub_no;

    @Transactional
    public String insertPayment(PaymentDTO paymentDto, HttpSession session, RedirectAttributes rttr) {
        // 결제 처리 로직 작성
    	PaymentDTO mpay = ((PaymentDAO) paymentDao).selectPayment();
  	  	ModelAndView mv = new ModelAndView();
  	  	mv.addObject("mpay", mpay);
  	  	int merchant_uid = mpay.getSub_no();
  	  	String buyer_name = mpay.getU_id();

        // 결제 정보를 데이터베이스에 저장
        try {
            paymentDao.UserInsert(paymentDto);
            String view = "payment?sub_no=" + paymentDto.getSub_no();
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            return "error"; // 에러 발생 시 처리
        }
    }

    public ModelAndView paymentContents(String mpaynum, HttpSession session) {
        ModelAndView mv = new ModelAndView();

        PaymentDTO paymentInfo = paymentDao.getPaymentInfo(sub_no);
        
        // 만약 조회한 결제 정보가 없다면 에러 페이지로 리다이렉트
        if (paymentInfo == null) {
            mv.setViewName("error");
            return mv;
        }

        // 조회한 결제 정보를 모델에 추가
        mv.addObject("paymentInfo", paymentInfo);

        // view 설정
        mv.setViewName("payment");

        return mv;
    }
}