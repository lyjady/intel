package org.augustus.intel.controller;

import org.augustus.intel.modal.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/6/11 14:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody(required = false) User user) {
        return "success";
    }
}
