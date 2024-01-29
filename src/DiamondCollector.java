import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DiamondCollector {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("diamond.in"));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] input =new int[N];
        int max = 0;
        for(int i = 0; i<N ; i++){
            input[i] = Integer.parseInt(reader.readLine().trim());
        }
        reader.close();
        for(int i = 0 ; i<N ;i++){
            int c = input[i];
            int number =0;
            for (int y:input){
                if(Math.abs(y-c)<=K){
                    number++;
                }
            }
            max = Math.max(max,number);
        }
        PrintWriter pw = new PrintWriter(new FileWriter("diamond.out"));
        pw.println(max);
        pw.close();
    }
}
