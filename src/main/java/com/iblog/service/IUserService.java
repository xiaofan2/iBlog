package com.iblog.service;

import com.github.pagehelper.PageInfo;
import com.iblog.entity.User;
import java.util.Map;

public interface IUserService {

    /**
     * 通过条件查询用户
     * @param param
     * @return
     */
    public PageInfo<User> findUser(Map<String,Object> param);

}
