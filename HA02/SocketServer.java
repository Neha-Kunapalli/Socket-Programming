import java.io.*; 
import java.net.*; 
 

import java.util.*; 
  
public class SocketServer 
{ 
    public static void main(String[] args) throws IOException 
    { 
       
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of input port lines");
        int n=sc.nextInt();
        for(int i=(n*(10000)+27);i<=((n*(10000)+27)+(n*100));i+=100)
    	{
        	DatagramSocket ds = new DatagramSocket(i); 
        	byte[] receive = new byte[65535]; 
  
        	DatagramPacket DpReceive = null; 
        	while (true) 
        	{ 
  
                        DpReceive = new DatagramPacket(receive, receive.length); 
  
        		ds.receive(DpReceive); 
  
        		System.out.println("Client:-" + data(receive)); 
            
            // Exit the server if the client sends "bye" 
        		break;
  
            // Clear the buffer after every message. 
           
        	} 
    	} 
    }
    // A utility method to convert the byte array 
    // data into a string representation. 
    public static StringBuilder data(byte[] a) 
    { 
        if (a == null) 
            return null; 
        StringBuilder ret = new StringBuilder(); 
        int i = 0; 
        while (a[i] != 0) 
        { 
            ret.append((char) a[i]); 
            i++; 
        } 
        return ret; 
    } 
} 

