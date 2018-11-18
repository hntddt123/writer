package writer;

public class StringWriterTest extends WriterTest {

  @Override @SuppressWarnings("unchecked")
  protected Writer createWriter() {
    return new StringWriter();
  }
}