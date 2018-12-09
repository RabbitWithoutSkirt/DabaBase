package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.dao.gridDao;
import com.model.grid;

@Controller
public class gridController {

    @ResponseBody
    @RequestMapping(value = "/grid",method = RequestMethod.POST)
    public Map<String, List> heatmap(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");// 设置跨域请求
        gridDao dao = new gridDao();
        List<grid> grids = dao.getgrid();

        Map<String,List> map = new HashMap<>();
        map.put("data",grids);
        return map;
    }

}
