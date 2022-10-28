package assignments.creditCard;

import assignment.creditCard.CreditCardNumberValidation;
import assignment.creditCard.exceptions.InvalidCardLengthException;
import assignment.creditCard.exceptions.InvalidCardNumberException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardNumberValidationTest {
    private CreditCardNumberValidation creditCardNumberValidation;

    @BeforeEach
    void setUp() {
        creditCardNumberValidation = new CreditCardNumberValidation();
    }

    @Test
    void testThatCreditCardNumberStartsWithFour() {
        String cardNumber = "43522190887998";
        assertTrue(CreditCardNumberValidation.isValidNumber(cardNumber));
    }

    @Test
    void testThatExceptionIsThrownIfCardNumberDoesntStartWithFour() {
        String cardNumber = "93522190887998";
        assertThrows(InvalidCardNumberException.class, () -> CreditCardNumberValidation.isValidNumber(cardNumber));
    }

    @Test
    void testThatCardNumberDoesntNotContainLetters() {
        String cardNumber = "43522190887998";
        assertTrue(CreditCardNumberValidation.isContainLetter(cardNumber));
    }

    @Test
    void testThatExceptionIsThrownIfCardNumberContainsLetter() {
        String cardNumber = "9352r19088b998";
        assertThrows(InvalidCardNumberException.class, () -> CreditCardNumberValidation.isContainLetter(cardNumber));
    }

    @Test
    void cardNumberLengthIsGreaterOrEqualToThirteenAndLessThanOrEqualToSixteenTest() {
        String cardNumber = "9352219088799878";
        assertTrue(CreditCardNumberValidation.isValidLength(cardNumber));
    }

    @Test
    void testThatExceptionIsThrownIfCardNumberIsLessThanOrGreaterThanRequiredCardNumberLength() {
        String cardNumber = "93522190887998788976689";
        assertThrows(InvalidCardLengthException.class, () -> CreditCardNumberValidation.isValidLength(cardNumber));
    }

    @Test
    void testThatWeCanGetSecondDigitOfCardNumberFromRightToLeft() {
        creditCardNumberValidation.SecondDigits();
        assertEquals("22416584",creditCardNumberValidation.getSecondDigits());
    }

    @Test
    void testThatSecondDigitsCanBeAddedUp(){
       assertEquals(37,creditCardNumberValidation.getSecondDigitsDoubled());
    }
    @Test
    void  testThatOddPlacesDigitsCanBeAddedUp(){

        assertEquals(38,creditCardNumberValidation.getSumOffOddPlace());
    }
    @Test
    void testThatCardValidityReturnsTrueIfGetSumOffOddPlacePlusGetSumOfSecondDigitsIsDivisibleByTen(){
        creditCardNumberValidation.getSumOfOddAndSecond();
        //assertFalse(creditCardNumberValidation.isCardValid());
    }

}