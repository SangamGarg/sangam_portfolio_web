package sangamportfolioweb.sangamportfolioweb.websiteHome;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sangamportfolioweb.sangamportfolioweb.enums.*;
import sangamportfolioweb.sangamportfolioweb.enums.skillsEnum.*;
import sangamportfolioweb.sangamportfolioweb.experience.TechExperience;
import sangamportfolioweb.sangamportfolioweb.img.arrow.ArrowImgTag;
import sangamportfolioweb.sangamportfolioweb.img.certificate.CertificateImgTag;
import sangamportfolioweb.sangamportfolioweb.img.workExperience.WorkExperienceImgTag;
import sangamportfolioweb.sangamportfolioweb.img.project.ProjectImgTag;
import sangamportfolioweb.sangamportfolioweb.img.social.SocialMediaImgTag;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sangamportfolioweb.sangamportfolioweb.enums.experienceEnum.Designations.ANDROID_DEVELOPER_INTERN;
import static sangamportfolioweb.sangamportfolioweb.enums.experienceEnum.Designations.JAVA_DEVELOPER;
import static sangamportfolioweb.sangamportfolioweb.enums.experienceEnum.WorkDetails.ANDROID_DEVELOPER_INTERN_DETAILS;
import static sangamportfolioweb.sangamportfolioweb.enums.experienceEnum.WorkDetails.JAVA_DEVELOPER_DETAILS;
import static sangamportfolioweb.sangamportfolioweb.enums.experienceEnum.WorkExperience.TALEN_TITAN;
import static sangamportfolioweb.sangamportfolioweb.enums.experienceEnum.WorkExperience.TCS;
import static sangamportfolioweb.sangamportfolioweb.utils.Constants.*;

@Controller
public class PortfolioWebsiteController {

    @GetMapping("/")
    public String portfolio(Model model) {
        model.addAttribute("myName", MY_NAME);
        model.addAttribute("workingAs", WORKING_AS);
        model.addAttribute("myExpInYear", MY_EXPERIENCE_IN_YEARS);
        model.addAttribute("myEmail", MY_EMAIL_ID);
        model.addAttribute("resumegoogle", GOOGLE_RESUME_DRIVE);
        model.addAttribute("titles", getTitles());
        model.addAttribute("social", getSocialMediaImgTagAttributes());
        model.addAttribute("projects", getProjectImgTagAttributes());
        model.addAttribute("certificates", getCertificateImgTagAttributes());
        model.addAttribute("profilepic", PROFILE_PIC_ASSET_URL);
        model.addAttribute("aboutpic", ABOUT_PIC_ASSET_URL);
        model.addAttribute("experience", EXPERIENCE_ASSET_URL);
        model.addAttribute("education", EDUCATION_ASSET_URL);
        model.addAttribute("arrow", getArrowImgTagAttributes());
        model.addAttribute("checkmark", CHECKMARK_ASSET_URL);
        model.addAttribute("workExperience", getExperienceImgTagAttributes());
        model.addAttribute("android", getAndroidDevelopmentExperience());
        model.addAttribute("java", getJavaDevelopmentExperience());
        model.addAttribute("tools", getToolsAndApplicationsExperience());
        model.addAttribute("database", getDatabaseExperience());
        model.addAttribute("others", getOtherTechExperience());
        model.addAttribute("portfolio", PORTFOLIO_APP_URL);
        model.addAttribute("coffee", COFFEE_URL);
        model.addAttribute("banner", POC_BANNER_URL);
        model.addAttribute("coffeeAsset", COFFEE_ASSET_URL);
        model.addAttribute("linkedin", LINKEDIN_URL);
        model.addAttribute("mailtoemail", MAIL_TO_EMAIL);
        model.addAttribute("email", EMAIL_ASSET_URL);
        model.addAttribute("linkedinpic", LINKEDIN_ASSET_URL);

        return "index";
    }

