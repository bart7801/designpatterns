package singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

    public static final Logger INSTANCE = new Logger();

    public Logger(){

    }

    public void log(Object obj){
        try(FileWriter fileWriter = new FileWriter("messages.log");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
            printWriter.write(LocalDateTime.now() + ": " + obj + "\n");
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
