package writer;

public interface StupidReplacerTransformer {

  static String transform(String content) {
    return content.replace("stupid", "s*****");
  }
}
