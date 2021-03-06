package net.joelinn.stripe.error.card;

import net.joelinn.stripe.error.StripeApiException;
import net.joelinn.stripe.response.ErrorResponse;

/**
 * User: Joe Linn
 * Date: 5/22/2014
 * Time: 3:14 PM
 */
public class CardDeclinedException extends CardException{
    public CardDeclinedException(ErrorResponse response, int code) {
        super(response, code);
    }

    public CardDeclinedException(StripeApiException e) {
        super(e);
    }
}
