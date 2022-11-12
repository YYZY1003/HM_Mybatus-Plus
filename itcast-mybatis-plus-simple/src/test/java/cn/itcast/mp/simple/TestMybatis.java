package cn.itcast.mp.simple;

import cn.itcast.mp.simple.mapper.UserMapper;
import cn.itcast.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void TestFindAll() throws Exception{
        String config = "mybatis-config.xml";
        InputStream asStream = Resources.getResourceAsStream(config);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(asStream);
        SqlSessionFactory factory = new MybatisSqlSessionFactoryBuilder().build(asStream);//mybatis与mp整合

        SqlSession sqlSession = factory.openSession();
        UserMapper sessionMapper = sqlSession.getMapper(UserMapper.class);

        //测试查询
//        List<User> users = sessionMapper.findAll();
        List<User> users = sessionMapper.selectList(null);
        for (User user:users){
            System.out.println("user = " + user);
        }
    }
}
