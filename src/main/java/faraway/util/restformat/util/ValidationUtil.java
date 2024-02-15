package faraway.util.restformat.util;

import faraway.util.restformat.domain.exception.CustomValidationException;
import org.springframework.validation.BindingResult;

public final class ValidationUtil {
    public static void checkErrors(BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            throw new CustomValidationException(bindingResult);
        }
    }
}
