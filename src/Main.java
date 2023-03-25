import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\Qompile\\test.py");
        System.out.println(file.exists());
        ProcessBuilder pb = new ProcessBuilder("python", "C:\\Users\\user\\IdeaProjects\\Qompile\\test.py");
        Process process = pb.start();
        ProcessLimit.cpu(process, 1);
        process.waitFor();
        System.out.println(process.exitValue());
    }
}
