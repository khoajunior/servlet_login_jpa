package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.SinhVien;




public class SinhVienDao {
	private EntityManager em;

	public SinhVienDao() {
		em = MyEntityManager.getInstance().getEntityManager();
	}
	
	public boolean addSinhVien(SinhVien sinhVien) {
		boolean result = false;
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(sinhVien);
			tr.commit();
			result = true;
		}catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return result;
	}
	
	public SinhVien findOne(int id) {
		return em.find(SinhVien.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public SinhVien findByEmail(String email) {
	
		List<SinhVien> list = new ArrayList<SinhVien>();
		 list =  em.createNativeQuery("select * from SinhVien where email ='"+ email+"'", SinhVien.class).getResultList();
		 if(list.isEmpty()) {
			 return null;
		 }else {
		return list.get(0);
		 }
	}
}
