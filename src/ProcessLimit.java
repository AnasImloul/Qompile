public class ProcessLimit {

    public static void cpu(long pid, int limit) {
        // execute the command "prlimit --pid <pid> --cpu <limit>"
        ProcessBuilder pb = new ProcessBuilder(
                "prlimit",
                "--pid", String.valueOf(pid),
                "--cpu", String.valueOf(limit));

        try {
            Process process = pb.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cpu(Process process, int limit) {
        cpu(process.pid(), limit);
    }
}
