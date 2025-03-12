package sangamportfolioweb.sangamportfolioweb.privacyPolicyAndroid.privacyPolicy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivacyPolicyRepository extends MongoRepository<PrivacyPolicyResponseModel, String> {
}