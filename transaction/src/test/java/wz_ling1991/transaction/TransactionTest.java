package wz_ling1991.transaction;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wz_ling1991.transaction.service.TransactionDemoService;

/**
 * @author: ElySioN
 * @create: 2019-08-05 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransactionApplication.class)
@Slf4j
public class TransactionTest {

    @Autowired
    private TransactionDemoService demoService;

    @Test
    public void test1() {
        demoService.required();
        System.out.println("----------");
    }

}