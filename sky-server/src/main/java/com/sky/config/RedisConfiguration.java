package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@Slf4j
public class RedisConfiguration {
    @Bean
    //pom文件里引入的<dependency>
    //             <groupId>org.springframework.boot</groupId>
    //             <artifactId>spring-boot-starter-data-redis</artifactId>
    //         </dependency>
    //会创建好RedisConnectionFactory对象并放入容器中，这里声明一下就可以注入进来了
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory) {

        log.info("开始创建redis模版对象...");
        RedisTemplate redisTemplate = new RedisTemplate();
        //设置redis的连接工厂对象
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //设置redis的key 序列化器，在redis的界面中序列化key的值
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
