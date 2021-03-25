package uk.co.mruoc.string.firstunique;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class FirstUniqueCharacterTest {

    @Test
    void shouldFindFirstUniqueCharacterInString() {
        String input = "AABBCDE";

        Optional<Character> firstUnique = FirstUniqueCharacter.find(input);

        assertThat(firstUnique).contains('C');
    }

    @Test
    void shouldReturnEmptyIfStringDoesNotHaveAnyUniqueCharacters() {
        String input = "AABB";

        Optional<Character> firstUnique = FirstUniqueCharacter.find(input);

        assertThat(firstUnique).isEmpty();
    }

    @Test
    void shouldThrowExceptionIfNullInputStringPassed() {
        String input = null;

        Throwable error = catchThrowable(() -> FirstUniqueCharacter.forceFind(input));

        assertThat(error)
                .isInstanceOf(NoUniqueCharactersException.class)
                .hasMessage("cannot pass null string");
    }

    @Test
    void shouldForceFindFirstUniqueCharacterInString() {
        String input = "ABABCCDDE";

        char firstUnique = FirstUniqueCharacter.forceFind(input);

        assertThat(firstUnique).isEqualTo('E');
    }

    @Test
    void shouldThrowExceptionIfForceFindAndStringDoesNotHaveAnyUniqueCharacters() {
        String input = "AA";

        Throwable error = catchThrowable(() -> FirstUniqueCharacter.forceFind(input));

        assertThat(error)
                .isInstanceOf(NoUniqueCharactersException.class)
                .hasMessage(input);
    }

    @Test
    void shouldFindFirstUniqueInLongString() {
        String input = StringUtils.repeat("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 2500000) + "@";

        char firstUnique = FirstUniqueCharacter.forceFind(input);

        assertThat(firstUnique).isEqualTo('@');
    }

}
