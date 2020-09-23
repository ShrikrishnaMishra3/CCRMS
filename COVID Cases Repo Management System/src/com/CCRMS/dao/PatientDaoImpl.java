package com.CCRMS.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CCRMS.model.Patient;

@Repository
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Patient> getAllBilles() {
		return sessionFactory.getCurrentSession().createQuery("from Billes").getResultList();
	}

	@Override
	public boolean insertBill(Patient bill) {
		Serializable serializable = sessionFactory.getCurrentSession().save(bill);
		if(serializable!=null)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean deleteBill(Long id) {
		Patient bill = (Patient) sessionFactory.getCurrentSession().load(Patient.class, id);
		if (null != bill) {
			this.sessionFactory.getCurrentSession().delete(bill);
		   }
				return true;
			}

	@Override
	public Patient getBillById(Long id) {
		System.out.println("Dao of getBIllBy iD");
		Patient bill=  sessionFactory.getCurrentSession().load(Patient.class, id);
		System.out.println(bill);
		return bill;

	}

	@Override
	public List<Patient> getAllBillInfo() {
		return sessionFactory.getCurrentSession().createQuery("from Billes").getResultList();
	}

	@Override
	public Long updateBill(Patient bill) {
			sessionFactory.getCurrentSession().update(bill);
			return bill.getId();
	}

}
