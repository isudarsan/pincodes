
package org.asnworks.apis.pincodes.dto;

/**
 * @author sudambat
 */
public class LocalityDTO {

    private String locality;
    private String district;
    private String state;

    public LocalityDTO() {
    }

    public LocalityDTO(String locality, String district, String state) {
        super();
        this.locality = locality;
        this.district = district;
        this.state = state;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
