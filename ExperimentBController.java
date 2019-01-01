import java.util.*;
import java.io.*;
import java.awt.Point;
public class ExperimentBController
{
    public ExperimentBController() { //imports data from given csv file, and runs tests on it
        Song s = new Song();
        try {
            BufferedReader br = new BufferedReader(new FileReader("twinkle.csv")); 
            String line = null;
            while ((line = br.readLine()) != null) { 
                String[] values = line.split(",");
                s.arr.add(new Note(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4])));
            }
            br.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        try{
            Point v = new Point(32, 0);
            PrintWriter pw1 = new PrintWriter(new File("mtp_v.csv"));
            StringBuilder sb1 = new StringBuilder();
            s.pointSet();
            ArrayList<Point> vAns1 = s.maximalTranslatablePattern(v);
            for(int i = 0; i < vAns1.size(); i++) {
                sb1.append(vAns1.get(i).x + ", " + vAns1.get(i).y + "\n");
            }
            pw1.write(sb1.toString());
            pw1.close();
        }
        catch(Exception e) {
            System.out.println(e);   
        }
        
        try{
            Point w = new Point(8, 1);
            PrintWriter pw2 = new PrintWriter(new File("mtp_w.csv"));
            StringBuilder sb2 = new StringBuilder();
            s.pointSet();
            ArrayList<Point> vAns2 = s.maximalTranslatablePattern(w);
            for(int i = 0; i < vAns2.size(); i++) {
                sb2.append(vAns2.get(i).x + ", " + vAns2.get(i).y + "\n");
            }
            pw2.write(sb2.toString());
            pw2.close();
        }
        catch(Exception e) {
            System.out.println(e);   
        }
    }
}
