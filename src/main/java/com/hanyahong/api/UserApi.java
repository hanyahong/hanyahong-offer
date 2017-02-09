/*    */
package com.hanyahong.api;

import com.hanyahong.model.StatusInfo;
import com.hanyahong.model.user.vo.LoginVO;
import com.hanyahong.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/user"}, produces = {"application/json"})
@Api(value = "/user", description = "开放平台API组")
public class UserApi {


    @Autowired
    UserService service;

//    /**
//     * 用户登录
//     *
//     * @param loginVO
//     * @return
//     */
//    @ApiOperation(value = "用户登录", notes = "用户登录", response = StatusInfo.class)
//
//    @RequestMapping(value = {"/login"}, method = {RequestMethod.POST})
//    public ResponseEntity<StatusInfo> userLoginPost(@RequestBody LoginVO loginVO) throws ChangeSetPersister.NotFoundException {
//
//        StatusInfo info = this.service.userLoginService(loginVO);
//        return new ResponseEntity(info, HttpStatus.OK);
//    }

    /**
     * 用户登陆
     *
     * @param
     * @return
     * @throws ChangeSetPersister.NotFoundException
     */
    @ApiOperation(value = "用户登录", notes = "用户登录", response = StatusInfo.class)
    @ApiResponses({
            @io.swagger.annotations.ApiResponse(code = 200, message = "获取成功", response = StatusInfo.class),
            @io.swagger.annotations.ApiResponse(code = 500, message = "服务器响应失败", response = StatusInfo.class)})
    @RequestMapping(value = {"/login"}, produces = {"application/json"},
            method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    public ResponseEntity<StatusInfo> userLoginPost(@RequestBody LoginVO loginVO) throws ChangeSetPersister.NotFoundException {

        StatusInfo info = this.service.userLoginService(loginVO);
        return new ResponseEntity(info, HttpStatus.OK);
    }

}

