package writer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateRemoverTransformerTest {

  @Test
  public void duplicateRemoverTransform() {
    assertEquals("This is not a duplicate test duplicate",
            DuplicateRemoverTransformer.transform(
                    "This is not a duplicate duplicate test duplicate"));
  }
}
