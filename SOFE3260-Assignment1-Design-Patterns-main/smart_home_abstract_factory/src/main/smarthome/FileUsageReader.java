package smarthome;

import java.io.Bufferedreader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileUsageReader implements UsageReader {
    private final String filePath;

    public FileUsageReader(String filepath) {
        this.filePath = Objects.requireNonNull(filePath);
    }

    @Override
    public int read(String key) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)) {
            String line, prefix = key + "=";
            while ((line = br.readLine()) != null) {
                if (line.startsWith(prefix)) {
                    return Integer.parseInt(line.substring(prefix.length()).trim());
                }
            }
            throw new IllegalStateException("Key '" + key + "' not found in " + filePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read usage from " + filePath, e);
        }
    }
}