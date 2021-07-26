package kg.megacom.salonservice.models.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDtoAll {

    private String address;
    private double lat;
    private double lon;
    private boolean active;
    private List<PhoneDtoAll> phones;

    public BranchDtoAll(String address, double lat, double lon, boolean active) {
        this.address = address;
        this.lat = lat;
        this.lon = lon;
        this.active = active;
    }

}
