package com.xiaoyu.provider.order.util;


import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WJY
 */
public class ProducerExample {

    private static final Logger logger = LoggerFactory.getLogger(ProducerExample.class);

    public static void main(String[] args) throws MQClientException {
        final DefaultMQProducer producer = new DefaultMQProducer (  "test_producer_group");
        // 设置nameServer地圳
        producer.setNamesrvAddr ("127.0.0.1:9876") ;
        producer.start() ;
        for (int i = 0 ; i < 1000; i ++){
            try {
                Message message = new Message("TestTopic", "tagA", ("生产者发送消息" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                System.out.println("生产者发送消息"+i);
                // 调用发送消息将消息传递给代理
                SendResult sendResult = producer.send(message);
                System.out.printf("%s%n",sendResult);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        // 一旦生产者实例不再使用，就立即关闭
        producer.shutdown();
    }

}
