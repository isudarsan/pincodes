/**
 * 
 */
package org.asnworks.apis.pincodes.constants;


/**
 * @author sudambat
 *
 */
public class Constants {

    public static final String JPA_REPOSITORIES = "org.asnworks.apis.pincodes.repos";

    public static final String PACKAGE_SCAN_FOR_JPA_ENTITIES = "org.asnworks.apis.pincodes.domain";

    public static final String UN_KNOWN_ERROR = "Unknown Error";

    public static final String PIN_CODE_REGEX = "^([0-9]{6})$";

    public static final String INVALID_REQUEST_PIN_CODE_MANDATORY = "Invalid request : Pincode is mandatory";

    public static final String INVALID_REQUEST_PIN_CODE_MUST_BE_NUMERIC = "Invalid Request : Pin code must be 6 digits";

}
