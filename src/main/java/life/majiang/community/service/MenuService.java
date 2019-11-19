package life.majiang.community.service;

import life.majiang.community.entity.Menu;

import java.util.List;
import java.util.Map;

public interface MenuService {
    public Integer update(Menu menu);
    public List<Menu> list(Map<String,Object> map,Integer page,Integer pageSize);
    public Long getTotal(Map<String,Object> map);
}
