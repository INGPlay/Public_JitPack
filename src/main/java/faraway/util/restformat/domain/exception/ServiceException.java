package faraway.util.restformat.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ServiceException {
    NOT_FOUND_IN_REPOSITORY("찾을 수 없는 데이터입니다.", HttpStatus.NOT_FOUND)
    ;

    private String errorMessage;
    private HttpStatus StatusCode;
}
