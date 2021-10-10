package top.mowang.dao;

import top.mowang.pojo.User;

import java.util.List;

/**
 * UseDao接口
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/10 18:19
 **/
public interface UserDao {
    /**
     * 查询所有用户
     * @return list
     * @description: 从数据库中查询所有接口
     * @author: Xuan Li
     * @date: 2021/10/10 18:19
    */
    List<User> selectAll();

    /**
     * 根据Id查询用户
     * @return User
     * @param id
     * @description: 从数据库中查询所有接口
     * @author: Xuan Li
     * @date: 2021/10/10 18:19
     */
    User selectUserById(Integer id);

    /**
     * 添加用户
     * @return int
     * @param user
     * @author: Xuan Li
     * @date: 2021/10/10 23:13
    */
    int addUser(User user);
}
