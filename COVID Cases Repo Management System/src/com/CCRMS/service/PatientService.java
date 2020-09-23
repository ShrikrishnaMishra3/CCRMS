package com.CCRMS.service;

import java.util.List;

import com.CCRMS.model.Patient;

public interface PatientService {
	
	public List<Patient> getAllBillInfo();
	
	public boolean insertBill(Patient bill);
		
	public boolean deleteBill(Long id);

	public Patient getBillById(Long id);
	
	public Long updateBill(Patient bill);
	
	

}
