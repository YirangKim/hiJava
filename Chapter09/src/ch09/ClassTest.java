package ch09;


//p.357

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	
	
	public static void main(String[] args ) throws
	
		ClassNotFoundException{ //throws키워드는 메소드에서 잠재적으로 어떤 Excepti가 잇는지 명시하는 키워드
			
			Class userClass = Class.forName("ch09.User");
			
			System.out.println("====Field List====");
			for ( Field field : userClass.getFields()) {
				System.out.println(field.getName());
			} 
		
		
		System.out.println("\n ====Constructor List=====");
		for (Constructor constructor : userClass.getConstructors()) {
			
			System.out.println("개수" + constructor.getParameterCount() +"= ");
			
			for( Class parameter : constructor.getParameterTypes()) {
				System.out.println(parameter.getName() + " / ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("\n ==== Method List ====");
		for ( Method method : userClass.getMethods()) {
			System.out.println(method.getName());
		}
		
		}
		
	}

