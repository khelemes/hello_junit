package com.engagepoint.hello;

/*import net.schmizz.sshj.*;*/

import java.io.IOException;


import com.jcraft.jsch.*;
import java.awt.*;
import java.io.InputStream;
import javax.swing.*;

/**
 * Created by leonid.khelemes on 20.06.2014.
 */
public class Program {
    public static void main(String[] arg) {

/*//Graph objects tests
        Point p=new Point();
*//*        p.x=10;
        p.y=32;*//*
        p.draw();


        */


        //ssh


        try {
            JSch jsch = new JSch();
            String user="root";
            String passwd="wasadmin";
            String passwd2[] =
                    {
                            "This",
                            "was5CHT",
                            "was4CHT",
                            "wasadmin",
                            "root"
                    };

            String host="192.168.34.20";
            String command="echo Hello ssh!";
            Session session=jsch.getSession(user, host, 22);
            session.setPassword(passwd);
            session.getHostKey();
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            for (String str:passwd2){
                System.out.printf("Trying password %s for host %s\n", str, host);
                session.setPassword(str);
                session.connect();
            }
            session.connect();
            Channel channel=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(command);

            //channel.setInputStream(System.in);
            channel.setInputStream(null);

            ((ChannelExec)channel).setErrStream(System.err);

            InputStream in=channel.getInputStream();

            channel.connect();

            byte[] tmp=new byte[1024];
            while(true){
                while(in.available()>0){
                    int i=in.read(tmp, 0, 1024);
                    if(i<0)break;
                    System.out.print(new String(tmp, 0, i));
                }
                if(channel.isClosed()){
                    if(in.available()>0) continue;
                    System.out.println("exit-status: "+channel.getExitStatus());
                    break;
                }
                try{Thread.sleep(1000);}catch(Exception ee){}
            }
            channel.disconnect();
            session.disconnect();

        }
        catch(Exception e){
            System.out.println(e);
        }









     /*   //work
        try {
            JSch jsch = new JSch();
            String user="root";
            String passwd="wasadmin";
            String host="192.168.34.20";

            Session session=jsch.getSession(user, host, 22);
            session.setPassword(passwd);
            session.getHostKey();

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            session.connect(30000);


            Channel channel=session.openChannel("shell");
            channel.setInputStream(System.in);
            channel.setOutputStream(System.out);

            channel.connect(3*1000);




            System.out.println("It works!") ;

        }

        catch(Exception e){
            System.out.println(e);
        }*/
    }



}
