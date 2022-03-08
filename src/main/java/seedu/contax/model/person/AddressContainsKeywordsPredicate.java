package seedu.contax.model.person;

import java.util.List;
import java.util.function.Predicate;

import seedu.contax.commons.util.StringUtil;

/**
 * Tests that a {@code Person}'s {@code Email} matches any of the keywords given.
 */
public class AddressContainsKeywordsPredicate extends ContainsKeywordsPredicate  implements Predicate<Person> {

    public AddressContainsKeywordsPredicate(List<String> keywords) {
        super(keywords);
    }

    @Override
    public boolean test(Person person) {
        return super.getKeywords().stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(person.getAddress().toString(), keyword));
    }
}
