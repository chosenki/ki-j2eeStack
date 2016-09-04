package com.ki.feature.service;

import com.ki.common.codegen.tables.User;
import com.ki.common.codegen.tables.records.UserRecord;
import com.ki.feature.api.UserService;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<UserRecord> getUserList() {
        User u = User.USER.as("user");
        Result<Record3<Integer, String, String>> result =dsl.select(u.ID,u.NAME,u.ADDRESS)
                .from(u)
                .where(u.NAME.equal("wx"))
                .fetch();
        System.out.println("getUserList");
        return null;
    }

}
