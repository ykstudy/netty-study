package cn.ykstudy.im.protocol.response;


import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return Command.HEARTBEAT_RESPONSE;
    }
}
