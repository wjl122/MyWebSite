package com.mywebsite.modules.sys.dao;

import com.mywebsite.common.persistence.CrudDao;
import com.mywebsite.common.persistence.annotation.MyBatisDao;
import com.mywebsite.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
