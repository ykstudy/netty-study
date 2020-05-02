package cn.ykstudy.im.protocol.request;

import cn.ykstudy.im.protocol.Packet;
import lombok.Data;


import java.util.List;

import static cn.ykstudy.im.protocol.command.Command.CREATE_GROUP_REQUEST;


@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
