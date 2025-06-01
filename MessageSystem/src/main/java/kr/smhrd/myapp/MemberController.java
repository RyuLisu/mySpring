package kr.smhrd.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.smhrd.entity.Member;
import kr.smhrd.mapper.MemberMapper;

// Member 즉 유저와 관련된 요청들을 처리할 수 있는 controller 
// 컨트롤러의 역할을 수행하기 위해서는 ??? 
@Controller
public class MemberController { // Controller -> POJO

	@Autowired
	MemberMapper mapper;
	
	
	
	@RequestMapping("/")
	public String Main() {
		
		
		return "Main";
		
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Member member) {
		
		
		System.out.println("[JoinController]");
		
		//System.out.println(member.getEmail());
		//System.out.println(member.getPw());
		
		int result = mapper.join(member);
		
		if(result == 1 ) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원 가입 실패 ");
		}
		
		
		
		return "Main";
	}
	
	
	
	
	
	
}
