package uk.co.mruoc.string;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

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

}
