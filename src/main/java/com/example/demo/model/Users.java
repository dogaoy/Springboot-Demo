package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/02/21
 */
@Data
public class Users implements Serializable {
    private Long id;

    private String email;

    private String encryptedPassword;

    private String resetPasswordToken;

    private Date resetPasswordSentAt;

    private Date rememberCreatedAt;

    private Integer signInCount;

    private Date currentSignInAt;

    private Date lastSignInAt;

    private String currentSignInIp;

    private String lastSignInIp;

    private Date createdAt;

    private Date updatedAt;

    private String name;

    private String title;

    private String code;

    private String phone;

    private String description;

    private Integer teamId;

    private Boolean isAdmin;

    private Boolean passwordResetting;

    private String avatarAttachment;

    private String itcode;

    private String entryTime;

    private String areaName;

    private String status;

    private String worktype;

    private String costCenter;

    private String level;

    private Integer cost;

    private String resumeAttachment;

    private String idcardAttachment;

    private String degree;

    private String degreeAttachment;

    private String academicAttachment;

    private Boolean isUpdateattachment;

    private Integer extraCost;

    private Boolean isFeedneeded;

    private Boolean isEnabled;

    private String company;

    private static final long serialVersionUID = 1L;

    public Users() {
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Users)) return false;
        final Users other = (Users) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$encryptedPassword = this.getEncryptedPassword();
        final Object other$encryptedPassword = other.getEncryptedPassword();
        if (this$encryptedPassword == null ? other$encryptedPassword != null : !this$encryptedPassword.equals(other$encryptedPassword))
            return false;
        final Object this$resetPasswordToken = this.getResetPasswordToken();
        final Object other$resetPasswordToken = other.getResetPasswordToken();
        if (this$resetPasswordToken == null ? other$resetPasswordToken != null : !this$resetPasswordToken.equals(other$resetPasswordToken))
            return false;
        final Object this$resetPasswordSentAt = this.getResetPasswordSentAt();
        final Object other$resetPasswordSentAt = other.getResetPasswordSentAt();
        if (this$resetPasswordSentAt == null ? other$resetPasswordSentAt != null : !this$resetPasswordSentAt.equals(other$resetPasswordSentAt))
            return false;
        final Object this$rememberCreatedAt = this.getRememberCreatedAt();
        final Object other$rememberCreatedAt = other.getRememberCreatedAt();
        if (this$rememberCreatedAt == null ? other$rememberCreatedAt != null : !this$rememberCreatedAt.equals(other$rememberCreatedAt))
            return false;
        final Object this$signInCount = this.getSignInCount();
        final Object other$signInCount = other.getSignInCount();
        if (this$signInCount == null ? other$signInCount != null : !this$signInCount.equals(other$signInCount))
            return false;
        final Object this$currentSignInAt = this.getCurrentSignInAt();
        final Object other$currentSignInAt = other.getCurrentSignInAt();
        if (this$currentSignInAt == null ? other$currentSignInAt != null : !this$currentSignInAt.equals(other$currentSignInAt))
            return false;
        final Object this$lastSignInAt = this.getLastSignInAt();
        final Object other$lastSignInAt = other.getLastSignInAt();
        if (this$lastSignInAt == null ? other$lastSignInAt != null : !this$lastSignInAt.equals(other$lastSignInAt))
            return false;
        final Object this$currentSignInIp = this.getCurrentSignInIp();
        final Object other$currentSignInIp = other.getCurrentSignInIp();
        if (this$currentSignInIp == null ? other$currentSignInIp != null : !this$currentSignInIp.equals(other$currentSignInIp))
            return false;
        final Object this$lastSignInIp = this.getLastSignInIp();
        final Object other$lastSignInIp = other.getLastSignInIp();
        if (this$lastSignInIp == null ? other$lastSignInIp != null : !this$lastSignInIp.equals(other$lastSignInIp))
            return false;
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        if (this$createdAt == null ? other$createdAt != null : !this$createdAt.equals(other$createdAt)) return false;
        final Object this$updatedAt = this.getUpdatedAt();
        final Object other$updatedAt = other.getUpdatedAt();
        if (this$updatedAt == null ? other$updatedAt != null : !this$updatedAt.equals(other$updatedAt)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$isAdmin = this.getIsAdmin();
        final Object other$isAdmin = other.getIsAdmin();
        if (this$isAdmin == null ? other$isAdmin != null : !this$isAdmin.equals(other$isAdmin)) return false;
        final Object this$passwordResetting = this.getPasswordResetting();
        final Object other$passwordResetting = other.getPasswordResetting();
        if (this$passwordResetting == null ? other$passwordResetting != null : !this$passwordResetting.equals(other$passwordResetting))
            return false;
        final Object this$avatarAttachment = this.getAvatarAttachment();
        final Object other$avatarAttachment = other.getAvatarAttachment();
        if (this$avatarAttachment == null ? other$avatarAttachment != null : !this$avatarAttachment.equals(other$avatarAttachment))
            return false;
        final Object this$itcode = this.getItcode();
        final Object other$itcode = other.getItcode();
        if (this$itcode == null ? other$itcode != null : !this$itcode.equals(other$itcode)) return false;
        final Object this$entryTime = this.getEntryTime();
        final Object other$entryTime = other.getEntryTime();
        if (this$entryTime == null ? other$entryTime != null : !this$entryTime.equals(other$entryTime)) return false;
        final Object this$areaName = this.getAreaName();
        final Object other$areaName = other.getAreaName();
        if (this$areaName == null ? other$areaName != null : !this$areaName.equals(other$areaName)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$worktype = this.getWorktype();
        final Object other$worktype = other.getWorktype();
        if (this$worktype == null ? other$worktype != null : !this$worktype.equals(other$worktype)) return false;
        final Object this$costCenter = this.getCostCenter();
        final Object other$costCenter = other.getCostCenter();
        if (this$costCenter == null ? other$costCenter != null : !this$costCenter.equals(other$costCenter))
            return false;
        final Object this$level = this.getLevel();
        final Object other$level = other.getLevel();
        if (this$level == null ? other$level != null : !this$level.equals(other$level)) return false;
        final Object this$cost = this.getCost();
        final Object other$cost = other.getCost();
        if (this$cost == null ? other$cost != null : !this$cost.equals(other$cost)) return false;
        final Object this$resumeAttachment = this.getResumeAttachment();
        final Object other$resumeAttachment = other.getResumeAttachment();
        if (this$resumeAttachment == null ? other$resumeAttachment != null : !this$resumeAttachment.equals(other$resumeAttachment))
            return false;
        final Object this$idcardAttachment = this.getIdcardAttachment();
        final Object other$idcardAttachment = other.getIdcardAttachment();
        if (this$idcardAttachment == null ? other$idcardAttachment != null : !this$idcardAttachment.equals(other$idcardAttachment))
            return false;
        final Object this$degree = this.getDegree();
        final Object other$degree = other.getDegree();
        if (this$degree == null ? other$degree != null : !this$degree.equals(other$degree)) return false;
        final Object this$degreeAttachment = this.getDegreeAttachment();
        final Object other$degreeAttachment = other.getDegreeAttachment();
        if (this$degreeAttachment == null ? other$degreeAttachment != null : !this$degreeAttachment.equals(other$degreeAttachment))
            return false;
        final Object this$academicAttachment = this.getAcademicAttachment();
        final Object other$academicAttachment = other.getAcademicAttachment();
        if (this$academicAttachment == null ? other$academicAttachment != null : !this$academicAttachment.equals(other$academicAttachment))
            return false;
        final Object this$isUpdateattachment = this.getIsUpdateattachment();
        final Object other$isUpdateattachment = other.getIsUpdateattachment();
        if (this$isUpdateattachment == null ? other$isUpdateattachment != null : !this$isUpdateattachment.equals(other$isUpdateattachment))
            return false;
        final Object this$extraCost = this.getExtraCost();
        final Object other$extraCost = other.getExtraCost();
        if (this$extraCost == null ? other$extraCost != null : !this$extraCost.equals(other$extraCost)) return false;
        final Object this$isFeedneeded = this.getIsFeedneeded();
        final Object other$isFeedneeded = other.getIsFeedneeded();
        if (this$isFeedneeded == null ? other$isFeedneeded != null : !this$isFeedneeded.equals(other$isFeedneeded))
            return false;
        final Object this$isEnabled = this.getIsEnabled();
        final Object other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !this$isEnabled.equals(other$isEnabled)) return false;
        final Object this$company = this.getCompany();
        final Object other$company = other.getCompany();
        if (this$company == null ? other$company != null : !this$company.equals(other$company)) return false;
        return true;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Users;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $encryptedPassword = this.getEncryptedPassword();
        result = result * PRIME + ($encryptedPassword == null ? 43 : $encryptedPassword.hashCode());
        final Object $resetPasswordToken = this.getResetPasswordToken();
        result = result * PRIME + ($resetPasswordToken == null ? 43 : $resetPasswordToken.hashCode());
        final Object $resetPasswordSentAt = this.getResetPasswordSentAt();
        result = result * PRIME + ($resetPasswordSentAt == null ? 43 : $resetPasswordSentAt.hashCode());
        final Object $rememberCreatedAt = this.getRememberCreatedAt();
        result = result * PRIME + ($rememberCreatedAt == null ? 43 : $rememberCreatedAt.hashCode());
        final Object $signInCount = this.getSignInCount();
        result = result * PRIME + ($signInCount == null ? 43 : $signInCount.hashCode());
        final Object $currentSignInAt = this.getCurrentSignInAt();
        result = result * PRIME + ($currentSignInAt == null ? 43 : $currentSignInAt.hashCode());
        final Object $lastSignInAt = this.getLastSignInAt();
        result = result * PRIME + ($lastSignInAt == null ? 43 : $lastSignInAt.hashCode());
        final Object $currentSignInIp = this.getCurrentSignInIp();
        result = result * PRIME + ($currentSignInIp == null ? 43 : $currentSignInIp.hashCode());
        final Object $lastSignInIp = this.getLastSignInIp();
        result = result * PRIME + ($lastSignInIp == null ? 43 : $lastSignInIp.hashCode());
        final Object $createdAt = this.getCreatedAt();
        result = result * PRIME + ($createdAt == null ? 43 : $createdAt.hashCode());
        final Object $updatedAt = this.getUpdatedAt();
        result = result * PRIME + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $isAdmin = this.getIsAdmin();
        result = result * PRIME + ($isAdmin == null ? 43 : $isAdmin.hashCode());
        final Object $passwordResetting = this.getPasswordResetting();
        result = result * PRIME + ($passwordResetting == null ? 43 : $passwordResetting.hashCode());
        final Object $avatarAttachment = this.getAvatarAttachment();
        result = result * PRIME + ($avatarAttachment == null ? 43 : $avatarAttachment.hashCode());
        final Object $itcode = this.getItcode();
        result = result * PRIME + ($itcode == null ? 43 : $itcode.hashCode());
        final Object $entryTime = this.getEntryTime();
        result = result * PRIME + ($entryTime == null ? 43 : $entryTime.hashCode());
        final Object $areaName = this.getAreaName();
        result = result * PRIME + ($areaName == null ? 43 : $areaName.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $worktype = this.getWorktype();
        result = result * PRIME + ($worktype == null ? 43 : $worktype.hashCode());
        final Object $costCenter = this.getCostCenter();
        result = result * PRIME + ($costCenter == null ? 43 : $costCenter.hashCode());
        final Object $level = this.getLevel();
        result = result * PRIME + ($level == null ? 43 : $level.hashCode());
        final Object $cost = this.getCost();
        result = result * PRIME + ($cost == null ? 43 : $cost.hashCode());
        final Object $resumeAttachment = this.getResumeAttachment();
        result = result * PRIME + ($resumeAttachment == null ? 43 : $resumeAttachment.hashCode());
        final Object $idcardAttachment = this.getIdcardAttachment();
        result = result * PRIME + ($idcardAttachment == null ? 43 : $idcardAttachment.hashCode());
        final Object $degree = this.getDegree();
        result = result * PRIME + ($degree == null ? 43 : $degree.hashCode());
        final Object $degreeAttachment = this.getDegreeAttachment();
        result = result * PRIME + ($degreeAttachment == null ? 43 : $degreeAttachment.hashCode());
        final Object $academicAttachment = this.getAcademicAttachment();
        result = result * PRIME + ($academicAttachment == null ? 43 : $academicAttachment.hashCode());
        final Object $isUpdateattachment = this.getIsUpdateattachment();
        result = result * PRIME + ($isUpdateattachment == null ? 43 : $isUpdateattachment.hashCode());
        final Object $extraCost = this.getExtraCost();
        result = result * PRIME + ($extraCost == null ? 43 : $extraCost.hashCode());
        final Object $isFeedneeded = this.getIsFeedneeded();
        result = result * PRIME + ($isFeedneeded == null ? 43 : $isFeedneeded.hashCode());
        final Object $isEnabled = this.getIsEnabled();
        result = result * PRIME + ($isEnabled == null ? 43 : $isEnabled.hashCode());
        final Object $company = this.getCompany();
        result = result * PRIME + ($company == null ? 43 : $company.hashCode());
        return result;
    }

    public String toString() {
        return "Users(id=" + this.getId() + ", email=" + this.getEmail() + ", encryptedPassword=" + this.getEncryptedPassword() + ", resetPasswordToken=" + this.getResetPasswordToken() + ", resetPasswordSentAt=" + this.getResetPasswordSentAt() + ", rememberCreatedAt=" + this.getRememberCreatedAt() + ", signInCount=" + this.getSignInCount() + ", currentSignInAt=" + this.getCurrentSignInAt() + ", lastSignInAt=" + this.getLastSignInAt() + ", currentSignInIp=" + this.getCurrentSignInIp() + ", lastSignInIp=" + this.getLastSignInIp() + ", createdAt=" + this.getCreatedAt() + ", updatedAt=" + this.getUpdatedAt() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", code=" + this.getCode() + ", phone=" + this.getPhone() + ", description=" + this.getDescription() + ", teamId=" + this.getTeamId() + ", isAdmin=" + this.getIsAdmin() + ", passwordResetting=" + this.getPasswordResetting() + ", avatarAttachment=" + this.getAvatarAttachment() + ", itcode=" + this.getItcode() + ", entryTime=" + this.getEntryTime() + ", areaName=" + this.getAreaName() + ", status=" + this.getStatus() + ", worktype=" + this.getWorktype() + ", costCenter=" + this.getCostCenter() + ", level=" + this.getLevel() + ", cost=" + this.getCost() + ", resumeAttachment=" + this.getResumeAttachment() + ", idcardAttachment=" + this.getIdcardAttachment() + ", degree=" + this.getDegree() + ", degreeAttachment=" + this.getDegreeAttachment() + ", academicAttachment=" + this.getAcademicAttachment() + ", isUpdateattachment=" + this.getIsUpdateattachment() + ", extraCost=" + this.getExtraCost() + ", isFeedneeded=" + this.getIsFeedneeded() + ", isEnabled=" + this.getIsEnabled() + ", company=" + this.getCompany() + ")";
    }
}