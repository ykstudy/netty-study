package cn.ykstudy.im.protocol.response;

import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;
import cn.ykstudy.im.session.Session;
import lombok.Data;

import java.util.List;


@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return Command.LIST_GROUP_MEMBERS_RESPONSE;
    }
}
