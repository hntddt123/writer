package writer;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransformerCombinationTest {

  private Writer writer;

  @Test @SuppressWarnings("unchecked")
  public void writeAStupidReplacerAndLowerCaseString() throws IOException {
    writer = new StringWriter(StupidReplacerTransformer::transform,
      LowerCaseTransformer::transform);

    writer.write("This is a stupid DuplicateRemoverAndLower test");

    assertEquals("this is a s***** duplicateremoverandlower test",
      writer.getContent());
  }

  @Test @SuppressWarnings("unchecked")
  public void writeADuplicateRemoverAndUpperCaseString() throws IOException {
    writer = new StringWriter(DuplicateRemoverTransformer::transform,
      UpperCaseTransformer::transform);

    writer.write("This is is a DuplicateRemoverAndUpper test");

    assertEquals("THIS IS A DUPLICATEREMOVERANDUPPER TEST",
      writer.getContent());
  }

  @Test @SuppressWarnings("unchecked")
  public void writeADuplicateRemoverAndStupidReplacerString() throws IOException {
    writer = new StringWriter(DuplicateRemoverTransformer::transform,
      StupidReplacerTransformer::transform);

    writer.write("This is really really stupid");

    assertEquals("This is really s*****",
      writer.getContent());
  }
}
