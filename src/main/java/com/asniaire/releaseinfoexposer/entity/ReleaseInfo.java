package com.asniaire.releaseinfoexposer.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReleaseInfo {

    private String url;

    private String commitId;

    private String commitUser;

    private String commitDate;

    private String buildVersion;

    private String buildUser;

    private String buildDate;

    private String buildHost;

}
