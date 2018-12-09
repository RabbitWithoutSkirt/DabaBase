package com.dao;

import com.model.taxi;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.utils.database.conn;

@Repository
public class taxiDao {
    Connection connection = null;

    /**
     * 返回路线图数据
     * @return
     */
    public List<taxi> getTaxi() {
        PreparedStatement stmt0 = null;
        ResultSet rs0 = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<taxi> Taxis = new ArrayList<taxi>();
        try {
            connection = conn();
            String sql0;
            sql0 = "select VehicleID from taxi_all_0h";
            stmt0 = connection.prepareStatement(sql0);





            String sql;
            sql = "select Lon,Lat,VehicleID from taxi_all_0h group by VehicleID";
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                taxi Taxi = new taxi();
                Taxi.setLon(rs.getString("Lon"));
                Taxi.setLat(rs.getString("Lat"));
                Taxi.setVehicleID(rs.getInt("VehicleID"));
                Taxis.add(Taxi);
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
        return Taxis;
    }
}
