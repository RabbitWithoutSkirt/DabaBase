package com.controller;

import com.dao.Taxi_line_Dao;
import com.dao.gridDao;
import com.model.Taxi_line;
import com.model.grid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Taxi_lineController {
    @ResponseBody
    @RequestMapping(value = "/Taxi_line",method = RequestMethod.POST)
    public List<List> Taxi_line(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");// 设置跨域请求
        Taxi_line_Dao dao = new Taxi_line_Dao();
        List<List> Taxi_lines = dao.getTaxi_line();
//
//        Map<String,List> map = new HashMap<>();
//        map.put("data",Taxi_lines);
        return Taxi_lines;
    }
}
