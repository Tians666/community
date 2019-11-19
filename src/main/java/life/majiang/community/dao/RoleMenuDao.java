package life.majiang.community.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import life.majiang.community.entity.RoleMenu;

public interface RoleMenuDao  extends JpaRepository<RoleMenu,Integer>,JpaSpecificationExecutor< RoleMenu>  {

}
