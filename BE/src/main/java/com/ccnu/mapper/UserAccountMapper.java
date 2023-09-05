package com.ccnu.mapper;

import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.UserTypeDto;
import com.ccnu.pojo.vo.UserAccountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccountMapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(UserAccountExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(UserAccountExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(UserAccount record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(UserAccount record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<UserAccount> selectByExample(UserAccountExample example);

    List<UserAccount> selectAll();

    /**
     *
     * @mbggenerated 2020-12-21
     */
    UserAccount selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") UserAccount record, @Param("example") UserAccountExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") UserAccount record, @Param("example") UserAccountExample example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(UserAccount record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(UserAccount record);

    /**
     * 获取所有用户信息(包含在岗信息)
     * @param userTypeDto
     * @return
     */
    List<UserAccountVo> getAllUser(UserTypeDto userTypeDto);

    /**
     * 删除用户
     * @param tutorIdentificationCode
     */
    void deleteUser(String tutorIdentificationCode);
}