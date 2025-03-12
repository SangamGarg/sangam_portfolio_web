package sangamportfolioweb.sangamportfolioweb.privacyPolicyAndroid.quonotePrivacyPolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuonotePPServiceImpl implements QuonotePPService {
    @Autowired
    private QuonotePPRepository privacyPolicyRepository;

    @Override
    public QuonotePPResponseModel getPrivacyPolicy() {

        List<QuonotePPResponseModel> policyResponseModels = privacyPolicyRepository.findAll();

        if (!policyResponseModels.isEmpty()) {
            return policyResponseModels.get(0);
        } else {
            // Handle case where there is no support document found
            // This is just an example; you can handle it as needed
            return null;
        }
    }
}