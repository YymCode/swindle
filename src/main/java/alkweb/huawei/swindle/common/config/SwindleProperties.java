package alkweb.huawei.swindle.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/12
 */
@Configuration
@ConfigurationProperties(prefix = "swindle")
public class SwindleProperties {

    private String timeFormat = "yyyy-MM-dd HH:mm:ss";

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }
}
