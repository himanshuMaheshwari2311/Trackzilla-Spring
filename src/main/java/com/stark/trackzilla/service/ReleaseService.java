package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Release;

public interface ReleaseService {
    Iterable<Release> listReleases();
}
