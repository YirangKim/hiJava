<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>

<%

	request.setCharacterEncoding("EUC-KR");
	
	String productID = request.getParameter("productID");
	String name = request.getParameter("name");
	String unitPrice = request.getParameter("unitPrice");
	String description = request.getParameter("description");
	String manufacturer = request.getParameter("manufacturer");
	String category = request.getParameter("category");
	String unitsInStock = request.getParameter("unitsInStock");
	String condition = request.getParameter("condition");
	
	Integer price;
	
	if(unitPrice.isEmpty())
		price=0;
	else
		price = Integer.valueOf(unitPrice);
	
	long stock;
	if(unitPrice.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitPrice);

	ProductRepository dao = ProductRepository.getInstance();

	
	Product newProduct = new Product();
	newProduct.setProductID(productID);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(stock);
	newProduct.setCondition(condition);
	
	dao.addProduct(newProduct);
	response.sendRedirect("products.jsp");
	
%>
