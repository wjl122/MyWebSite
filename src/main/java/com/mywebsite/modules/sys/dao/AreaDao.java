package com.mywebsite.modules.sys.dao;

import com.mywebsite.common.persistence.TreeDao;
import com.mywebsite.common.persistence.annotation.MyBatisDao;
import com.mywebsite.modules.sys.entity.Area;

/**
 * 区域DAO接口
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
