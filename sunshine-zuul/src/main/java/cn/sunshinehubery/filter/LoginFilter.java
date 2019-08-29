package cn.sunshinehubery.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 模拟登陆拦截
 * @author: sunshinehubery
 * @date: 2019/8/29 13:43
 * @Version: 1.0
 **/
@Component
public class LoginFilter extends ZuulFilter {
    /**
      * @Description  过滤器类型 pre route post error
      * @Param []
      * @return java.lang.String
      **/
    @Override
    public String filterType() {
        return "pre";
    }

    /** 
      * @Description 过滤器的执行顺序，返回的值越小，优先级越高
      * @Param []
      * @return int
      **/
    @Override
    public int filterOrder() {
        return 10;
    }

    /**
      * @Description 是否执行run 方法
      * @Param []
      * @return boolean
      **/
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
      * @Description 拦截校验的逻辑（模拟token是否携带值）
      * @Param []
      * @return java.lang.Object
      **/
    @Override
    public Object run() throws ZuulException {
        //获取zuul提供的上下文 context
        RequestContext context = RequestContext.getCurrentContext();
        //获取请求的对象
        HttpServletRequest request = context.getRequest();
        //从请求对象中获取token的信息
        String token = request.getParameter("token");
        //判断
        if(StringUtils.isBlank(token)){
            //为空，就过滤请求，不让其路由
            context.setSendZuulResponse(false);
            //设置响应的状态码  401-身份未认证
            context.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            //返回一个友好提示
            context.setResponseBody("request error");
        }
        //返回null，表示过滤器不做处理
        return null;
    }
}
