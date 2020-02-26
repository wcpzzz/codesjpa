package com.codes.api;

import com.codes.core.constants.Constants;
import com.codes.core.model.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller 基类
 * @author
 * @date 2020/02/26 16:54
 */
public class BaseController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;


    /**
     * The Global exception handler
     * @param e
     * @return
     * @author
     * @date 2020/02/26 16:54
     */
    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        R response = R.failure(Constants.Response.FAILURE);
        return response;
    }

}
