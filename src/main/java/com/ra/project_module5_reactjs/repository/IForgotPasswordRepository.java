package com.ra.project_module5_reactjs.repository;

import com.ra.project_module5_reactjs.model.entity.ForgotPassword;
import com.ra.project_module5_reactjs.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IForgotPasswordRepository extends JpaRepository<ForgotPassword,Integer> {
    void deleteByUser(User user);
    @Query("select fp from ForgotPassword fp where fp.otp = ?1 and fp.user = ?2")
    Optional<ForgotPassword> findByOtpAndUser(Integer otp, User user);
}
