package life.majiang.community.dao;

import life.majiang.community.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import life.majiang.community.entity.Menu;
import org.springframework.data.jpa.repository.Query;


public interface MenuDao extends JpaRepository<Menu,Integer>,JpaSpecificationExecutor< Menu> {
    @Query(value="select * from t_menu where id = ?1",nativeQuery = true)
    public Menu findId(Integer id);
	
	
}
