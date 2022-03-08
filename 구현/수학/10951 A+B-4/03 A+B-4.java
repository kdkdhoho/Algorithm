import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        
        while((str = reader.readLine()) != null) {
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}