package com.eulbyvan.controller;

import com.eulbyvan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

@RestController
@RequestMapping("/users")
public class UserController {
    private User user = new User("stu", "pid");


}
