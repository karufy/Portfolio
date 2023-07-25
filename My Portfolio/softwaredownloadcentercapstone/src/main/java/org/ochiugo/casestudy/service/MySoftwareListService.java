package org.ochiugo.casestudy.service;

import org.ochiugo.casestudy.daorepository.MySoftwareRepository;
import org.ochiugo.casestudy.modelentity.MySoftwareList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySoftwareListService {

    @Autowired
    private MySoftwareRepository mysoftware;

    public void saveMySoftwares(MySoftwareList software) {
    	mysoftware.save(software);}

    public List<MySoftwareList> getAllMySoftwares(){
        return mysoftware.findAll();
    }

    public void deleteById(int id) {
        mysoftware.deleteById(id);
    }
}

