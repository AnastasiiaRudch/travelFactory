package travelfactory.test.dto;

import lombok.*;

import javax.validation.constraints.Pattern;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampaignDto {

    private int id;

    private String campaignName;

    @Pattern(regexp = "^[\\w-.]+@([\\w-]+.)+[\\w-]{2,4}$", message = "wrong format for field email")
    private String email;

    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s./0-9]*$", message = "wrong format for field phone number")
    private String phoneNumber;

}
