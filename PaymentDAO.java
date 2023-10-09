package kr.or.smhrd.dao;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.smhrd.dto.PaymentDTO;
import kr.or.smhrd.dto.SubscriptionDTO;

public interface PaymentDAO {
	// 구독 본인, 구독 종료일, 다음 결제일, 결제 내역 확인 (월별 결제일), 구독 취소
	public SubscriptionDTO getView(String u_id);
	public String psrv(PaymentDAO ppay, HttpSession session, RedirectAttributes rttr);
	public ModelAndView paymentContents(String sub_no, HttpSession session);
	public void UserInsert(PaymentDTO paymentDto);
	public PaymentDTO selectPayment();
	public PaymentDTO getPaymentInfo(Object sub_no);
}