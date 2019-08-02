package wz_ling1991.mybatis;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: ElySioN
 * @create: 2019-08-02 15:57
 */
@SpringBootApplication
@MapperScan("wz_ling1991.mybatis.mapper")
public class MybatisApplication {

    public static void main(String[] args){
        SpringApplication.run(MybatisApplication.class,args);
    }

}