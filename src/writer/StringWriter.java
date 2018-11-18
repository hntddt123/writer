package writer;

import java.util.function.Function;

public class StringWriter extends Writer {

  private StringBuilder contents = new StringBuilder();
                                              
  @SuppressWarnings("unchecked")
  public StringWriter(Function<String, String>... transformers) {
    super(transformers);
  }

  @Override
  public void writeContent(String input) {
    contents.append(input);
  }

  @Override
  public String getContent() {
    return contents.toString();
  }
}
