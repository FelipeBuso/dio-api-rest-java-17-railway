package edu.dio.api.rest.railway.service;

import edu.dio.api.rest.railway.domian.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
