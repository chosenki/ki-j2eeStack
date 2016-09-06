package com.ki.feature.service;

import com.ki.common.codegen.tables.User;
import com.ki.feature.api.UserService;
import com.ki.feature.vo.UserVo;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record3;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wangxiang on 2016/8/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DSLContext dsl;

    @Override
    public List<UserVo> getUserList() {

        List<UserVo> userVoList = new ArrayList<UserVo>();
        User u = User.USER.as("user");
        Result<Record3<Integer, String, String>> result = dsl.select(u.ID, u.NAME, u.ADDRESS)
                .from(u)
                .fetch();

        logger.info("size:" + result.size());

        for (Record r : result) {
            Integer id = r.getValue(User.USER.ID);
            String name = r.getValue(User.USER.NAME);
            String address = r.getValue(User.USER.ADDRESS);

            logger.info("id: " + id + " name: " + name + " address: " + address);
            userVoList.add(new UserVo(id, name, address));
        }

        logger.info("getUserList");
        return userVoList;
    }

}
