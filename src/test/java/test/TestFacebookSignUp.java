package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.baseTest;
import pom.POMfacebookSignUp;

public class TestFacebookSignUp extends baseTest

{
 @Test
 public void signUp() throws IOException
 {
	 POMfacebookSignUp f= new POMfacebookSignUp(driver);
	 
	 f.signUp();
 }
}
