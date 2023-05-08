package com.msg_service.msg.service;

import com.alibaba.druid.pool.DruidDataSource;

import javax.activation.DataSource;
import java.util.Map;

/**
 * 加载所有的数据源
 */
public interface DynamicDataSourceProvider {
    String DEFAULT_DATASOURCE = "master";
    /**
     * 加载所有的数据源
     * @return
     */
    Map<String, DruidDataSource> loadDataSources();
}

