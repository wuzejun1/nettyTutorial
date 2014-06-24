package netty.tutorial.charpter1.timeServer;


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class TimeEncoder extends MessageToByteEncoder<UnixTime> {
    @Override
    public void encode(ChannelHandlerContext ctx, UnixTime msg, ByteBuf out) {
        out.writeInt(msg.value());
    }
}