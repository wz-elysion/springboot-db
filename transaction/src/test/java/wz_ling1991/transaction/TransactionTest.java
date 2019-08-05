package wz_ling1991.transaction;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wz_ling1991.transaction.domain.po.DemoPo;
import wz_ling1991.transaction.mapper.DemoMapper;

import java.util.List;

/**
 * @author: ElySioN
 * @create: 2019-08-05 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransactionApplication.class)
@Slf4j
public class TransactionTest {

    @Autowired
    private DemoMapper demoMapper;

    @Test
    public void test1(){
        List<DemoPo> rs = demoMapper.selectAll();
        System.out.println("----");
    }

}