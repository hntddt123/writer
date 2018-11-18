package writer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpperCaseTransformerTest {

  @Test
  public void upperCaseTransform() {
    assertEquals("THIS IS A TEST",
            UpperCaseTransformer.transform("This is a test"));
  }
}
