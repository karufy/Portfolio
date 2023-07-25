package org.ochiugo.casestudy.service;

import org.ochiugo.casestudy.daorepository.SoftwareRepository;
import org.ochiugo.casestudy.modelentity.Software;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareService {

    @Autowired
    private SoftwareRepository sRepo;

    public void save(Software s) {
        sRepo.save(s);
    }

    public List<Software> getAllSoftware(){
        return sRepo.findAll();
    }

    public Software getSoftwareById(int id) {
        return sRepo.findById(id).get();
    }
    public void deleteById(int id) {
        sRepo.deleteById(id);
    }
}
