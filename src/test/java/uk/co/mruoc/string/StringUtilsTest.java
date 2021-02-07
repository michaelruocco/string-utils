package uk.co.mruoc.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    private static final int N = 4;

    @Test
    void shouldReturnLastNCharsOfValue() {
        String value = "12345";

        String lastN = StringUtils.extractLastNChars(value, N);

        assertThat(lastN).isEqualTo("2345");
    }

    @Test
    void shouldReturnWholeValueIfValueIsShorterThanN() {
        String value = "12";

        String lastN = StringUtils.extractLastNChars(value, N);

        assertThat(lastN).isEqualTo(value);
    }

}
