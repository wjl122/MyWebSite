package com.mywebsite.modules.sys.dao;

import java.util.List;

import com.mywebsite.common.persistence.CrudDao;
import com.mywebsite.common.persistence.annotation.MyBatisDao;
import com.mywebsite.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
