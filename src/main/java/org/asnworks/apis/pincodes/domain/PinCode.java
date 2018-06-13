
package org.asnworks.apis.pincodes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/***
 * @author Sudarshan Index column for better performance mysql> ALTER TABLE pincode ADD INDEX index_pincode (pin_code); mysql> EXPLAIN
 *         select * from pincode where pin_code='521165';
 */
@Entity
@NamedQuery(name = "PinCode.fetchByCode",
    query = "SELECT p FROM PinCode p WHERE p.code =:code")
public class PinCode implements java.io.Serializable {

    private static final long serialVersionUID = -2416436344701442703L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "village_name")
    private String villageName;
    @Column(name = "office_name")
    private String officeName;
    @Column(name = "pin_code")
    private String code;
    @Column(name = "sub_district_name")
    private String subDistrictName;
    @Column(name = "district_name")
    private String districtName;
    @Column(name = "state_name")
    private String stateName;

    public PinCode() {
    }

    public PinCode(String villageName, String officeName, String code, String subDistrictName, String districtName, String stateName) {
        super();
        this.villageName = villageName;
        this.officeName = officeName;
        this.code = code;
        this.subDistrictName = subDistrictName;
        this.districtName = districtName;
        this.stateName = stateName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubDistrictName() {
        return subDistrictName;
    }

    public void setSubDistrictName(String subDistrictName) {
        this.subDistrictName = subDistrictName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
