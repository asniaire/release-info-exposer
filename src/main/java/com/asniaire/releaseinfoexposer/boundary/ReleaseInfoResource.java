package com.asniaire.releaseinfoexposer.boundary;

import com.asniaire.releaseinfoexposer.entity.ReleaseInfo;
import com.asniaire.releaseinfoexposer.control.ReleaseInfoCollector;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("release-info")
@Produces(MediaType.APPLICATION_JSON)
public class ReleaseInfoResource {

    @Inject
    ReleaseInfoCollector releaseInfoCollector;

    @GET
    public ReleaseInfo getReleaseInfoCollector() {
        final ReleaseInfo releaseInfo = ReleaseInfo.builder()
                .url(releaseInfoCollector.getUrl())
                .commitId(releaseInfoCollector.getCommitId())
                .commitUser(releaseInfoCollector.getCommitUser())
                .commitDate(releaseInfoCollector.getCommitDate())
                .buildVersion(releaseInfoCollector.getBuildVersion())
                .buildUser(releaseInfoCollector.getBuildUser())
                .buildDate(releaseInfoCollector.getBuildDate())
                .buildHost(releaseInfoCollector.getBuildHost())
                .build();
        return releaseInfo;
    }

}
