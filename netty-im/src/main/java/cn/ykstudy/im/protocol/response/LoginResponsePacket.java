package cn.ykstudy.im.protocol.response;

import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;
import lombok.Data;

@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return Command.LOGIN_RESPONSE;
    }
}
