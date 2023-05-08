package com.msg_service.msg.mapper;

import com.msg_service.msg.model.Hongzha;
import com.msg_service.msg.model.ann.DataSource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * 
*/
@Mapper
public interface HongzhaMapper {
    /**
     * delete by primary key
     * @param uid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Hongzha record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Hongzha record);

    /**
     * select by primary key
     * @param uid primary key
     * @return object by primary key
     */
    Hongzha selectByPrimaryKey(Integer uid);

    List<Hongzha> selectAll();

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Hongzha record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Hongzha record);
}