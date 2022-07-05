package org.pawan.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.pawan.user.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
    private User user;
    private Department department;
}
