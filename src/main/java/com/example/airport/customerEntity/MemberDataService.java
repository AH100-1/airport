package com.example.airport.customerEntity;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberDataService {
    @Autowired
    private final MemberDataRepository memberDataRepository;

    //회원 정보 저장
    public void saveUsersData(MemberData memberData){
        memberDataRepository.save(memberData);
    }

    //회원 정보 조회
    public List<MemberData> memberDataList() {
        List<MemberData> memberList = memberDataRepository.findAll();
        return memberList;
    }
}