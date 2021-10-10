package top.mowang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.mowang.dao.UserDao;
import top.mowang.pojo.User;
import top.mowang.utils.MyBatisUtil;

import java.io.IOException;

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
}
