package com.july.controller;

import com.july.constant.ResultInfo;
import com.july.model.ServiceResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GXR on 2018/12/4.
 */
public class BaseController {

    @ModelAttribute
    public void preMethod(HttpServletRequest request){
        request.setAttribute("ctx", request.getContextPath());
    }


    public ServiceResult failed(String msg){
        ServiceResult result=new ServiceResult();
        result.setMsg(msg);
        result.setCode(ResultInfo.FAILED_CODE);
        return result;
    }

    public ServiceResult failed(){
        ServiceResult result=new ServiceResult();
        result.setMsg(ResultInfo.FAILED_MSG);
        result.setCode(ResultInfo.FAILED_CODE);
        return result;
    }

    public ServiceResult success(String msg){
        ServiceResult result=new ServiceResult();
        result.setMsg(msg);
        result.setCode(ResultInfo.SUCCESS_CODE);
        return result;
    }

    public ServiceResult success(String msg, Object rst){
        ServiceResult result=new ServiceResult();
        result.setMsg(msg);
        result.setResult(rst);
        result.setCode(ResultInfo.SUCCESS_CODE);
        return result;
    }

}
