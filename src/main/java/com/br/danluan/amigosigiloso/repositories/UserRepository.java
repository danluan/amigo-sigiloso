package com.br.danluan.amigosigiloso.repositories;


import com.br.danluan.amigosigiloso.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
