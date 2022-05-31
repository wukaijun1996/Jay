package src.集合;

import java.io.IOException;

public class guanji {
    public static void main(String[] args) throws IOException, InterruptedException {
        shutDown();
    }

    private static void cancelShutDown() throws IOException {


    }

    private static void shutDown() throws IOException {
        Runtime.getRuntime().exec("shutdown -r -t 0 -f");
    }
}
