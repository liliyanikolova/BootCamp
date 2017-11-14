package com.hotelReservationWebApp.interceptors;

import com.hotelReservationWebApp.dtos.LogDto;
import com.hotelReservationWebApp.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LogInterceptor implements HandlerInterceptor{

    private LogService logService;

    @Autowired
    public LogInterceptor(LogService logService) {
        this.logService = logService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("preHandleTime", System.currentTimeMillis());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        request.setAttribute("preHandleTime", System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long currentTime = System.currentTimeMillis();
        long preHandleTime = (long) request.getAttribute("preHandleTime");
        long postHandleTime = (long) request.getAttribute("preHandleTime");

        long actionExecution = postHandleTime - preHandleTime;
        long overallExecution = currentTime - preHandleTime;

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println(handlerMethod.getClass().getName());
        String message = String.format("[%s - %s] Action Execute Time: %d ms, Overall Execute Time: %d ms",
                handlerMethod.getBean().getClass(), handlerMethod.getMethod().getName(), actionExecution, overallExecution);

        LogDto logDto = new LogDto(message);
        this.logService.create(logDto);
    }
}
