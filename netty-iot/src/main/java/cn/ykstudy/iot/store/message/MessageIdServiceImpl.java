package cn.ykstudy.iot.store.message;

import cn.ykstudy.iot.common.message.GrozaMessageIdService;
import org.springframework.stereotype.Service;

@Service
public class MessageIdServiceImpl implements GrozaMessageIdService {
    @Override
    public int getNextMessageId() {
        return 0;
    }
}
