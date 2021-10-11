package top.mowang.dao;

import org.apache.ibatis.annotations.Param;
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

    /**
     * 多条件查询用户
     * 多个简单类型使用@Param自定义参数名称
     * @return User
     * @param name
     * @param email
     * @description: 从数据库中查询用户
     * @author: Xuan Li
     * @date: 2021/10/11 22:19
     */
    List<User> selectUserByMulti(@Param("name") String name, @Param("email") String email);

    /**
     * 使用java对象作为参数
     * @param user
     * @return list
     * @author: Xuan Li
     * @date: 2021/10/11 22:40
    */
    List<User> selectUserByUser(User user);
}
