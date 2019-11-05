package zyu.dao;

import org.apache.ibatis.annotations.Param;
import zyu.model.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);

    Users findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}