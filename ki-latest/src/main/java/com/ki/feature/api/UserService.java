package com.ki.feature.api;

import com.ki.common.codegen.tables.records.UserRecord;

import java.util.List;

/**
 * Created by Wangxiang on 2016/8/28.
 */
public interface UserService {

    public List<UserRecord> getUserList();

}
