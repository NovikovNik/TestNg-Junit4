import org.testng.Assert;
import org.testng.annotations.BeforeTest;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test

    public void ifZeroAmount(){
        org.junit.Assert.assertEquals(service.remain(0),1000);
    }

    @org.junit.Test

    public void ifThousandAmount(){
        org.junit.Assert.assertEquals(service.remain(1000),0);
    }

    @org.junit.Test

    public void ifMoreThanThousandAmount(){
        org.junit.Assert.assertEquals(service.remain(1500),500);
    }

    @org.junit.Test
    public void ifMinusValueAmount(){
        org.junit.Assert.assertEquals(service.remain(-1000),1000);
    }

}