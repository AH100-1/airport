package com.example.airport.customerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDataRepository extends JpaRepository<MemberData, Long> {
    MemberData findById(String id);

}