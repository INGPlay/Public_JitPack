package faraway.util.restformat.domain.exception;

import faraway.util.restformat.domain.exception.abs.AbstractCustomException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceLayerException extends AbstractCustomException {

    private final HttpStatus statusCode;
    private final ServiceException serviceException;

    public ServiceLayerException(ServiceException serviceException) {
        super(serviceException.getErrorMessage());
        this.statusCode = serviceException.getStatusCode();
        this.serviceException = serviceException;
    }

    @Override
    public HttpStatus getStatusCode() {
        return this.statusCode;
    }
}
