package com.eulbyvan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
}
