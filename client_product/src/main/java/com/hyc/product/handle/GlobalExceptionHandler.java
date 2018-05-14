package com.hyc.product.handle;

import com.hyc.product.basic.Response;
import com.hyc.product.exception.BasicException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获自定义异常
     * @param ex
     * @return Response
     */
    @ResponseBody
    @ExceptionHandler(value = BasicException.class)
    public Response<String> basicExceptionHandler(BasicException ex, HttpServletRequest request) {
        log.info("basicException:"+ex.getMessage());
        return Response.error(ex.getMessage(),request.getRequestURL().toString());
    }



    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Response<String> exceptionHandler(Exception ex, HttpServletRequest request) {
        ex.printStackTrace();
        return Response.error("后台未知错误",request.getRequestURL().toString());
    }
}
