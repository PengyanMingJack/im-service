package com.imovie.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Zheng Jie
 * @date 2019-5-22
 */
@Data
public class LogSmallDTO implements Serializable {

    private String description;

    private String requestIp;

    private String username;

    private String method;

    private String params;

    private Long time;

    private String address;

    private String browser;

    private Timestamp createTime;
}
