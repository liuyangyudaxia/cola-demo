package com.example.colademo.command;

import com.alibaba.cola.dto.Response;
import com.example.colademo.convertor.UserProfileConvertor;
import com.example.colademo.domain.user.UserProfile;
import com.example.colademo.dto.UserProfileUpdateCmd;
import com.example.colademo.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}