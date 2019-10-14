import java.io.*; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.util.*; 
  
public class SocketClient 
{ 
    public static void main(String args[]) throws IOException 
    { 
        Scanner sc = new Scanner(System.in); 
  
        
        DatagramSocket ds = new DatagramSocket(); 
  
        InetAddress ip = InetAddress.getLocalHost(); 
        byte buf[] = null; 
  		       
        System.out.println("Enter the number of input port lines");
        int n=sc.nextInt();
        for(int i=(n*(10000)+27);i<=((n*(10000)+27)+(n*100));i+=100)
        {
        	
        	while (true) 
        	{ 
                        
        		String inp = sc.nextLine(); 
  
            // convert the String input into the byte array. 
        		buf = inp.getBytes(); 
  
            //  Create the datagramPacket for sending 
            // the data. 
        		DatagramPacket DpSend = 
                  new DatagramPacket(buf, buf.length, ip, i); 
  
            // invoke the send call to actually send 
            // the data. 
        		ds.send(DpSend); 
                        System.out.println("port number:"+i);
            // break the loop if user enters "bye" 
    
        		break; 
        	}
        } 
    } 
}

