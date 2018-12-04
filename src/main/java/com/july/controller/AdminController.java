package com.july.controller;

import com.july.constant.ResultInfo;
import com.july.model.ServiceResult;
import com.july.po.BlogContent;
import com.july.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;

/**
 * Created by GXR on 2018/12/4.
 */
@Controller
public class AdminController {

    @Autowired
    private IIndexService indexService;

    @RequestMapping("/createOrUpdateContent")
    public ServiceResult updateOrCreateBlogContent(@RequestBody BlogContent blogContent, ServletRequest request){

        return new ServiceResult(ResultInfo.SUCCESS_CODE,ResultInfo.SUCCESS_MSG);
    }

}
