# SRT File Combiner

## Description
This Java program, `SrtFileReader`, is designed to combine multiple SubRip subtitle (.srt) files into a single text file. It recursively searches a specified directory for .srt files, reads their content, and merges them into one text file, while skipping lines that start with a number.

## Features

- Combines multiple .srt files into one text file.
- Removes lines starting with numbers, typically representing timestamps in .srt format.
- Easy to use and customizable according to specific directory paths and output file names.

## Usage

1. Replace `"/path/to/srt/files"` with the actual directory path containing the .srt files in the `directoryPath` variable.
2. Set the desired output file name in the `outputFileName` variable.
3. Compile and run the program.
4. The combined .srt files will be generated as `combined_srt.txt` in the specified directory.

## Example

Suppose you have multiple .srt files in the directory `/home/user/subtitles/` and you want to combine them into one file named `combined_subtitles.txt`. Update the `directoryPath` variable in the code to `/home/user/subtitles/` and the `outputFileName` variable to `combined_subtitles.txt`, then run the program.

## Dependencies

- Java Development Kit (JDK) installed on your system.

## Instructions for Running

1. Compile the Java file: `javac SrtFileReader.java`.
2. Run the compiled program: `java SrtFileReader`.

## License

This software is provided under the MIT License. You are free to use, modify, and distribute it according to the terms of the license.

## Contributing

Contributions are welcome! Feel free to fork this repository, make improvements, and submit pull requests.

## Authors

- [HamidReza Shahian] - Initial version

## Acknowledgments

- Thanks to the creators of SubRip subtitle format for providing a widely used standard for subtitle files.
- Inspired by the need to organize and combine subtitle files for better media consumption experience.

## Contact

For any inquiries or suggestions, please contact [hamidreza.shahian@gmail.com].
