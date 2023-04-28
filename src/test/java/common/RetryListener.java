package common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import com.sun.net.httpserver.Authenticator.Retry;

import UI.retry;

public class RetryListener implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		annotation.setRetryAnalyzer((Class<? extends IRetryAnalyzer>) retry.class);
	}

	

}
