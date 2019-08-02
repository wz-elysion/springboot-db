package wz_ling1991.mybatis.domain.po;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: ElySioN
 * @create: 2019-08-02 17:00
 */
@Data
@Table(name = "`sys_user`")
public class SysUserPo {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`")
    private Long id;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;
}
