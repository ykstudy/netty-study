package cn.ykstudy.im.protocol.request;


import cn.ykstudy.im.protocol.Packet;
import cn.ykstudy.im.protocol.command.Command;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return Command.HEARTBEAT_REQUEST;
    }
}
