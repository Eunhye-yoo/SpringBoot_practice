package com.example.ch1.aop;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class Interceptor implements HandlerInterceptor {
    private  static final Logger log
            = LoggerFactory.getLogger(Interceptor.class.getName());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("[preHandle] 요청 URI : " + request.getRequestURI());
        // true가 반환되야 다음 인터셉터 또는 컨트롤러로 요청이 전달
        // false 반환시 요청 처리 종료
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        log.info("[postHandle] 컨트롤러 실행 완료, 뷰 렌더링 전");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("[afterCompletion] 요청 처리 및 뷰 렌더링 완료");
        if (ex != null) {
            log.error("예외 발생: ", ex);
        }
    }
}
