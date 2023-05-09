package com.fanhuage.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PROJECT_NAME: fanhuage
 * @className: MybatisPlusConfig
 * @version: 1.0
 * @description:
 * @author: LuoJie
 * @date: 2023-05-04 00:27
 */

@Configuration
public class MybatisPlusConfig {
    /**
     * MybatisPlusInterceptor 是 MyBatis-Plus 提供的拦截器接口，用于自定义 MyBatis SQL 的执行过程。
     * 其中， addInnerInterceptor 方法是向 MybatisPlusInterceptor 添加内部拦截器的方法。
     * PaginationInnerInterceptor 是 MyBatis-Plus 提供的内部拦截器之一，用于实现分页功能。
     * 通过将 PaginationInnerInterceptor 添加到 MybatisPlusInterceptor 中，可以实现 MyBatis-Plus 的分页功能。
     * 在配置完成后，当使用 MyBatis-Plus 进行分页查询时，MybatisPlusInterceptor 会拦截 SQL 执行过程，
     * 并将 PaginationInnerInterceptor 应用于 SQL 语句中的 LIMIT/OFFSET 语句的生成，从而实现分页查询的功能。
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return mybatisPlusInterceptor;
    }
}
