package com.controller;

import com.dao.heatmapDao;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.model.heat;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class heatmapController {
    /**
     * 返回热力图所需数据
     */
    @ResponseBody
    @RequestMapping(value = "/heatmap",method = RequestMethod.POST)
    public Map<String,List> heatmap(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");// 设置跨域请求
        heatmapDao dao = new heatmapDao();
        List<heat> list = dao.getheat();

        Map<String,List> map = new HashMap<>();
        map.put("heat",list);
        JSONArray array = new JSONArray();
        array.put(array);
        return map;
    }

}
