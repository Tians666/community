package life.majiang.community.service;

import java.util.List;
import java.util.Map;
import life.majiang.community.entity.User;


public interface UserService {
	
	public Integer update(User user);
	
	/**
	 * @param map
	 * @param page  从0开始 
	 * @param pageSize
	 */
	public List<User> list(Map<String, Object> map, Integer page, Integer pageSize);
	
	public Long getTotal(Map<String, Object> map);
	
	
	
}
