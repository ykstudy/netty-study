package cn.ykstudy.im.protocol.response;

import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;
import cn.ykstudy.im.session.Session;
import lombok.Data;


@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return Command.GROUP_MESSAGE_RESPONSE;
    }
}
