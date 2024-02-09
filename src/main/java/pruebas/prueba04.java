package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class prueba04 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = dao.find(4);
		
		dao.delete(subject);
		
		List<Subject> subjectList = dao.findAll();
		
		
		for(Subject s: subjectList) { 
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
			
		}
		
		
	}

}
