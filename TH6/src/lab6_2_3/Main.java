/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2_3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ADMIN
 */
public class Main {
    static final int PORT = 1234;
    public static void main(String[] args) {
        Chat app = new Chat();
        app.setVisible(true);
        
        DatagramSocket socket;
        String strContent = "";
        try {
            byte []buffer = new byte[1024];
            socket = new DatagramSocket(PORT);
            boolean ktFinish = false;
            DatagramPacket receivePacket;
            String stReceive;
            while(ktFinish != true){
                receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);
                stReceive = new String(receivePacket.getData(),0,receivePacket.getLength());
                strContent = app.getContentChat();
                strContent += "Nhan: " + stReceive + "\n";
                app.setContentChat(strContent);
                if(stReceive.equals("end.") || stReceive.equals("end.")){
                    ktFinish = true;
                }
            }
            
        } catch (Exception e) {
        }
    }
}
