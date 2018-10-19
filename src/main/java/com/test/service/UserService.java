package com.test.service;

import java.util.List;
import java.util.Map;

import com.test.entity.Users;

/**
 * 
  * @ClassName: UserService 
  * @Description: TODO
  * @author chenshangbing
  * @date 2018年10月11日 下午5:13:46 
  *
 */
public interface UserService {
	//创建接口
    public void save(Users users)throws Exception;
    public List<Map<String, Object>> queryList()throws Exception;
}
