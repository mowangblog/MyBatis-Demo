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
    public void selectUserByUser() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectUserByUser(new User(3,"打坦克","12312","23423@qq.com",2343.3));
        list.forEach(System.out::println);
    }

    @Test
    public void selectUserCount() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        Long count = dao.selectUserCount();
        System.out.println(count);
    }

    @Test
    public void selectAll() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void selectLike() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectLike("%李%");
        list.forEach(System.out::println);
    }
}
