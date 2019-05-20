/*
package com.springmvc.utils;

import com.springmvc.bean.Module;
import com.springmvc.bean.Users;
import com.springmvc.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MyInterceptor implements HandlerInterceptor{
    @Autowired
    private ModuleService moduleService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        boolean f=false;
        Users user = (Users)request.getSession().getAttribute("user");
        if(user!=null){
            String path=request.getContextPath();
           */
/* List<Module> list=moduleService.findModulesByUserId(user.getId());
            System.out.println("执行preHandle");*//*


            if(handler instanceof HandlerMethod) {

                HandlerMethod hm = (HandlerMethod) handler;
                String methodName=hm.getMethod().getName();
                System.out.println("执行方法"+methodName);

                for(int i=0;i<list.size();i++){
                    System.out.println(list.get(i));
                    if(list.get(i).getMoethod().equals(methodName)){
                        f=true;
                    }
                }
            }
            if(f){
                return true;
            }
            else {
                request.setAttribute("noAcc", "您无此权限访问！");
                request.getRequestDispatcher("/admin/right.jsp").forward(request, response);
                return false;
            }
        }else{
            request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}
*/
