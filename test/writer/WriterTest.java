package writer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class WriterTest {

  private Writer writer;

  protected abstract Writer createWriter();

  @BeforeEach
  public void setup() {
    writer = createWriter();
  }

  @Test
  public void canary() {
    assert(true);
  }

  @Test
  public void writeNothing() throws IOException {
    assertEquals("", writer.getContent());
  }

  @Test
  public void writeAString() throws IOException {
    writer.write("This is a test");
    assertEquals("This is a test", writer.getContent());
  }

  @Test
  public void writeTwice() throws IOException {
    writer.write("a test");
    writer.write("This is a test");;
    assertEquals("a testThis is a test", writer.getContent());
  }
}