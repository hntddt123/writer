package writer;

public interface UpperCaseTransformer {

  static String transform(String content) {
    return content.toUpperCase();
  }
}
