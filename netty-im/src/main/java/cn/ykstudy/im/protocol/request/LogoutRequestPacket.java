package cn.ykstudy.im.protocol.request;

import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;
import lombok.Data;


@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return Command.LOGOUT_REQUEST;
    }
}
