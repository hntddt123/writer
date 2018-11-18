package writer;

public interface LowerCaseTransformer {

  static String transform(String content) {
    return content.toLowerCase();
  }
}
