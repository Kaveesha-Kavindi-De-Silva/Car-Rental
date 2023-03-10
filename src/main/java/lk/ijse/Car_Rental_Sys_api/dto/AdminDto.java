package lk.ijse.Car_Rental_Sys_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDto {
    private String id;
    private String name;
    private String address;
    private String contact;
}
