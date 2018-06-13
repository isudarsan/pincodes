/**
 * 
 */
package org.asnworks.apis.pincodes.repos;

import java.util.List;

import org.asnworks.apis.pincodes.domain.PinCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author sudambat
 *
 */
public interface PinCodeRepository extends JpaRepository<PinCode, Long> {

    List<PinCode> fetchByCode(@Param("code") final String code);
}
