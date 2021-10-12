package top.mowang;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.mowang.dao.UserDao;
import top.mowang.pojo.User;
import top.mowang.utils.MyBatisUtil;

import java.io.IOException;
import java.util.ArrayList;
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
    public void selectAll() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        //使用分页插件进行分页查询
        PageHelper.startPage(3,3);
        List<User> list = dao.selectAll();
        list.forEach(System.out::println);
    }


    @Test
    public void selectIf() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.selectIf(new User(3,"打坦克","12312","23423@qq.com",2343.3));
        list.forEach(System.out::println);
    }

    @Test
    public void selectForeach() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<User> userList = dao.selectForeach(list);
        userList.forEach(System.out::println);
    }

    @Test
    public void selectForeach2() throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao dao = sqlSession.getMapper(UserDao.class);
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(2));
        list.add(new User(3));
        list.add(new User(5));

        List<User> userList = dao.selectForeach2(list);
        userList.forEach(System.out::println);
    }
}
