package com.cvt.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDPServer
 *
 * @author cvt admin
 * Time: 2018/11/26 : 15:07
 */
public class UDPServer {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(14672);
        byte[] data = new byte[1024];

        DatagramPacket packet = new DatagramPacket(data, data.length);

        System.out.println("**** 服务端已经启动 ****");

        // 会一直阻塞，直到接收到数据
        socket.receive(packet);

    }
}
