package writer;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public interface DuplicateRemoverTransformer {

  static String transform(String content) {

    List<String> duplicateWords = Arrays.asList(content.split(" "));

    StringJoiner noDuplicateContent = new StringJoiner(" ");
    noDuplicateContent.add(duplicateWords.get(0));

    for (int index = 1; index < duplicateWords.size(); index++) {
      if (!duplicateWords.get(index - 1).equals(duplicateWords.get(index))) {
        noDuplicateContent.add(String.join(" ", duplicateWords.get(index)));
      }
    }

    return noDuplicateContent.toString();
  }
}
