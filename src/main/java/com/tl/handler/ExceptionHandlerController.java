package com.tl.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author TL
 * @create 2020-05-31
 */

public class ExceptionHandlerController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 异常处理
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler({Exception.class})
    public ModelAndView handleException(HttpServletRequest request, Exception e) throws Exception {
        logger.error("Request URL : {} , Exception : {}", request.getRequestURL(), e);
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("url", request.getRequestURL());
        mav.addObject("exception", e);
        mav.setViewName("error/error");  //返回的页面
        return mav;
    }
}
