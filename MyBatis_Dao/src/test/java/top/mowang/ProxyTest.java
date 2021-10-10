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
 * @date : 2021/10/10 23:04
 **/
public class ProxyTest {

    @Test
    public void testSelectUserById() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        User user = dao.selectUserById(7);
        System.out.println(user);
    }

    @Test
    public void testSelectAll() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> userList = dao.selectAll();
        userList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testAddUser() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        int insert = dao.addUser(new User(8,"都发到付","234","23423@qq.com",23423.3));
        System.out.println(insert);
        sqlSession.commit();
        sqlSession.close();
    }
}
