package us;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dao.SinhVienDao;
import model.SinhVien;

public class MainClass {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("servlet_login")
				.createEntityManager();
		
//		SinhVien sv = new SinhVien(2, "1", "1", "2", "1");
//		EntityTransaction tr = em.getTransaction();
//		
//		tr.begin();
//		
//		em.persist(sv);
////		em.remove(em.find(Lophoc.class, "13ATT"));
//		
//		tr.commit();
		SinhVienDao dao = new SinhVienDao();
		SinhVien sv = dao.findByEmail("1234@gmail.com");
		System.out.println(sv);
	}
}
