package writer;

import org.junit.jupiter.api.AfterEach;
import java.io.File;

public class FileWriterTest extends WriterTest {

  @Override @SuppressWarnings("unchecked")
  protected Writer createWriter() {
    return new FileWriter();
  }
  
  @AfterEach
  public void deleteFileAfterRun() throws Exception {
    try (var writer = new java.io.FileWriter(new File(FileWriter.path))) {}
  }
}