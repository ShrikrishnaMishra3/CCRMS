package com.CCRMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CCRMS.dao.PatientDao;
import com.CCRMS.model.Patient;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientDao billDao;
		
	@Override
	public List<Patient> getAllBillInfo() {
		return billDao.getAllBilles();
	}

	@Override
	public boolean insertBill(Patient bill) {
		return billDao.insertBill(bill);
		
	}

	@Override
	public boolean deleteBill(Long id) {
		return billDao.deleteBill(id);
		
	}

	@Override
	public Patient getBillById(Long id) {
		return billDao.getBillById(id);
	}

	@Override
	public Long updateBill(Patient bill) {
		billDao.updateBill(bill);
		  return bill.getId();
	}
	

	
	

}
