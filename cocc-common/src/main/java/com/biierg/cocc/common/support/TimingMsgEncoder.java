package com.biierg.cocc.common.support;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.apache.mina.filter.codec.demux.MessageEncoder;

import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.util.BeanUtils;
import com.biierg.cocc.common.util.Constants;

/**
 * 定时消息编码
 * @author wenjuan.wang
 */
public class TimingMsgEncoder implements MessageEncoder<IpsMessage> {

	@Override
	public void encode(IoSession paramIoSession, IpsMessage paramT,
			ProtocolEncoderOutput paramProtocolEncoderOutput) throws Exception {
		
		byte[] tMsgContent = BeanUtils.object2Bytes(paramT);
		byte[] tMsgType = Constants.TcpHeader.TimingMsg_Header;
		
		int msgPKLength = tMsgType.length + tMsgContent.length;
		
		IoBuffer buf = IoBuffer.allocate(4 + tMsgType.length + tMsgContent.length);
		paramProtocolEncoderOutput.write(buf.putInt(msgPKLength).put(tMsgType).put(tMsgContent).flip());
	}

}
