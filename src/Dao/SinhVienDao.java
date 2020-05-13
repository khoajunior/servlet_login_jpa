package Dao;

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
}
