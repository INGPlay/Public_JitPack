package faraway.util.restformat.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ... In HTML
 * text -> option.text
 * value -> option.value
 */
@Getter
@AllArgsConstructor
public class ResponseTypeForm {
    private String text;
    private String value;
}