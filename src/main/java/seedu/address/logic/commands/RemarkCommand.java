package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;
import seedu.address.model.person.Remark;

/**
 * Changes the remark of an existing person
 */
public class RemarkCommand extends Command {
    public static final String COMMAND_WORD = "remark";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Edits the remark of the person identified "
            + "by the index number used in the last person listing. "
            + "Existing remark will be overwritten by the input.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + "r/[REMARK]\n"
            + "Example: " + COMMAND_WORD + " 1 "
            + "r/Likes to swim.";
    public static final String MESSAGE_ADD_REMARK_SUCCESS = "Added remark to Person: %s";
    public static final String MESSAGE_DELETE_REMARK_SUCCESS = "Removed remark from Person: %s";

    private final Index index;
    private final Remark remark;

    public RemarkCommand(Index index, Remark remark) {
        requireNonNull(index, remark);
        this.index = index;
        this.remark = remark;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        List<Person> lastShownList = model.getFilteredPersonList();
        int zeroBasedIndex = index.getZeroBased();

        if (zeroBasedIndex >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToEdit = lastShownList.get(zeroBasedIndex);
        Person editedPerson = new PersonBuilder(personToEdit)
                .withRemark(remark)
                .build();

        model.setPerson(personToEdit, editedPerson);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);

        String successMessage = generateSuccessMessage(editedPerson);
        return new CommandResult(successMessage);
    }

    private String generateSuccessMessage(Person personToEdit) {
        boolean isAddingRemark = !remark.value.isEmpty();
        String message = isAddingRemark ? MESSAGE_ADD_REMARK_SUCCESS : MESSAGE_DELETE_REMARK_SUCCESS;
        return String.format(message, personToEdit);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RemarkCommand)) {
            return false;
        }
        RemarkCommand otherCommand = (RemarkCommand) other;
        return index.equals(otherCommand.index)
                && remark.equals(otherCommand.remark);
    }
}
