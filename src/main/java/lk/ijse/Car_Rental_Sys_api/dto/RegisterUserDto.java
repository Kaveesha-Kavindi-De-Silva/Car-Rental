package lk.ijse.Car_Rental_Sys_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RegisterUserDto {
    private String guestId;
    private String name;
    private String nic;
    private String address;
    private String contact;
    private String email;
}
