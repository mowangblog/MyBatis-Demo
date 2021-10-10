package top.mowang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.mowang.dao.UserDao;
import top.mowang.dao.UserDaoImpl;
import top.mowang.pojo.User;
import top.mowang.utils.MyBatisUtil;

import java.io.IOException;
import java.util.List;

/**
 * MyBatis-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/10 23:04
 **/
public class MyTest2 {

    @Test
    public void testSelectUserById() throws IOException {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.selectUserById(6));
    }

    @Test
    public void testSelectAll() throws IOException {
        UserDao userDao = new UserDaoImpl();
        List<User> userList = userDao.selectAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testAddUser() throws IOException {
        UserDao userDao = new UserDaoImpl();
        userDao.addUser(new User(7,"打坦克","234","23423@qq.com",23423.3));
    }
}
