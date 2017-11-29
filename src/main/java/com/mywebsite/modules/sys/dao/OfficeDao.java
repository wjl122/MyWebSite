package com.mywebsite.modules.sys.dao;

import com.mywebsite.common.persistence.TreeDao;
import com.mywebsite.common.persistence.annotation.MyBatisDao;
import com.mywebsite.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
