package top.mowang.dao;

import org.apache.ibatis.session.SqlSession;
import top.mowang.pojo.User;
import top.mowang.utils.MyBatisUtil;

import java.util.List;

/**
 * MyBatis-Demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/10 18:18
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> selectAll() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<User> userList = sqlSession.selectList("top.mowang.dao.selectAll");
        sqlSession.close();
        return userList;
    }

    @Override
    public User selectUserById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = (User) sqlSession.selectOne("top.mowang.dao.selectUserById", id);
        return user;
    }

    @Override
    public int addUser(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int insert = sqlSession.insert("top.mowang.dao.addUser", user);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }
}
