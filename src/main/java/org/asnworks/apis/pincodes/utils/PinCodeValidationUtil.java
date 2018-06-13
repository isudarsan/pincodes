/**
 * 
 */
package org.asnworks.apis.pincodes.utils;

import org.asnworks.apis.pincodes.constants.Constants;
import org.asnworks.apis.pincodes.dto.LocalityRequestDTO;
import org.springframework.stereotype.Component;

/**
 * @author sudambat
 *
 */
@Component
public class PinCodeValidationUtil {

    public boolean isValidPinCode(final String pinCode) {
        return pinCode.matches(Constants.PIN_CODE_REGEX);
    }

    public boolean isInvalidRequest(final LocalityRequestDTO localityRequestDTO) {
        return (null == localityRequestDTO || null == localityRequestDTO.getCode()) ? true : false;
    }
}
