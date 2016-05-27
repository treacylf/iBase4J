package org.ibase4j.mybatis.generator.dao;

import java.util.List;
import org.ibase4j.mybatis.generator.model.TaskFireLog;

public interface TaskFireLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_fire_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_fire_log
     *
     * @mbggenerated
     */
    int insert(TaskFireLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_fire_log
     *
     * @mbggenerated
     */
    TaskFireLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_fire_log
     *
     * @mbggenerated
     */
    List<TaskFireLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_fire_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TaskFireLog record);
}