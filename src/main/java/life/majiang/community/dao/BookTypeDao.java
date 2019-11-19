package life.majiang.community.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import life.majiang.community.entity.BookType;


public interface BookTypeDao extends JpaRepository<BookType,Integer>,JpaSpecificationExecutor< BookType>  {
	
	
	
	
}
