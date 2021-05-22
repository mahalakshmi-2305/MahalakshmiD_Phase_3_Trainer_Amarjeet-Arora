package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	int supplierId;
	String supplierName;
	String supplierAddr;
	
	public Supplier() {
		
	}

	public Supplier(int supplierId, String supplierName, String supplierAddr) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddr = supplierAddr;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddr() {
		return supplierAddr;
	}

	public void setSupplierAddr(String supplierAddr) {
		this.supplierAddr = supplierAddr;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddr="
				+ supplierAddr + "]";
	}
	
	

}
