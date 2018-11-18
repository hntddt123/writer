package writer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerCaseTransformerTest {

  @Test
  public void lowerCaseTransform() {
    assertEquals("this is a test",
            LowerCaseTransformer.transform("THIS IS A TEST"));
  }
}
