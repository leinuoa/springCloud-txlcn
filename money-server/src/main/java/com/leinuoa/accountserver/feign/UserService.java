package com.leinuoa.accountserver.feign;

import com.leinuoa.accountserver.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("user-service")
public interface UserService {
    @RequestMapping("/user/add")
    String addUser(@RequestBody UserDto userDto);
}
