package uk.co.mruoc.string;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.assertj.core.api.Assertions.assertThat;

class StringFunctionComposerTest {

    @Test
    void shouldComposeMultipleStringFunctionsIntoSingleFunction() {
        UnaryOperator<String> appender = s -> s + "-appended-value";
        UnaryOperator<String> prepender = s -> "prepended-value-" + s;

        UnaryOperator<String> composed = StringFunctionComposer.compose(appender, prepender);

        assertThat(composed.apply("test")).isEqualTo("prepended-value-test-appended-value");
    }

}
