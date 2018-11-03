package com.iblog.dao;

import com.iblog.entity.User;
import java.util.List;
import java.util.Map;

public interface UserDao {

    /**
     * 添加单个用户
     * @param user 单个用户
     * @return
     */
    public int insert(User user);

    /**
     * 批量添加用户
     * @param users
     * @return
     */
    public int insert(List<User> users);

    /**
     * 根据条件查询用户
     * @param param
     * @return
     */
    public List<User> select(Map<String,Object> param);
}
