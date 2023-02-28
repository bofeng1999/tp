package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is valid as declared in {@link #checkValidRemark(String)}
 */
public class Remark {
    public static final String MESSAGE_CONSTRAINTS = "Remarks should not be blank";

    /*
     * The first character of the remark must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final String remarkText;

    /**
     * Constructs a {@code Remark}.
     *
     * @param remark A valid remark.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        checkValidRemark(remark);
        this.remarkText = remark;
    }

    /**
     * Throws an {@code IllegalArgumentException} if the given string is not a valid remark.
     */
    public static void checkValidRemark(String remark) {
        checkArgument(remark.matches(VALIDATION_REGEX), MESSAGE_CONSTRAINTS);
    }

    @Override
    public String toString() {
        return this.remarkText;
    }
}
