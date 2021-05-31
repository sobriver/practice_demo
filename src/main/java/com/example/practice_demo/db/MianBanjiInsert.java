package com.example.practice_demo.db;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.UUID;

public class MianBanjiInsert {
    public static void main(String[] args) throws Exception {

        int initId = 10000;
        String url = "jdbc:mysql://10.171.4.181:3306/allinone?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&useServerPrepStmts=false";
        String user = "root";
        String pwd = "cIvKweMHnej";
        Connection connection = DbUtils.getConnection(url, user, pwd);
        for (int i=0; i < 64; i++){
            Timestamp timestamp = new Timestamp(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
            initId++;
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            String sql = "insert into base_device(id, uuid, name, ip_address, location, device_type, device_model, function_type, status, sn_code, rom_version, company_id, company_uuid, first_active_time, offline_time, ota_status, app_channel, cpu_usage, memory_usage, disk_usage, gmt_create, gmt_modified, discovery_method) " +
                    "values (?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, initId);
            ps.setString(2, uuid);
            ps.setString(3, "hua" + RandomStringUtils.randomAlphabetic(5));
            ps.setString(4, "10.122.101.86"); //todo IP 需要不一样才行
            ps.setString(5, "12222");
            ps.setInt(6, 2);
            ps.setInt(7, 1);
            ps.setInt(8, 3);
            ps.setInt(9, 3);
            ps.setString(10, "M" + RandomStringUtils.randomAlphabetic(7));
            ps.setInt(11, 110);
            ps.setInt(12, 2148); //companyid
            ps.setString(13, "ce089388a011400d9a07f98f76a6396e"); //companyuuid
            ps.setTimestamp(14, timestamp);
            ps.setTimestamp(15, timestamp);
            ps.setInt(16, 0);
            ps.setString(17, "MegEye-W5K-I7");
            ps.setFloat(18, 70.17f);
            ps.setFloat(19, 50.22f);
            ps.setFloat(20, 0.89f);
            ps.setTimestamp(21, timestamp);
            ps.setTimestamp(22, timestamp);
            ps.setInt(23, 1);
            ps.execute();


            String sql1 = "insert into device_set(uuid, sensor_id, sensor_uuid, compute_id, compute_uuid, is_pass, gmt_create) values (?,?,?,?,?,?,?)";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, UUID.randomUUID().toString().replaceAll("-",""));
            ps1.setInt(2, initId);
            ps1.setString(3, uuid);
            ps1.setInt(4, initId);
            ps1.setString(5, uuid);
            ps1.setInt(6, 1);
            ps1.setTimestamp(7, timestamp);
            ps1.execute();
        }

        connection.close();
    }
}
