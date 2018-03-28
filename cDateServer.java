import java.net.*;
import java.io.*;
import java.util.*;

class DateServer

{

    public static void main(String args[]) throws Exception
    {

        InetAddress locIP = InetAddress.getByName("192.168.116.128");
        ServerSocket s=new ServerSocket(7778);

        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket soc=s.accept();

            DataOutputStream out=new 
DataOutputStream(soc.getOutputStream());

            out.writeBytes("Server Date: " + (new Date()).toString() + 
"\n");
            out.close();
            soc.close();

        }

    }

}
