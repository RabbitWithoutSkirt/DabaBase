package com.controller;

import com.dao.taxiDao;
import com.model.taxi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class taxiController {
    /**
     * 返回路线数据
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/getTaxi",method=RequestMethod.POST)
    public Map<String,List> getUniv(HttpServletResponse response)
    {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");// 设置跨域请求
        taxiDao dao = new taxiDao();
        List<taxi> list = dao.getTaxi();
        Map<String,List> map = new HashMap<>();
        map.put("taxi",list);
        return map;
    }
}
