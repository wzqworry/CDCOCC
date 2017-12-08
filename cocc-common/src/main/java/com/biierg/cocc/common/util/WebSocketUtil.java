/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.Session;

/**
 * @author wzq
 *
 */
public class WebSocketUtil {
    private static Logger log = LoggerFactory.getLogger(WebSocketUtil.class);

    public static Map<String, Session> clients = new ConcurrentHashMap<String, Session>(); 

    //创建一个session
    public static void add(String userId, Session session) {
        clients.put(userId,session);
        log.info("当前连接数 = " + clients.size());

    }

    //接收到消息
    public static void receive(String userId, String message) {
        log.info("收到消息 : UserId = " + userId + " , Message = " + message);
        log.info("当前连接数 = " + clients.size());
    }

    //
    public static void remove(String userId) {
        clients.remove(userId);
        log.info("当前连接数 = " + clients.size());

    }

    //发送消息
    public static void sendMessage(String userId , String message) {
        log.info("当前连接数 = " + clients.size());
        Session session = clients.get(userId);
        if(session == null){
        }else{
        	synchronized(session) {
        		session.getAsyncRemote().sendText(message);
        	}
        }

    }

}
