package io.symplesims.spring.aws.secretsmanager.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
@ConfigurationProperties("spring.cloud.aws.secrets-manager")
public final class AwsSecretsManagerProperties {

    private String region = "ap-northeast-2";
    private ProviderType providerType = ProviderType.DEFAULT;
    private String profile = "default";
    private List<String> packages;
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public ProviderType getProviderType() {
        return providerType;
    }
    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }
}
