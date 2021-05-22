import org.testng.Assert;
import org.testng.annotations.BeforeTest;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test

    public void ifZeroAmount(){
        Assert.assertEquals(service.remain(0),1000);
    }

    @org.testng.annotations.Test

    public void ifThousandAmount(){
        Assert.assertEquals(service.remain(1000),0);
    }

    @org.testng.annotations.Test

    public void ifMoreThanThousandAmount(){
        Assert.assertEquals(service.remain(1500),500);
    }

    @org.testng.annotations.Test
    public void ifMinusValueAmount(){
        Assert.assertEquals(service.remain(-1000),1000);
    }

}