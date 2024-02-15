package faraway.util.restformat.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ... In HTML
 * <select>
 *     <option value=${value}>${text}</option>
 * </select>
 */
@Getter
@AllArgsConstructor
public class ResponseTypeForm {
    private String text;
    private String value;
}