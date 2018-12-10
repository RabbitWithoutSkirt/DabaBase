package com.dao;

import com.model.Taxi_line;
import com.model.grid;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.utils.database.conn;

@ResponseBody
public class Taxi_line_Dao {
    Connection connection = null;

    public List<Taxi_line> getTaxi_line(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Taxi_line> Taxi_lines= new ArrayList<Taxi_line>();
        try {
            connection = conn();
            String sql;
            sql = "select * from route_14h";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){

                Taxi_line Taxi_line = new Taxi_line();
                Taxi_line.setPosition(rs.getString("LonLat"));
                Taxi_lines.add(Taxi_line);


//                double line;
//                line = rs.getDouble("LonLat");
//                List list = Arrays.asList(line);
//                String str[] = line.split(",");
//                list = Arrays.asList(line);

//                Taxi_line Taxi_line = new Taxi_line();
//
//                Taxi_line.setPosition(list);
//                Taxi_line.setVehicleID(rs.getString("VehicleID"));
//
//                Taxi_lines.add(list);
//                System.out.println("哈哈哈");
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
        return Taxi_lines;
    }
}
