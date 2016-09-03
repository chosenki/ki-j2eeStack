package com.ki.feature.service;

import com.ki.common.base.BaseService;
import com.ki.feature.api.UserService;
import com.ki.feature.entity.User;
import com.ki.feature.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wangxiang on 2016/8/28.
 */
@Service("userService")
public class UserServiceImpl extends BaseService<User, UserVo> implements UserService {

    protected Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public List<User> getUserList() {
        System.out.println("getUserList");
        return null;
    }

}
