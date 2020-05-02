package cn.ykstudy.iot.store.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cn.ykstudy.iot.common.message.GrozaKafkaService;
import cn.ykstudy.iot.internal.InternalMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author james
 * @description kafka消息生产者处理类
 */
@Service
public class KafkaServiceImpl implements GrozaKafkaService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    @Override
    public void send(InternalMessage internalMessage){
        kafkaTemplate.send(internalMessage.getTopic(),gson.toJson(internalMessage));
    }
}
