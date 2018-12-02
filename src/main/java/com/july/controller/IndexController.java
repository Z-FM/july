package com.july.controller;

import com.github.pagehelper.PageInfo;
import com.july.service.impl.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GXR on 2018/11/25.
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/content")
    @ResponseBody
    public PageInfo queryAllContent(@RequestParam(defaultValue = "1", value = "pageNumber") Integer pageNumber,
                                    @RequestParam(defaultValue = "10", value = "pageSize") Integer pageSize) {
        return indexService.queryBlogContentPage(pageNumber, pageSize);
    }

}
