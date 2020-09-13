package com.itlaoqi.rabbitmq.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitUtils {
    private static ConnectionFactory factory = new ConnectionFactory();
    static {
        factory.setHost("39.105.91.158");
        factory.setPort(5672);
        factory.setUsername("jack");
        factory.setPassword("123456");
        factory.setVirtualHost("/test");
    }
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = factory.newConnection();
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
