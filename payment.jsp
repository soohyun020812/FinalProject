<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link rel=stylesheet href=../inc/payMent.css>

<script src="https://cdn.iamport.kr/v1/iamport.js"></script>

<main>
<div class="payment-container">
  <div>
    <span>구독 결제</span>
  </div>
    <span>10,900원    </span>
    
  <div class="ka_pay_btn"></div>
    <button onclick="kakao_pay()">결제하기</button>
    
<script>
  function kakao_pay() {
    // 카카오페이 결제 요청
    var IMP = window.IMP;
    IMP.init('imp06441630');	// 가맹점 식별코드

    IMP.request_pay({
    	pc: 'IMPAME'
    	pg: 'kakao', // 카카오페이 사용
      	pay_method: 'EASY_PAY', // 결제 수단
      	merchant_uid: 'sub_no', // 가맹점에서 생성한 고유 주문번호
      	name: '결제하기', // 상품명
      	amount: 10900, // 결제 금액
      	buyer_name: 'u_id', // 구매자 이름
      	
    	}, function (rsp) {
      	if (rsp.success) {
        // 결제 성공 시 처리할 코드 작성
        alert('결제가 완료되었습니다.');
      	} else {
        // 결제 실패 시 처리할 코드 작성
        alert('결제에 실패하였습니다. : ' + rsp.error_msg);
      	}
    });
  }
</script>