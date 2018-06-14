/**
 * 
 */
package org.asnworks.apis.pincodes.rest;

import java.util.List;

import org.asnworks.apis.pincodes.constants.Constants;
import org.asnworks.apis.pincodes.domain.PinCode;
import org.asnworks.apis.pincodes.dto.LocalityRequestDTO;
import org.asnworks.apis.pincodes.dto.LocalityResponseDTO;
import org.asnworks.apis.pincodes.exceptions.InvalidRequestException;
import org.asnworks.apis.pincodes.exceptions.NoSuchPinCodeException;
import org.asnworks.apis.pincodes.service.PinCodeService;
import org.asnworks.apis.pincodes.utils.PinCodeTransformer;
import org.asnworks.apis.pincodes.utils.PinCodeValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sudambat
 */
@RestController
public class PinCodeController {

    @Autowired
    private PinCodeService pinCodeService;

    @Autowired
    private PinCodeTransformer pinCodeTransformer;

    @Autowired
    private PinCodeValidationUtil pinCodeValidationUtil;

    @RequestMapping(method = RequestMethod.POST, value = Constants.PIN_CODE_END_POINT)
    public ResponseEntity<LocalityResponseDTO> getPinCode(@RequestBody final LocalityRequestDTO localityRequestDTO)
        throws NoSuchPinCodeException, InvalidRequestException {

        if (pinCodeValidationUtil.isInvalidRequest(localityRequestDTO)) {
            throw new InvalidRequestException(Constants.INVALID_REQUEST_PIN_CODE_MANDATORY);
        }

        if (!pinCodeValidationUtil.isValidPinCode(localityRequestDTO.getCode())) {
            throw new InvalidRequestException(Constants.INVALID_REQUEST_PIN_CODE_MUST_BE_NUMERIC);
        }

        List<PinCode> pinCodes = pinCodeService.get(localityRequestDTO.getCode());
        LocalityResponseDTO response = pinCodeTransformer.transform(pinCodes);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
