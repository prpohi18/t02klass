import java.io.*;

public class RAM{

    public static void main(String[] args)throws IOException{

    BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter RAM Mhz value : ");
    double ramMHZ = Double.parseDouble(buffer.readLine());

    System.out.println("Enter RAM CL value : ");
    int ramCL = Integer.parseInt(buffer.readLine());

    RamTiming ram = new RamTiming();

    ram.MHZ = ramMHZ;
    ram.CL = ramCL;

    double nanoSeconds = ram.ramTiming(ramMHZ, ramCL);
    System.out.println("Your RAM latency is " + nanoSeconds + " ns");
    }
}