package uk.co.mruoc.string.transform;

import lombok.extern.slf4j.Slf4j;
import uk.co.mruoc.string.regex.Patterns;

@Slf4j
public class UuidIdStringTransformer extends RegexStringTransformer {

    private static final String DEFAULT_REPLACEMENT = "{id}";

    public UuidIdStringTransformer() {
        this(DEFAULT_REPLACEMENT);
    }

    public UuidIdStringTransformer(String replacement) {
        super(Patterns.UUID, replacement);
    }

}
