package top.mowang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.mowang.dao.UserDao;
import top.mowang.pojo.User;
import top.mowang.utils.MyBatisUtil;

import java.io.IOException;
import java.util.List;

/**
 * MyBatis-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/11 00:42
 **/
public class ParameterTest {
    @Test
    public void testSelectUserById() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        User user = dao.selectUserById(7);
        System.out.println(user);
    }

    @Test
    public void testSelectUserByMulti() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectUserByMulti("李煊","23423@qq.com");
        list.forEach(System.out::println);
    }

    @Test
    public void selectUserByUser() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectUserByUser(new User(3,"打坦克","12312","23423@qq.com",2343.3));
        list.forEach(System.out::println);
    }
}
