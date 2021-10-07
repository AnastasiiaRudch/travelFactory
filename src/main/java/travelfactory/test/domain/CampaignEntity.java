package travelfactory.test.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CampaignEntity {

    @Id
    private int id;

    @Column
    private String campaignName;

    @Column
    private String email;

    @Column
    private String phoneNumber;

}
