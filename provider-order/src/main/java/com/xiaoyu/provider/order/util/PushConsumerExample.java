package com.xiaoyu.provider.order.util;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * WJY
 */
public class PushConsumerExample {
    private static final Logger logger = LoggerFactory.getLogger(PushConsumerExample.class);


    public static void main(String[] args) throws MQClientException {
        // 使用指定的使用者组名称实例化
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("test_producer_group");
        // 指定名称服务器地址
        consumer.setNamesrvAddr("127.0.0.1:9876");
        // 指定从哪里开始，以防指定的消费群体是一个全新的消费群体
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        //   订阅主题 tag="*"代表订阅 TopicTest主题下所有子主题消息
        consumer.subscribe("TestTopic", "tagA");
        // 注册回调函数，以便在从代理获取的消息到达时执行
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            public ConsumeConcurrentlyStatus consumeMessage(
                    List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
                for (MessageExt msg : msgs) {
                    System.out.println("消费者消费数据:"+new String(msg.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        // 启动消费者实例
        consumer.start();
        // 如果配置信息错误或者当前服务不可用,报错MQClientException
        consumer.fetchSubscribeMessageQueues("test_producer_group");
    }

}
