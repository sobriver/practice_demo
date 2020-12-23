package com.example.practice_demo.db;

import com.example.practice_demo.utils.DbUtils;
import org.apache.commons.lang3.RandomUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 快速批量插入数据
 */
public class BatchInsertData {

    public static void main(String[] args) {
        try {
            batchInsert();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void batchInsert() throws Exception {
        int total = 5000000;
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&useServerPrepStmts=false";
        String user = "root";
        String pwd = "12358";
        Connection connection = DbUtils.getConnection(url, user, pwd);

        String sql = "INSERT INTO  t1(val, source) VALUES (?,?)";
        connection.setAutoCommit(false);
        PreparedStatement ps = connection.prepareStatement(sql);

        long start = System.currentTimeMillis();
        for(int i= 0; i < total; i++){
            ps.setInt(1, RandomUtils.nextInt());
            ps.setInt(2, RandomUtils.nextInt());
            ps.addBatch();
            //每隔1000万条提交一次
            if (i % 10000 == 0){
                ps.executeBatch();
                connection.commit();
                System.out.println("提交成功...." + i);
            }
        }

        ps.executeBatch();
        connection.commit();
        connection.close();
        System.out.println("总消耗时间:" + (System.currentTimeMillis() - start) / 1000);
    }
}
