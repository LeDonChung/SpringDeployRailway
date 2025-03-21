package vn.edu.iuh.fit.jenkin.springdeployrailway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.jenkin.springdeployrailway.service.Calculator;

@SpringBootTest
public class CalTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        assert calculator.add(1, 2) == 3;
    }

    @Test
    public void testAdd2() {
        assert calculator.add(1, 2) == 2;
    }
}
