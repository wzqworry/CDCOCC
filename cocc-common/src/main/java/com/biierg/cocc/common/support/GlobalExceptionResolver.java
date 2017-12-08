/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import com.biierg.cocc.common.apiutil.ApiResult;
import org.apache.ibatis.ognl.OgnlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理类（统一处理）
 *
 * @author wen.ding
 */
@Controller
public class GlobalExceptionResolver {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

    /**
     * 处理控制层所有异常（测试中）
     *
     * @param exception 捕获的异常
     * @param request   http请求
     * @param response  http响应
     * @return ApiResult
     */
    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public Object exceptionHandler(Exception exception, HttpServletRequest request, HttpServletResponse response) throws Exception {
        /*如果是Ajax请求将错误信息返回到ajax date*/
        GlobalException globalException = null;
        if (exception instanceof GlobalException) {
              /*如果自定义的错误显示自定义的错误类型*/
            globalException = (GlobalException) exception;
            ApiResult res = new ApiResult(Integer.parseInt(globalException.getCode()), globalException.getMessage());
            logger.error("【出现错误】" + res.getCode() + res.getMessage(), exception);
            return res;
        } else {
            /*如果不是自定义的错误显示系统性错误或同一错误*/
//            res = new ApiResult(Integer.parseInt(ErrorCode.SYS_error.getCode()), ErrorCode.SYS_error.getErrorKey() + " ==> " + exception.getMessage());
            logger.error(exception.getMessage(), exception);
            throw exception;
        }


//      /*如果是Ajax请求将错误信息返回到ajax date*/
//        Throwable thr = exception;
//            Throwable thr = getRootCause(exception);
//      /*判断请求类型是不是ajax的*/
//        if (HttpRequestUtil.isAjaxRequest(request)) {
//          /*如果是Ajax请求将错误信息返回到ajax date*/
//            Throwable thr = exception;
////            Throwable thr = getRootCause(exception);
//            ApiResult res = new ApiResult();
//            res.setCode(-1);
//            if (thr instanceof GlobalException) {
//              /*如果自定义的错误显示自定义的错误类型*/
//                GlobalException globalException = (GlobalException) thr;
//                res.setCode(Integer.parseInt(globalException.getCode()));
//                res.setErrorKey(globalException.getErrorKey());
//                res.setMessage(globalException.getMessage());
//            } else {
//              /*如果不是自定义的错误显示系统性错误或同一错误*/
//                res.setErrorKey(ErrorCode.EXC_SYSTEM.toString());
//                res.setMessage(thr.getMessage());
//            }
//            logger.error(res.getErrorKey() + " == " + res.getMessage());
//            return res;
//        } else {
//          /*如果不是Ajax的重从定向到错误界面*/
//            logger.error( exception.getMessage());
//            return new ModelAndView("redirect:/pages/500", "exception", exception);
//        }
    }

    private Throwable getRootCause(Throwable throwable) {
        while (throwable.getCause() != null) {
            throwable = throwable.getCause();
        }
        if (throwable instanceof OgnlException && ((OgnlException) throwable).getReason() != null) {
            return getRootCause(((OgnlException) throwable).getReason());
        }
        return throwable;
    }


}
