package cn.ykstudy.im.attribute;

import cn.ykstudy.im.session.Session;
import io.netty.util.AttributeKey;


public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
