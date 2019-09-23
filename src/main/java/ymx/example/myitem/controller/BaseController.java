package ymx.example.myitem.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yinminxin
 * @description
 * @date 2019/9/19 9:51
 */
public class BaseController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    public void setSession(String key, Object object){
        request.getSession().setAttribute(key,object);
    }

    public Object getSession(String key){
        return request.getSession().getAttribute(key);
    }
}
