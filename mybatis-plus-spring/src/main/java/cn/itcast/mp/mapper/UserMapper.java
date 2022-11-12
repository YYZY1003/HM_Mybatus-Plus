package cn.itcast.mp.mapper;


import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.springframework.test.context.ContextConfiguration;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
}
