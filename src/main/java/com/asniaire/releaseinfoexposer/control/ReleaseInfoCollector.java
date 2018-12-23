package com.asniaire.releaseinfoexposer.control;

import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Getter
public class ReleaseInfoCollector {

    private static final String GIT_URL = "git.remote.origin.url";
    private static final String GIT_COMMIT_ID = "git.commit.id";
    private static final String GIT_COMMIT_USER = "git.commit.user.name";
    private static final String GIT_COMMIT_DATE = "git.commit.time";
    private static final String GIT_BUILD_VERSION = "git.build.version";
    private static final String GIT_BUILD_USER = "git.build.user.name";
    private static final String GIT_BUILD_DATE = "git.build.time";
    private static final String GIT_BUILD_HOST = "git.build.host";

    @Inject
    @ReleaseProperty(value = GIT_URL)
    private String url;

    @Inject
    @ReleaseProperty(value = GIT_COMMIT_ID)
    private String commitId;

    @Inject
    @ReleaseProperty(value = GIT_COMMIT_USER)
    private String commitUser;

    @Inject
    @ReleaseProperty(value = GIT_COMMIT_DATE)
    private String commitDate;

    @Inject
    @ReleaseProperty(value = GIT_BUILD_VERSION)
    private String buildVersion;

    @Inject
    @ReleaseProperty(value = GIT_BUILD_USER)
    private String buildUser;

    @Inject
    @ReleaseProperty(value = GIT_BUILD_DATE)
    private String buildDate;

    @Inject
    @ReleaseProperty(value = GIT_BUILD_HOST)
    private String buildHost;

}
