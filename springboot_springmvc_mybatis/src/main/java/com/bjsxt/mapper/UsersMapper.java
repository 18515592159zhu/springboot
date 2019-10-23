package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUsersAll();

    Users selectUsersById(Integer id);

    void updateUser(Users users);

    void deleteUserById(Integer id);
}