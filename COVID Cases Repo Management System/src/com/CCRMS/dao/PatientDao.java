package com.CCRMS.dao;

import java.util.List;

import com.CCRMS.model.Patient;

public interface PatientDao {
	
public List<Patient> getAllBillInfo();
	
	public boolean insertBill(Patient bill);
	public boolean deleteBill(Long id);
	public Patient getBillById(Long id);
	public List<Patient> getAllBilles();
	public Long updateBill(Patient bill);
	
		
}
