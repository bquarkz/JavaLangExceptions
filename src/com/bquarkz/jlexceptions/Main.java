/**
 * Copyleft (C) 2016  Constantino, Nilton Rogerio <niltonrc@gmail.com>
 *
 * @author "Nilton R Constantino"
 * aKa bQUARKz <niltonrc@gmail, bquarkz@gmail.com>
 *
 * Everything about the respective software copyright can be found in the
 * "LICENSE" file included in the project source tree.
 *
 * The code was written based on study principles and can be enjoyed for
 * all comunity without problems.
 */
package com.bquarkz.jlexceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Class< ? >[] classes = new Class< ? >[] {
			Exception.class, //This is the class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
			RuntimeException.class, //This is RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
			ArithmeticException.class, //This is Thrown when an exceptional arithmetic condition has occurred.
			ArrayIndexOutOfBoundsException.class, //This is Thrown to indicate that an array has been accessed with an illegal index.
			ArrayStoreException.class, //This is Thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects.
			ClassCastException.class, //This is Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
			ClassNotFoundException.class, //This is Thrown when an application tries to load in a class through its string name using: The forName method in class Class.
			CloneNotSupportedException.class, //This is Thrown to indicate that the clone method in class Object has been called to clone an object, but that the object's class does not implement the Cloneable interface.
			EnumConstantNotPresentException.class, //This is Thrown when an application tries to access an enum constant by name and the enum type contains no constant with the specified name.
			IllegalAccessException.class, //This is an IllegalAccessException is thrown when an application tries to reflectively create an instance (other than an array), set or get a field, or invoke a method, but the currently executing method does not have access to the definition of the specified class, field, method or constructor.
			IllegalArgumentException.class, //This is Thrown to indicate that a method has been passed an illegal or inappropriate argument.
			IllegalMonitorStateException.class, //This is Thrown to indicate that a thread has attempted to wait on an object's monitor or to notify other threads waiting on an object's monitor without owning the specified monitor.
			IllegalStateException.class, //The Signals that a method has been invoked at an illegal or inappropriate time.
			IllegalThreadStateException.class, //This is Thrown to indicate that a thread is not in an appropriate state for the requested operation.
			IndexOutOfBoundsException.class, //This is Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
			InstantiationException.class, //This is Thrown when an application tries to create an instance of a class using the newInstance method in class Class, but the specified class object cannot be instantiated.
			InterruptedException.class, //This is Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity.
			NegativeArraySizeException.class, //This is Thrown if an application tries to create an array with negative size.
			NoSuchFieldException.class, //The Signals that the class doesn't have a field of a specified name.
			NoSuchMethodException.class, //This is Thrown when a particular method cannot be found.
			NullPointerException.class, //This is Thrown when an application attempts to use null in a case where an object is required.
			NumberFormatException.class, //This is Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
			SecurityException.class, //This is Thrown by the security manager to indicate a security violation.
			StringIndexOutOfBoundsException.class, //This is Thrown by String methods to indicate that an index is either negative or greater than the size of the string.
			TypeNotPresentException.class, //This is Thrown when an application tries to access a type using a string representing the type's name, but no definition for the type with the specified name can be found.
			UnsupportedOperationException.class //This is Thrown to indicate that the requested operation is not supported.
		};
		
		FileWriter fWriter = new FileWriter( "README.md" );
		BufferedWriter bWriter = new BufferedWriter( fWriter );
		
		bWriter.write( "# Java Lang Exceptions and its inheritance#\n" );
		bWriter.write( "\n" );
		for( Class< ? > c : classes ) {
			InheritanceHelper helper = new InheritanceHelper( c );
			bWriter.write( helper + "\n\n" );
		}
		
		bWriter.close();
		fWriter.close();
	}
	
}

