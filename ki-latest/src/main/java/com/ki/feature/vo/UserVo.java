package com.ki.feature.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Wangxiang on 2016/8/28.
 */
@Data
@AllArgsConstructor
public class UserVo implements Serializable {

    private Integer id;
    private String name;
    private String address;

}
