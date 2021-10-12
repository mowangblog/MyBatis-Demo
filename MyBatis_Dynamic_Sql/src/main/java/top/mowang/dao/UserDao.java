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
     * @param user
     * @description: 从数据库中查询所有接口
     * @author: Xuan Li
     * @date: 2021/10/10 18:19
    */
    List<User> selectIf(User user);

    /**
     * 循环语句查询
     * @param list
     * @return list
     * @author : Xuan Li
     * @website : https://mowangblog.top
     * @date : 2021/10/12 19:51
     **/
    List<User> selectForeach(List<Integer> list);

    /**
     * 循环语句查询
     * @param list
     * @return list
     * @author : Xuan Li
     * @website : https://mowangblog.top
     * @date : 2021/10/12 19:51
     **/
    List<User> selectForeach2(List<User> list);
}
