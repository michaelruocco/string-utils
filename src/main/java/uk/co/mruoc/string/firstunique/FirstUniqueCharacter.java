package uk.co.mruoc.string.firstunique;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class FirstUniqueCharacter {

    private FirstUniqueCharacter() {
        // utility class
    }

    public static char forceFind(String input) {
        return find(input).orElseThrow(() -> new NoUniqueCharactersException(input));
    }

    public static Optional<Character> find(String input) {
        validate(input);
        return toUniqueChars(input).findFirst();
    }

    private static void validate(String input) {
        if (input == null) {
            throw new NoUniqueCharactersException("cannot pass null string");
        }
    }

    private static Stream<Character> toUniqueChars(String input) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            if (uniqueChars.contains(c)) {
                uniqueChars.remove(c);
            } else {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.stream();
    }

}
