package cn.ykstudy.iot.common.message;

import cn.ykstudy.iot.internal.InternalMessage;

/**
 * 消息转发,基于kafka
 * @author james
 */
public interface GrozaKafkaService {
    void send(InternalMessage internalMessage);
}
