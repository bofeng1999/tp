package seedu.address.model.person;

import java.util.Set;

import seedu.address.model.tag.Tag;

enum Status {
    APPLIED,
    SHORTLISTED,
    ACCEPTED,
    REJECTED
}

/**
 * Represents an applicant in HRHero
 */
public class Applicant extends Person {
    //Applicant status
    private Status status;

    /**
     * Every field must be present and not null.
     */
    public Applicant(Name name, Phone phone, Email email, Address address, Remark remark, Set<Tag> tags) {
        super(name, phone, email, address, remark, tags);
        this.status = Status.APPLIED;
    }
}