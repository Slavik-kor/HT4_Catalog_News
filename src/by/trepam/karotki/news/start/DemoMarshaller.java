package by.trepam.karotki.news.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import by.trepam.karotki.news.entity.Catalog;
import by.trepam.karotki.news.entity.Category;
import by.trepam.karotki.news.entity.News;
import by.trepam.karotki.news.entity.SubCategory;

public class DemoMarshaller {
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException{
		JAXBContext context=JAXBContext.newInstance(Catalog.class);
		Marshaller m=context.createMarshaller();
	
		News news1=new News();
		news1.setNewsName("������");
		news1.setDateOfIssue("19/05/2006");
		news1.setProvider("����������� ����");
		news1.setNewsBody("������� � ������� ������");
		
		News news2=new News();
		news2.setNewsName("���� ���������");
		news2.setDateOfIssue("01/04/2016");
		news2.setProvider("����������� ����");
		news2.setNewsBody("������� ����� ����� �������");
		
		News news3=new News();
		news3.setNewsName("���������� ������");
		news3.setDateOfIssue("29/10/2012");
		news3.setProvider("�����");
		news3.setNewsBody("�������� �������������� ����� � ��������� ����������� ");
		
		News news4=new News();
		news4.setNewsName("������� ������ 4.0");
		news4.setDateOfIssue("20/05/2012");
		news4.setProvider("����������� ����");
		news4.setNewsBody("����� �������");
		
		News news5=new News();
		news5.setNewsName("��������� �����");
		news5.setDateOfIssue("20/05/2015");
		news5.setProvider("����������� ����");
		news5.setNewsBody("����� ����������� ����������� ��������");
		
		SubCategory subCategory1= new SubCategory("�������");
		subCategory1.addNews(news1);
		subCategory1.addNews(news2);
		
		SubCategory subCategory2= new SubCategory("��������������");
		subCategory2.addNews(news3);
		
		SubCategory subCategory3= new SubCategory("�������");
		subCategory3.addNews(news4);
		
		SubCategory subCategory4= new SubCategory("�������");
		subCategory4.addNews(news5);
		
		Category cat1= new Category("������");
		cat1.addSubCategory(subCategory1);
		cat1.addSubCategory(subCategory2);
		cat1.addSubCategory(subCategory3);
		cat1.addSubCategory(subCategory4);
		
		
		
		News news7=new News();
		news7.setNewsName("Photoshop CC");
		news7.setDateOfIssue("20/05/2015");
		news7.setProvider("Adobe");
		news7.setNewsBody("����� ���������� photoshop CC");
		
		News news8=new News();
		news8.setNewsName("HL3");
		news8.setDateOfIssue("20/05/2015");
		news8.setProvider("Valve");
		news8.setNewsBody("���� hl3 ��������� ���� ������");
		
		SubCategory subCategory5= new SubCategory("��");
		subCategory5.addNews(news7);
		
		SubCategory subCategory6= new SubCategory("����");
		subCategory6.addNews(news8);
		
		
		Category cat2= new Category("�����");
		cat2.addSubCategory(subCategory5);
		cat2.addSubCategory(subCategory6);
		
		
		News news9=new News();
		news9.setNewsName("������� ������");
		news9.setDateOfIssue("20/05/2015");
		news9.setProvider("������ �.�.");
		news9.setNewsBody("�������� ����������� ������� �� �����");
		
		News news10=new News();
		news10.setNewsName("�������� ���������");
		news10.setDateOfIssue("20/05/2015");
		news10.setProvider("���������� ");
		news10.setNewsBody("��������� ����������� ��������");
		
		SubCategory subCategory7= new SubCategory("��������");
		subCategory7.addNews(news9);
		
		SubCategory subCategory8= new SubCategory("����������");
		subCategory8.addNews(news10);
		
		Category cat3= new Category("�����");
		cat3.addSubCategory(subCategory7);
		cat3.addSubCategory(subCategory8);
		
		Catalog catalog= new Catalog();
		catalog.addCategory(cat1);
		catalog.addCategory(cat2);
		catalog.addCategory(cat3);
		

		m.marshal(catalog, new FileOutputStream(new File("catalog.xml")));
		System.out.println("���� xml ������");
		
		
	}

}
