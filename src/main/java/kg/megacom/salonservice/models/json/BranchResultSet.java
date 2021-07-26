package kg.megacom.salonservice.models.json;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BranchResultSet {

    private Long id;
    private String address;
    private double lat;
    private double lon;
    private boolean active;
    private String phone;

    public BranchResultSet(Long id, String address, double lat, double lon, boolean active, String phone) {
        this.id = id;
        this.address = address;
        this.lat = lat;
        this.lon = lon;
        this.active = active;
        this.phone = phone;
    }
}
