package com.stark.trackzilla.service;

import com.stark.trackzilla.entity.Release;
import com.stark.trackzilla.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    private ReleaseRepository releaseRepository;

    @Autowired
    public ReleaseServiceImpl(ReleaseRepository releaseRepository) {
        this.releaseRepository = releaseRepository;
    }

    @Override
    public List<Release> listReleases() {
        return  (List<Release>) releaseRepository.findAll();
    }
}
