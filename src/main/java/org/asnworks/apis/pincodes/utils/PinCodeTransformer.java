/**
 * 
 */
package org.asnworks.apis.pincodes.utils;

import java.util.List;

import org.asnworks.apis.pincodes.domain.PinCode;
import org.asnworks.apis.pincodes.dto.LocalityDTO;
import org.asnworks.apis.pincodes.dto.LocalityResponseDTO;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

/**
 * @author sudambat
 */
@Component
public class PinCodeTransformer {

    public LocalityResponseDTO transform(final List<PinCode> pinCodes) {
        LocalityResponseDTO localityResponseDTO = new LocalityResponseDTO();
        List<LocalityDTO> localityDTOs = Lists.newArrayList();
        for (PinCode pinCode : pinCodes) {
            LocalityDTO localityDTO = new LocalityDTO(pinCode.getVillageName(),
                pinCode.getDistrictName(), pinCode.getStateName());
            localityDTOs.add(localityDTO);
        }

        localityResponseDTO.setLocalities(localityDTOs);
        return localityResponseDTO;
    }
}
