package pers.stevephan.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.stevephan.springboot.repository.ProjectTaskRepository;

@Service
public class ProjectTaskService {
    @Autowired
    private ProjectTaskRepository repository;
}
