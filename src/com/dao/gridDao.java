package com.dao;

import com.model.grid;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.utils.database.conn;
@ResponseBody
public class gridDao {
    Connection connection = null;

    public List<grid> getgrid(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<grid> grids = new ArrayList<grid>();
        try {
            connection = conn();
            String sql;
            int start = 2;
            int endle = 10;
            sql = "select * from taxi_all_12h limit 0,10";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                grid grid = new grid();
                grid.setID(rs.getString("VehicleID"));
                grid.setName(rs.getString("State"));
                grid.setNote(rs.getString("Lat"));
                grid.setSdata(rs.getString("Time"));
                grid.setShip(rs.getString("Lon"));
                grid.setStock(rs.getString("Speed"));
                grids.add(grid);
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
        return grids;
    }

}
