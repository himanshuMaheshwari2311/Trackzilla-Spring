package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Release;
import com.stark.trackzilla.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    private ReleaseRepository releaseRepository;

    @Autowired
    public ReleaseServiceImpl(ReleaseRepository releaseRepository) {
        this.releaseRepository = releaseRepository;
    }

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }
}
