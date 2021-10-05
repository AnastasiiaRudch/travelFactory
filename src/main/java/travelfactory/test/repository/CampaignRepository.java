package travelfactory.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travelfactory.test.domain.CampaignEntity;

public interface CampaignRepository extends JpaRepository<CampaignEntity, Integer> {

}
