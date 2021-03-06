package training.programs;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.entity.Category;
import training.util.HibernateUtil;

public class P04_GetCategoryById {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try {
			Session session = factory.openSession();
			Category c1 = (Category) session.get(Category.class, 2);
			session.close();
			
			System.out.println("name = " + c1.getName());
			System.out.printf("There are %d products of this category\n", c1.getProducts().size());
		} finally {
			factory.close();
		}
	}
}
