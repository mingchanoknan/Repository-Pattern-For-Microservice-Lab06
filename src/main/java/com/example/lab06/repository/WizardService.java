package com.example.lab06.repository;

import com.example.lab06.pojo.Wizard;
import com.example.lab06.pojo.Wizards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WizardService {

    @Autowired
    private WizardRepository repository;

    public WizardService(WizardRepository repository) {
        this.repository = repository;
    }

    public Wizards getAll() {
        return new Wizards((ArrayList<Wizard>) repository.findAll());
    }

    public boolean insertWizard(Wizard wizard) {
        try {
            repository.insert(wizard);
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }

    public boolean updateWizard(Wizard wizard) {
        try {
            repository.save(wizard);
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }

    public boolean deleteWizard(Wizard wizard) {
        try {
            repository.delete(wizard);
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
