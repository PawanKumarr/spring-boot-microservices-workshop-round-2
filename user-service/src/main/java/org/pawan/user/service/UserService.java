package org.pawan.user.service;

import org.pawan.user.entity.User;
import org.pawan.user.repository.UserRepository;
import org.pawan.user.vo.Department;
import org.pawan.user.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplate getUser(Long userId) {
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://localhost:9001/department/" + user.getDepartmentId(), Department.class);
        return new ResponseTemplate(user, department);
    }
}
