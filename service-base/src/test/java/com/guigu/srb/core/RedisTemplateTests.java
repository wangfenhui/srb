package com.guigu.srb.core;

import com.guigu.srb.core.mapper.DictMapper;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

public class RedisTemplateTests {
 /*   @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private DictMapper dictMapper;
    @Test
    public void saveDict(){
        Dict dict = dictMapper.selectById(1);
        //向数据库中存储string类型的键值对, 过期时间5分钟
        redisTemplate.opsForValue().set("dict", dict, 5, TimeUnit.MINUTES);
    }*/
}
