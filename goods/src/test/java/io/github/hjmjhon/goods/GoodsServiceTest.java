package io.github.hjmjhon.goods;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;


@RunWith(PowerMockRunner.class)
@PrepareForTest(GoodsService.class)
public class GoodsServiceTest {

    //被测方法内部调用私有方法
    @Test
    public void testPrivateMethodInPublicMethod() throws Exception {
        GoodsService service = new GoodsService();
        GoodsService spy = PowerMockito.spy(service);
        //mock 被测方法调用的私有方法
//        PowerMockito.when(spy, "build", Mockito.anyString()).thenReturn("hhh");  //会真正执行被 mock 的私有方法
        PowerMockito.doReturn("hhh").when(spy, "build", Mockito.anyString());      //不会执行被 mock 的私有方法
        //被测方法调用
        String data = spy.detail("data");
        //确认被测方法中的私有方法是否被调用
        PowerMockito.verifyPrivate(spy).invoke("build","data");
        Assert.assertEquals("hhh", data);
    }
}
