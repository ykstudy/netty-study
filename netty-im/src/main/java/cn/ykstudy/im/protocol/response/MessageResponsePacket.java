package cn.ykstudy.im.protocol.response;

import cn.ykstudy.im.protocol.command.Command;
import cn.ykstudy.im.protocol.Packet;
import lombok.Data;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return Command.MESSAGE_RESPONSE;
    }
}