    @GetMapping(path = "/download")
    public ResponseEntity<Resource> downloadResume() throws IOException {
        File file = new File(RESUME_FILE_PATH);
        Path path = Paths.get(file.getAbsolutePath());
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + RESUME_FILENAME + "\"")
                .contentLength(file.length()).contentType(MediaType.parseMediaType(RESUME_MEDIA_TYPE)).body(resource);
    }

    private static List<String> getTitles() {
        List<String> listOfTitles = new ArrayList<>();

        Arrays.stream(Titles.values()).forEach(title -> {
            listOfTitles.add(title.getValue());
        });

        return listOfTitles;
    }

    private static List<SocialMediaImgTag> getSocialMediaImgTagAttributes() {
        List<SocialMediaImgTag> imgTagList = new ArrayList<>();


        imgTagList.add(SocialMediaImgTag.builder().assetUrl(LINKEDIN_ASSET_URL).altName("My LinkedIn profile")
                .onClickAction(LINKEDIN_URL).build());
        imgTagList.add(SocialMediaImgTag.builder().assetUrl(GITHUB_ASSET_URL).altName("My Github profile")
                .onClickAction(GITHUB_URL).build());
        imgTagList.add(SocialMediaImgTag.builder().assetUrl(YOUTUBE_ASSET_URL).altName("My YouTube profile")
                .onClickAction(YOUTUBE_URL).build());
        imgTagList.add(SocialMediaImgTag.builder().assetUrl(INSTAGRAM_ASSET_URL).altName("My Instagram profile")
                .onClickAction(INSTAGRAM_URL).build());
        imgTagList.add(SocialMediaImgTag.builder().assetUrl(MEDIUM_ASSET_URL).altName("My Medium profile")
                .onClickAction(MEDIUM_URL).build());

        return imgTagList;
    }

    private static List<ProjectImgTag> getProjectImgTagAttributes() {
        List<ProjectImgTag> imgTagList = new ArrayList<>();
        imgTagList.add(ProjectImgTag.builder().assetUrl(PORTFOLIO_ASSET_URL).altName(PORTFOLIO).projectName(PORTFOLIO)
                .onGithubClickAction(PORTFOLIO_GITHUB_URL).onLiveDemoClickAction(PORTFOLIO_LIVE_DEMO_URL).build());

        imgTagList.add(ProjectImgTag.builder().assetUrl(QUONOTE_ASSET_URL).altName(QUONOTE).projectName(QUONOTE)
                .onGithubClickAction(QUONOTE_GITHUB_URL).onLiveDemoClickAction(QUONOTE_LIVE_DEMO_URL).build());

        imgTagList.add(ProjectImgTag.builder().assetUrl(MUSCLEPLAY_ASSET_URL).altName(MUSCLEPLAY)
                .projectName(MUSCLEPLAY).onGithubClickAction(MUSCLEPLAY_GITHUB_URL)
                .onLiveDemoClickAction(MUSCLEPLAY_LIVE_DEMO_URL).build());

        imgTagList.add(ProjectImgTag.builder().assetUrl(INDIAN_STUDY_ASSET_URL).altName(INDIAN_STUDY)
                .projectName(INDIAN_STUDY).onGithubClickAction(INDIAN_GITHUB_URL)
                .onLiveDemoClickAction(INDIAN_LIVE_DEMO_URL).build());

        return imgTagList;
    }


    private static List<CertificateImgTag> getCertificateImgTagAttributes() {
        List<CertificateImgTag> imgTagList = new ArrayList<>();
        imgTagList.add(CertificateImgTag.builder().assetUrl(ANDROID_CERT_ASSET_URL).altName(ANDROID_CERT).projectName(ANDROID_CERT)
                .onCredentialClickAction(ANDROID_CERT_URL)
                .build());
        imgTagList.add(CertificateImgTag.builder().assetUrl(FLUTTER_CERT_ASSET_URL).altName(FLUTTER_CERT).projectName(FLUTTER_CERT)
                .onCredentialClickAction(FLUTTER_CERT_URL)
                .build());
        imgTagList.add(CertificateImgTag.builder().assetUrl(DIGITAL_CERT_ASSET_URL).altName(DIGITAL_CERT)
                .projectName(DIGITAL_CERT).onCredentialClickAction(DIGITAL_CERT_URL)
                .build());
        imgTagList.add(CertificateImgTag.builder().assetUrl(AI_CERT_ASSET_URL).altName(AI_CERT)
                .projectName(AI_CERT).onCredentialClickAction(AI_CERT_URL)
                .build());
        return imgTagList;
    }


    private static ArrowImgTag getArrowImgTagAttributes() {
        return ArrowImgTag.builder().assetUrl(ARROW_ASSET_URL).altName("Arrow icon").build();
    }

    private static List<WorkExperienceImgTag> getExperienceImgTagAttributes() {
        List<WorkExperienceImgTag> imgTagList = new ArrayList<>();
        imgTagList.add(WorkExperienceImgTag.builder().assetUrl(TCS_LOGO_URL).altName("Tata Consultancy Services (TCS)")
                .company(TCS.getValue()).designation(JAVA_DEVELOPER.getValue()).details(JAVA_DEVELOPER_DETAILS.getValue()).draggable(false).build());

        imgTagList.add(WorkExperienceImgTag.builder().assetUrl(TALENTITAN_LOGO_URL).altName("Talen Titan Pvt Ltd")
                .company(TALEN_TITAN.getValue()).designation(ANDROID_DEVELOPER_INTERN.getValue()).details(ANDROID_DEVELOPER_INTERN_DETAILS.getValue()).draggable(false).build());
        return imgTagList;
    }

    private static List<TechExperience> getAndroidDevelopmentExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(AndroidTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

    private static List<TechExperience> getJavaDevelopmentExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(JavaTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

    private static List<TechExperience> getToolsAndApplicationsExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(ToolsAndApplications.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

    private static List<TechExperience> getDatabaseExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(DatabaseTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

    private static List<TechExperience> getOtherTechExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(OthersTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

}
