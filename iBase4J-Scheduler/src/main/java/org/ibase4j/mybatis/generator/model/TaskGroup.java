package org.ibase4j.mybatis.generator.model;

import java.io.Serializable;
import java.util.Date;

public class TaskGroup implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_group.id_
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_group.group_type
     *
     * @mbggenerated
     */
    private String groupType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_group.group_name
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_group.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_group.operator
     *
     * @mbggenerated
     */
    private Integer operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_group
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_group.id_
     *
     * @return the value of task_group.id_
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_group.id_
     *
     * @param id the value for task_group.id_
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_group.group_type
     *
     * @return the value of task_group.group_type
     *
     * @mbggenerated
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_group.group_type
     *
     * @param groupType the value for task_group.group_type
     *
     * @mbggenerated
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_group.group_name
     *
     * @return the value of task_group.group_name
     *
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_group.group_name
     *
     * @param groupName the value for task_group.group_name
     *
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_group.create_time
     *
     * @return the value of task_group.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_group.create_time
     *
     * @param createTime the value for task_group.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_group.operator
     *
     * @return the value of task_group.operator
     *
     * @mbggenerated
     */
    public Integer getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_group.operator
     *
     * @param operator the value for task_group.operator
     *
     * @mbggenerated
     */
    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupType=").append(groupType);
        sb.append(", groupName=").append(groupName);
        sb.append(", createTime=").append(createTime);
        sb.append(", operator=").append(operator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TaskGroup other = (TaskGroup) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupType() == null ? other.getGroupType() == null : this.getGroupType().equals(other.getGroupType()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupType() == null) ? 0 : getGroupType().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}