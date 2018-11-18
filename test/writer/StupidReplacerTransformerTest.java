package writer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StupidReplacerTransformerTest {

  @Test
  public void stupidReplacerTransform() {
    assertEquals("This is a s***** test this is a s***** test",
            StupidReplacerTransformer.transform(
                    "This is a stupid test this is a stupid test"));
  }
}
