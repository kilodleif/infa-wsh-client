package com.informatica.wsh;

public class InfaAuthInfo {

    private String repoName;

    private String serviceName;

    private String username;

    private String password;

    public InfaAuthInfo(String repoName, String serviceName, String username, String password) {
        this.repoName = repoName;
        this.serviceName = serviceName;
        this.username = username;
        this.password = password;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
