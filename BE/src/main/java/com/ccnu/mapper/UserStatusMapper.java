package com.ccnu.mapper;

import com.ccnu.pojo.UserStatus;
import com.ccnu.pojo.UserStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStatusMapper {
    /**
     *
     * @mbggenerated 2021-10-28
     */
    int countByExample(UserStatusExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int deleteByExample(UserStatusExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int insert(UserStatus record);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int insertSelective(UserStatus record);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    List<UserStatus> selectByExample(UserStatusExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    UserStatus selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByExampleSelective(@Param("record") UserStatus record, @Param("example") UserStatusExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByExample(@Param("record") UserStatus record, @Param("example") UserStatusExample example);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByPrimaryKeySelective(UserStatus record);

    /**
     *
     * @mbggenerated 2021-10-28
     */
    int updateByPrimaryKey(UserStatus record);

    /**
     * 批量更新博导17张数据表为已删除状态
     * @param tutorIdentificationCode
     */
    void updateUserWorkStatus(String tutorIdentificationCode);

    /**
     * 批量更新博导17张数据表为未删除状态
     * @param tutorIdentificationCode
     */
    void updateUserOnWorkStatus(String tutorIdentificationCode);

}