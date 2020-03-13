package alkweb.huawei.swindle.common.config;

import alkweb.huawei.swindle.common.interceptor.SqlStatementInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/11
 */
@Configuration
public class MyBatisConfig {

    /**
     * 配置 sql打印拦截器
     * application.yml中 Swindle.showsql: true 时生效
     *
     * @return SqlStatementInterceptor
     */

    @Bean
    @ConditionalOnProperty(name = "swindle.showsql", havingValue = "true")
    SqlStatementInterceptor sqlStatementInterceptor() {
        return new SqlStatementInterceptor();
    }
}
