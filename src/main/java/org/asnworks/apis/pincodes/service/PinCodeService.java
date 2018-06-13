/**
 * 
 */
package org.asnworks.apis.pincodes.service;

import java.util.List;

import org.asnworks.apis.pincodes.domain.PinCode;
import org.asnworks.apis.pincodes.exceptions.NoSuchPinCodeException;

/**
 * @author sudambat
 *
 */
public interface PinCodeService {

    List<PinCode> get(final String pinCode) throws NoSuchPinCodeException;
}
