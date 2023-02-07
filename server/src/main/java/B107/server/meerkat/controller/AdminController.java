package B107.server.meerkat.controller;

import B107.server.meerkat.config.security.handler.DecodeEncodeHandler;
import B107.server.meerkat.config.utils.ResponseDTO;
import B107.server.meerkat.entity.Member;
import B107.server.meerkat.repository.MemberRepository;
import B107.server.meerkat.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@PreAuthorize("")
@RequiredArgsConstructor
@Slf4j
public class AdminController {

    private static final String METHOD_NAME = MemberController.class.getName();

    private final AdminService adminService;

    private final MemberRepository memberRepository;
    private final DecodeEncodeHandler decodeEncodeHandler;

}
