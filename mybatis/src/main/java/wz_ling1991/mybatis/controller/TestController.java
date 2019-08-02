package wz_ling1991.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wz_ling1991.mybatis.domain.po.SysUserPo;
import wz_ling1991.mybatis.mapper.SysUserMapper;

import java.util.List;

/**
 * @author: ElySioN
 * @create: 2019-08-02 15:58
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @GetMapping("/mybatis")
    public List<SysUserPo> test(){
        List<SysUserPo> rs = sysUserMapper.selectAll();
        return rs;
    }
}