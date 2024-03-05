import java.io.*;

public class SrtFileReader {
    public static void main(String[] args) {
        // Directory containing the .srt files
        String directoryPath = "G:\\learn\\java_Interview\\document";
        // Output text file name
        String outputFileName = "combined_vtt.txt";

        // Create output file
        File outputFile = new File(directoryPath + "/" + outputFileName);

        try {
            // Create FileWriter to write to the output text file
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // List all files in the directory
            File directory = new File(directoryPath);
            File[] files = directory.listFiles();

            // Loop through each file
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".vtt")) {
                        // Read the content of the .srt file
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            // Write each line to the output file
                            if (!line.matches("^\\d.*")) {
                                writer.write(line);
                                writer.newLine();
                            }
                        }

                        // Close the BufferedReader for this file
                        bufferedReader.close();
                    }
                }
            }

            // Close the BufferedWriter for the output file
            writer.close();

            System.out.println("Combined .srt files into " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}