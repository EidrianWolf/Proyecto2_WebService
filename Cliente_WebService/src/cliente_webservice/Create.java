package cliente_webservice;

// @author adr20
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Create extends Thread {

    private String id;
    private String nombre;

    public Create(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            Socket s = new Socket(InetAddress.getByName("localhost"), 8080);
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.print("POST /Server_WebService/api/users?id=" + id + "&nombre=" + nombre + " HTTP/1.0\r\n\r\n\r\n");
            pw.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String t = "";
            //while((t = br.readLine())!= null)System.out.println(t);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
