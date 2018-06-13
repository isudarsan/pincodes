/**
 * 
 */
package org.asnworks.apis.pincodes.exceptions;

import org.asnworks.apis.pincodes.constants.Constants;
import org.springframework.http.HttpStatus;

/**
 * @author sudambat
 */
public class ApiError {

    private HttpStatus status;
    private String errorMessage;

    private ApiError() {
    }

    public ApiError(HttpStatus status) {
        this();
        this.status = status;
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.errorMessage = Constants.UN_KNOWN_ERROR;
    }

    public ApiError(HttpStatus status, String errorMessage, Throwable ex) {
        this();
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
