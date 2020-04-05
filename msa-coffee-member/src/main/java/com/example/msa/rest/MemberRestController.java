package com.example.msa.rest;

import com.example.msa.rest.dto.MemberResponseDto;
import com.example.msa.rest.dto.MemberSaveRequestDto;
import com.example.msa.service.MemberService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberRestController {

    private final MemberService memberService;

    @HystrixCommand
    @ApiOperation(value = "save member") //Api 의 메타데이터
    @PostMapping("/api/v1/members")
    public Long save(@RequestBody MemberSaveRequestDto requestDto) {
        return memberService.save(requestDto);
    }

    @HystrixCommand
    @ApiOperation(value = "find all member")
    @GetMapping("/api/v1/members")
    public List<MemberResponseDto> findAll() {
        return memberService.findAll();
    }

    @HystrixCommand
    @ApiOperation(value = "find member by id")
    @GetMapping("/api/v1/members/{id}")
    public MemberResponseDto findById(@PathVariable Long id) {
        return memberService.findById(id);
    }

    @HystrixCommand
    @ApiOperation(value = "find member by param")
    @GetMapping("/api/v1/members/find")
    public MemberResponseDto findByParam(@RequestParam String name) {
        return memberService.findByParam(name);
    }
}
