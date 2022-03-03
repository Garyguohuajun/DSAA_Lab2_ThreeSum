import edu.princeton.cs.algs4.ThreeSum;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class TestThreeSum {
    
    public static void main( String[] args ) {
        for( int i = 1; i <= 8; ++ i ) {
            try {

                In fin = new In("./src/data/"+i+"Kints.txt");
                // algs4提供的读取文件的类
                // 先用GenData造出来随机数据，然后将数据存在data中
                int[] arr = fin.readAllInts();
                fin.close();

                StdOut.printf("Calculating sums in %dKints.txt:", i);
                Stopwatch timer = new Stopwatch();
                int count = ThreeSum.count(arr);
                
                StdOut.printf(" size of data: %d, result: %d sums, time spent: %f seconds.\n", arr.length, count, timer.elapsedTime());
            } catch( IllegalArgumentException e ) {
                e.printStackTrace();
            }
        }
    }
}
