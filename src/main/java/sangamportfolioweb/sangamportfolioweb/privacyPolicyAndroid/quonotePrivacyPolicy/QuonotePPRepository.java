package sangamportfolioweb.sangamportfolioweb.privacyPolicyAndroid.quonotePrivacyPolicy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuonotePPRepository extends MongoRepository<QuonotePPResponseModel, String> {
}