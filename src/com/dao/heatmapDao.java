package com.dao;

import com.model.heat;
import com.model.heatmap;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.utils.database.conn;

@Repository
public class heatmapDao {
    Connection connection = null;

    /*
    *
    * 返回热力图数据
    *
     */
    public List<heat> getheat(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<heat> heats = new ArrayList<heat>();
        try {
            connection = conn();
            String sql;
            sql = "select * from heat_map";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                heat heat = new heat();
                heatmap heatmap = new heatmap();
                heat.setNum(rs.getString("Num"));
                double Position[];

                heatmap.setLat(rs.getDouble("Lat"));
                heatmap.setLon(rs.getDouble("Lon"));
                Position= new double[]{heatmap.getLon(), heatmap.getLat()};
                heat.setCoord(Position);
                heats.add(heat);
                System.out.println("哈哈哈");
            }
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Cannot connect to database server,Exception:"
                    + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    connection = null;
                } catch (Exception e) {
                }
            }
        }
        return heats;
    }

}
