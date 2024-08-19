package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.upload.model.vo.Board;
import com.kh.upload.model.vo.Paging;

@Mapper
public interface BoardMapper {
	
	void insert(Board vo);
	List<Board> selectAll(Paging paging);
	Board select(int no);
	void update(Board vo);
	void delete(int no);
			
	// <select id="select"중간 parameterType="int"()괄호 안에 resultType="Board"맨앞>
	// resultType 없을때 보이드
	
}
