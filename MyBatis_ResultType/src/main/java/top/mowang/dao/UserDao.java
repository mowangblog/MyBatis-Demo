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
     * 使用java对象作为参数
     * @param user
     * @return list
     * @author: Xuan Li
     * @date: 2021/10/11 22:40
    */
    List<User> selectUserByUser(User user);

    /**
     * 返回user总数
     * @param long
     * @return list
     * @author: Xuan Li
     * @date: 2021/10/11 22:40
     */
    Long selectUserCount();

    /**
     * 查询所有用户
     * @return list
     * @description: 从数据库中查询所有接口
     * @author: Xuan Li
     * @date: 2021/10/10 18:19
     */
    List<User> selectAll();

    /**
     * 模糊查询
     * @return list
     * @param like
     * @author: Xuan Li
     * @date: 2021/10/12 0:19
     */
    List<User> selectLike(String like);
}
