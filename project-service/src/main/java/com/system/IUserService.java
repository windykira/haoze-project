package com.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.entity.User;

import java.util.Map;

/**
 * @author maxl
 * @time 2018-12-16
 */
public interface IUserService extends IService<User> {

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户
     */
    User getUserByUserName(String username);

    User getUserByMobile(String mobile);

    /**
     * 注册用户
     * @param user
     * @param roleCode
     * @return
     */
    User register(User user, String roleCode);

    Map<String, Object> getLoginUserAndMenuInfo(User user);

    boolean deleteByUserNo(String userNo);

    Page<User> selectPageByConditionUser(Page<User> userPage, String info, Integer[] status, String startTime, String endTime);
}
