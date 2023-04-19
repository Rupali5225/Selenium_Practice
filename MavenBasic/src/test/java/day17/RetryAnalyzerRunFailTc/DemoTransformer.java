package day17.RetryAnalyzerRunFailTc;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * we need to pass this class in xml files listner<> tag
 * */

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
public class DemoTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}
}
