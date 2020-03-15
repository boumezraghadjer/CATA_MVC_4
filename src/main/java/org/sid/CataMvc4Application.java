package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.model.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CataMvc4Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CataMvc4Application.class, args);
		ProduitRepository produitDao= ctx.getBean(ProduitRepository.class);
//		produitDao.save(new Produit("HP", 300, 8));
//		produitDao.save(new Produit("Epson", 800, 3));
//		produitDao.save(new Produit("Windows", 500, 3));
		produitDao.findAll().forEach(p->System.out.println(p.getDesignation()));
	}

}
