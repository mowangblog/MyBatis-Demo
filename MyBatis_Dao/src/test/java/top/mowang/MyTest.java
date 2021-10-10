package top.mowang;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.mowang.pojo.User;
import top.mowang.utils.MyBatisUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * MyBatis-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/10 23:04
 **/
public class MyTest {

    @Test
    public void testSelectUserById() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = (User) sqlSession.selectOne("top.mowang.dao.selectUserById", 6);
        System.out.println(user);
    }

    @Test
    public void testSelectAll() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<User> userList = sqlSession.selectList("top.mowang.dao.selectAll");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testAddUser() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int insert = sqlSession.insert("top.mowang.dao.addUser",
                new User(7,"打坦克1","234","23423@qq.com",23423.3));
        System.out.println(insert);
        sqlSession.commit();
        sqlSession.close();
    }
}
