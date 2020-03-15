package alkweb.huawei.swindle.common.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/13
 */
public class HttpContextUtils {

    private HttpContextUtils(){

    }

    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }



}
