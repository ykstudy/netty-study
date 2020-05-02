package cn.ykstudy.im.protocol.request;

import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;
import lombok.Data;


@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return Command.JOIN_GROUP_REQUEST;
    }
}
