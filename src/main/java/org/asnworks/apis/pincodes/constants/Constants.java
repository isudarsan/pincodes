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

    // Swagger UI Constants
    public static final String BASE_PACKAGE_FOR_SWAGGER = "org.asnworks.apis.pincodes.rest";

    public static final String SWAGGER_API_TITLE = "Indian Pincodes API";

    public static final String SWAGGER_API_DESCRIPTION = "Rest Api";

    public static final String SWAGGER_API_VERSION = "1.0";

    public static final String SWAGGER_API_TERMS_OF_SERVICE_URL = "Terms & Conditions";

    public static final String SWAGGER_API_CONTACT_NAME = "Sudarshan";

    public static final String SWAGGER_API_CONTACT_EMAIL = "sudarsan.a@icloud.com";

    public static final String SWAGGER_API_CONTACT_URL = "https://github.com/isudarsan/";

    public static final String SWAGGER_API_LICENSE = "Apache License 2.0";

    public static final String SWAGGER_API_LICENSE_URL = "https://github.com/isudarsan/pincodes/blob/master/LICENSE";


    // REST Endpoints
    public static final String PIN_CODE_END_POINT = "/pincode";

}
