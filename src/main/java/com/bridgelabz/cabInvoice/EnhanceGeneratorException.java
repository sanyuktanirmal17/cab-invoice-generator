/**
 * Purpose : To Throw  custom Exception for Enhance Invoice 
 * @author : Sanyukta & Hrishikesh
 * @since : 1/7/2021
 * @Version : 1.0 
 */

package com.bridgelabz.cabInvoice;

public class EnhanceGeneratorException extends Exception {

	public enum exception {

		SERVICE_NULL_EXCEPTION
	}

	public exception Type;

	public EnhanceGeneratorException(exception Type) {
		this.Type = Type;

	}

}
