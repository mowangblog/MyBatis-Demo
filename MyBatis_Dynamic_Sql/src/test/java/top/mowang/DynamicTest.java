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
 * @date : 2021/10/12 00:35
 **/
public class DynamicTest {
    @Test
    public void selectIf() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectIf(new User(3,"打坦克","12312","23423@qq.com",2343.3));
        list.forEach(System.out::println);
    }
}
