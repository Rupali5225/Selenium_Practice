package day17.RetryAnalyzerRunFailTc;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestWithRetryAnalyzer {
	static int num=5;

	@Test(retryAnalyzer = day17.RetryAnalyzerRunFailTc.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test(retryAnalyzer = day17.RetryAnalyzerRunFailTc.RetryAnalyzer.class)
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(retryAnalyzer = day17.RetryAnalyzerRunFailTc.RetryAnalyzer.class)
	public void Test3()
	{
		num--;
		Assert.assertTrue(num<4);
	}
}
