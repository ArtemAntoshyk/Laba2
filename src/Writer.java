import java.io.*;

public class Writer {
    String filename;
    Fibonachi fibonachi;


    public Writer(String filename, int range) {
        this.filename = filename;
        fibonachi = new Fibonachi(range);
        fibonachi.findFibonachi();
    }

    public void startWrite() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write("Numbers fibonachi range "+ String.valueOf(fibonachi.range)+"--> "+'\t');
            bw.write(String.valueOf(fibonachi.numsFibonachi));
            bw.write('\n');

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

