package cn.ykstudy.im.protocol.request;

import cn.ykstudy.im.protocol.command.Command;
import cn.ykstudy.im.protocol.Packet;
import lombok.Data;


@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return Command.LIST_GROUP_MEMBERS_REQUEST;
    }
}
