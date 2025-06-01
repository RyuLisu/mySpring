package kr.smhrd.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import kr.smhrd.entity.Member;

@Mapper
public interface MemberMapper {

	@Insert("INSERT INTO fullStackmember VALUES (#{email}, #{pw}, #{tel}, #{address})")
	public int join(Member member);
	
	
	
	
	
}

//public class SqlSessionFactoryBean implements MemberMapper{
//
//	@Override
//	public List<MemberDTO> memberInsert() {
//		// JDBC 기능 수행
//		// openSession(true);
//    ArrayList<MemberDTO> list = sqlSession.selectList("mapper 경로", 매개변수);
//		return list;
//	}
//	
//	
//}