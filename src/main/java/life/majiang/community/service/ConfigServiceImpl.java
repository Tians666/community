package life.majiang.community.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import life.majiang.community.dao.ConfigDao;
import life.majiang.community.entity.Config;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {
	
	@Resource
	private ConfigDao configDao;
	
	@Override
	public Config findById(Integer id) {
		return configDao.findId(id);
	}

}
