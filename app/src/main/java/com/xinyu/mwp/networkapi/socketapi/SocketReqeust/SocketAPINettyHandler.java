package com.xinyu.mwp.networkapi.socketapi.SocketReqeust;

import com.xinyu.mwp.listener.OnAPIListener;
import com.xinyu.mwp.networkapi.NetworkAPIFactoryImpl;
import com.xinyu.mwp.networkapi.http.NetworkHttpAPIFactoryImpl;
import com.xinyu.mwp.user.UserManager;
import com.xinyu.mwp.util.LogUtil;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * Created by yaowang on 2017/2/18.
 */

public class SocketAPINettyHandler extends SimpleChannelInboundHandler<SocketDataPacket> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        System.err.println("-检测到网络连接成功--" + ctx.channel().remoteAddress() + " is active---");
//        if (onConnectListener != null) {
//            onConnectListener.onSuccess();
//        }
    }

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, SocketDataPacket socketDataPacket) throws Exception {

        SocketAPIRequestManage.getInstance().notifyResponsePacket(socketDataPacket);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.err.println("检测到断网---" + ctx.channel().remoteAddress() + " is inactive---");
//        if (onConnectListener != null) {
//            onConnectListener.onFailure();
//        }
        SocketAPINettyBootstrap.getInstance().connect(false);
    }

//    public interface OnConnectListener {
//
//        void onExist();
//
//        void onSuccess();
//
//        void onFailure();
//    }
//
//    private OnConnectListener onConnectListener;
//
//    public void setOnConnectListener(OnConnectListener onConnectListener) {
//        this.onConnectListener = onConnectListener;
//    }
}
