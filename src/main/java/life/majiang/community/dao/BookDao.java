package life.majiang.community.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import life.majiang.community.entity.Book;

public interface BookDao extends JpaRepository<Book,Integer>,JpaSpecificationExecutor< Book> {

}
