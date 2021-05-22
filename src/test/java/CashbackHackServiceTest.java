import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test

    public void ifZeroAmount(){
        org.junit.Assert.assertEquals(1000,service.remain(0));
    }

    @org.junit.Test

    public void ifThousandAmount(){
        org.junit.Assert.assertEquals(0,service.remain(1000));
    }

    @org.junit.Test

    public void ifMoreThanThousandAmount(){
        org.junit.Assert.assertEquals(500,service.remain(1500));
    }

    @org.junit.Test
    public void ifMinusValueAmount(){
        org.junit.Assert.assertEquals(1000,service.remain(-1000));
    }

    @Test

    public void ifZeroAmountJupiterApi(){
        assertEquals(1000,service.remain(0));
    }

    @Test

    public void ifThousandAmountJupiterApi(){
        assertEquals(0,service.remain(1000));
    }

    @Test

    public void ifMoreThanThousandAmountJupiterApi(){
        assertEquals(500,service.remain(1500));
    }

    @Test
    public void ifMinusValueAmountJupiterApi(){
        assertEquals(1000,service.remain(-1000));
    }

}