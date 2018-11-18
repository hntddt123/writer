package writer;

import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class Writer {

  private Function<String, String> transformer;
                                  
  @SuppressWarnings("unchecked")
  public Writer(Function<String, String>... transformers) {

    transformer = Stream.of(transformers)
      .reduce(Function.identity(), Function::andThen);
  }

  public void write(String input) throws IOException {
    writeContent(transformer.apply(input));
  }

  public abstract void writeContent(String input) throws IOException;
  
  public abstract String getContent() throws IOException;
}
