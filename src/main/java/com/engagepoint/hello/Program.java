package com.engagepoint.hello;

/*import net.schmizz.sshj.*;*/

import java.io.IOException;


import com.jcraft.jsch.*;
import java.awt.*;
import javax.swing.*;

/**
 * Created by leonid.khelemes on 20.06.2014.
 */
public class Program {
    public static void main(String[] arg) {

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
        }
    }



}
