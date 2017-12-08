package com.biierg.cocc.common.support;

import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.apache.mina.filter.codec.demux.MessageEncoder;

import com.biierg.cocc.common.util.Constants;

/**
 * 心跳消息编码
 * 
 * @author lei
 */
public class HeartbeatEncoder implements MessageEncoder<String> {

	@Override
	public void encode(IoSession paramIoSession, String paramT,
			ProtocolEncoderOutput paramProtocolEncoderOutput) throws Exception {
		
		byte[] tMsgContent = paramT.getBytes(Charset.forName("UTF-8"));
		byte[] tMsgType = Constants.TcpHeader.Heartbeat_Header;
		
		int msgPKLength = tMsgType.length + tMsgContent.length;
		
		IoBuffer buf = IoBuffer.allocate(4 + tMsgType.length + tMsgContent.length);
		paramProtocolEncoderOutput.write(buf.putInt(msgPKLength).put(tMsgType).put(tMsgContent).flip());
	}
}
