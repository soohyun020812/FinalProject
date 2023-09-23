package kr.or.smhrd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.smhrd.dao.LoginDAO;
import kr.or.smhrd.dto.LoginDTO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO loginDAO;
	
	public LoginDTO loginAction(LoginDTO loginDTO) {
		return loginDAO.loginAction(loginDTO);
	}
}
