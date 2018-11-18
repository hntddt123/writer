package writer;

import java.io.*;
import java.nio.file.*;
import static java.util.stream.Collectors.joining;
import java.util.function.Function;

public class FileWriter extends Writer {

  public static final String path = "./build/contents.dat";

  @SuppressWarnings("unchecked")
  public FileWriter(Function<String, String>... transformers) {
    super(transformers);
  }

  @Override
  public void writeContent(String input) throws IOException {
    try(var writer = new java.io.FileWriter(new File(path), true)) {
      writer.append(input);
    }
  }

  @Override
  public String getContent() throws IOException {
    return Files.lines(Paths.get(path)).collect(joining(""));
  }
}