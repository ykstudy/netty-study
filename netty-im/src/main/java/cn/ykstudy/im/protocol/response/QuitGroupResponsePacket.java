package cn.ykstudy.im.protocol.response;

import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;
import lombok.Data;


@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return Command.QUIT_GROUP_RESPONSE;
    }
}
