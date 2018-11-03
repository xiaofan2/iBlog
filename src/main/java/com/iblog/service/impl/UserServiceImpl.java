package com.iblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iblog.dao.UserDao;
import com.iblog.entity.User;
import com.iblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo<User> findUser(Map<String, Object> param) {
        String pageNum = (String)param.get("pageNum");
        String pageSize = (String)param.get("pageSize");
        int start = 0;
        int limit = 0;
        if(pageNum!=null && !"".equals(pageNum)){
            start = Integer.parseInt(pageNum);
        }
        if(pageSize!=null && !"".equals(pageSize)){
            limit = Integer.parseInt(pageSize);
        }
        PageHelper.startPage(start,limit);
        List<User> users = userDao.select(param);
        PageInfo result = new PageInfo(users);
        return result;
    }
}
