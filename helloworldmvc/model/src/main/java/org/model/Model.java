package org.model;

import org.contract.IModel;

public class Model implements IModel {
	private String helloWorld = "Hello World";

	public String getHelloWorld() {
		return this.helloWorld ;
	}
}
