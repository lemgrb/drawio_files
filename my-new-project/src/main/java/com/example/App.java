package com.example;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import java.net.InetSocketAddress;

public class App {
    public static void main( String[] args ){
        try (CqlSession session = CqlSession.builder()
                .addContactPoint(new InetSocketAddress("127.0.0.1", 9042))
                .addContactPoint(new InetSocketAddress("127.0.0.1", 9142))
                .withKeyspace("pagibig")
                .withLocalDatacenter("southeast-1")
                .build()) {
            System.out.println("Result set 1");        
            ResultSet rs = session.execute("SELECT * FROM properties");
            for (Row row : rs) {
                System.out.println(row.getString("name") + ", type=" + row.getString("type"));
            }

            System.out.println("Result set 2");
            ResultSet rs2 = session.execute("SELECT * FROM properties WHERE type = 'Lot'");
            for (Row row : rs2) {
                System.out.println(row.getUuid("id") + ": " + row.getString("name") + ": " + row.getString("type"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
