package top.mowang;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.mowang.pojo.User;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis-Demo
 *0
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/10 20:59
 **/
public class MyTest {

    @Test
    public void testSelectUserById() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            User user = (User) session.selectOne("top.mowang.dao.UserDao.selectUserById",2);
            System.out.println(user);
        }
    }

    @Test
    public void testAddUser() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            User user = new User(4, "蔚来", "12312", "sdfoa@qq.com", 1334.4);
            int insert = session.insert("top.mowang.dao.UserDao.addUser",user);
            //需要提交事务
            session.commit();
            System.out.println(insert);
        }
    }
}
