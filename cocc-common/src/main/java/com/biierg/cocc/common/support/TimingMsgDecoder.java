package com.biierg.cocc.common.support;

import java.util.Arrays;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.filter.codec.demux.MessageDecoder;
import org.apache.mina.filter.codec.demux.MessageDecoderResult;

import com.biierg.cocc.common.bean.IpsMessage;
import com.biierg.cocc.common.util.BeanUtils;
import com.biierg.cocc.common.util.ByteUtils;
import com.biierg.cocc.common.util.Constants;

public class TimingMsgDecoder implements MessageDecoder {

	@Override
	public MessageDecoderResult decodable(IoSession paramIoSession, IoBuffer paramIoBuffer) {

		if (paramIoBuffer.remaining() >= Constants.TcpHeader.TimingMsg_Header.length + 4) {
			if (Arrays.equals(Constants.TcpHeader.TimingMsg_Header,
					ByteUtils.getRange(paramIoBuffer.array(), 4, Constants.TcpHeader.TimingMsg_Header.length + 4))) {
				return MessageDecoderResult.OK;
			}
		} else {
			return MessageDecoderResult.NEED_DATA;
		}

		return MessageDecoderResult.NOT_OK;
	}

	@Override
	public MessageDecoderResult decode(IoSession paramIoSession, IoBuffer paramIoBuffer,
			ProtocolDecoderOutput paramProtocolDecoderOutput) throws Exception {

		if (paramIoBuffer.remaining() >= 4) {
			// 数据包长度
			int msgPKLength = ByteUtils.getInt4Bigendian(paramIoBuffer.array(), 0, 4);

			// 数据完整性检查
			if (paramIoBuffer.remaining() >= msgPKLength + 4) {

				int startIndex = Constants.TcpHeader.TimingMsg_Header.length + 4;
				int endIndex = 4 + msgPKLength;

				if (paramIoBuffer.remaining() >= endIndex) {
					paramProtocolDecoderOutput.write(BeanUtils.bytes2Object(
							ByteUtils.getRange(paramIoBuffer.array(), startIndex, endIndex), IpsMessage.class));

					paramIoBuffer.skip(endIndex);
					return MessageDecoderResult.OK;
				}

			}
		}
		return MessageDecoderResult.NEED_DATA;
	}

	@Override
	public void finishDecode(IoSession paramIoSession, ProtocolDecoderOutput paramProtocolDecoderOutput)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
