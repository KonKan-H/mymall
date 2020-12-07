package com.zzh.malladmin;

import com.zzh.mallsecurity.util.JwtTokenUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallAdminApplicationTests {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Test
    void contextLoads() {
        System.out.println();
    }

}
