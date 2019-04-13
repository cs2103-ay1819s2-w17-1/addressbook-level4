package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_OPENING_HOURS;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_POSTAL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_POSTAL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEBLINK_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEBLINK_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.FoodDiary;
import seedu.address.model.restaurant.Restaurant;

/**
 * A utility class containing a list of {@code Restaurant} objects to be used in tests.
 */
public class TypicalRestaurants {

    public static final Restaurant ALICE = new RestaurantBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPostal("123456")
            .withPhone("94351253")
            .withTags("friends")
            .withWeblink("www.google.com.sg")
            //.withReviews("sucks","5","2019-03-18T09:22:07.138")
            .build();


    public static final Restaurant BENSON = new RestaurantBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withPostal("123457")
            .withEmail("johnd@example.com").withPhone("98765432").withWeblink("www.google.com.sg")
            .withTags("owesMoney", "friends").build();
    public static final Restaurant CARL = new RestaurantBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").withPostal("256914")
            .withWeblink("www.google.com.sg").build();
    public static final Restaurant DANIEL = new RestaurantBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withPostal("123495")
            .withWeblink("www.google.com.sg").withTags("friends").build();
    public static final Restaurant ELLE = new RestaurantBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave")
            .withPostal("999999").withWeblink("www.google.com.sg").build();
    public static final Restaurant FIONA = new RestaurantBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo")
            .withWeblink("www.google.com.sg").withPostal("000000").build();
    public static final Restaurant GEORGE = new RestaurantBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street")
            .withWeblink("www.google.com.sg").withPostal("000001").build();

    // Manually added
    public static final Restaurant HOON = new RestaurantBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").withWeblink("www.google.com.sg").build();
    public static final Restaurant IDA = new RestaurantBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").withWeblink("www.google.com.sg").build();

    // Manually added - Restaurant's details found in {@code CommandTestUtil}
    public static final Restaurant AMY = new RestaurantBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withPostal(VALID_POSTAL_AMY)
            .withTags(VALID_TAG_FRIEND).withWeblink(VALID_WEBLINK_AMY).withOpeningHours(VALID_OPENING_HOURS).build();
    public static final Restaurant BOB = new RestaurantBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withPostal(VALID_POSTAL_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .withWeblink(VALID_WEBLINK_BOB).withOpeningHours(VALID_OPENING_HOURS).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalRestaurants() {} // prevents instantiation

    /**
     * Returns an {@code FoodDiary} with all the typical restaurants.
     */
    public static FoodDiary getTypicalFoodDiary() {
        FoodDiary ab = new FoodDiary();
        for (Restaurant restaurant : getTypicalRestaurants()) {
            ab.addRestaurant(restaurant);
        }
        return ab;
    }

    public static List<Restaurant> getTypicalRestaurants() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
