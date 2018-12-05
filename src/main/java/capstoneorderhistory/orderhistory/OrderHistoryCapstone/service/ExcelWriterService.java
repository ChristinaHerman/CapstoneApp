package capstoneorderhistory.orderhistory.OrderHistoryCapstone.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import capstoneorderhistory.orderhistory.OrderHistoryCapstone.model.Customer;
import capstoneorderhistory.orderhistory.OrderHistoryCapstone.model.Order;
import capstoneorderhistory.orderhistory.OrderHistoryCapstone.model.Product;


@Service
public class ExcelWriterService {
	private static String[] columnNamesOrder = {"Customer Name", "product", "quantity", "unit cost"};
	private static String[] columnNamesProduct = {"id", "name", "category", "description", "manufactuerer name", "price"};
	



	public ByteArrayInputStream createExcelFile(List<Product> list) {
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Product");
		
		Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.BLUE.getIndex());
        
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        
        Row headerRow = sheet.createRow(0);
        
        for(int i = 0; i < columnNamesProduct.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columnNamesProduct[i]);
            cell.setCellStyle(headerCellStyle);
        }
        
        int rowNum = 1;
        for(Product prod: list) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(prod.getId());

            row.createCell(1)
                    .setCellValue(prod.getName());

            row.createCell(2).setCellValue(prod.getCategory());
            row.createCell(3).setCellValue(prod.getDescription());
            row.createCell(4).setCellValue(prod.getManufacturerName());
            row.createCell(5).setCellValue(prod.getPrice().toString());

        }
		
        ByteArrayInputStream stream = null;
        
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			workbook.write(out);
		    workbook.close();
		    stream = new ByteArrayInputStream(out.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream;
	    
	}
//	public ByteArrayInputStream createExcelFileDistrict() {
//		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet("Orders");
//		
//		Font headerFont = workbook.createFont();
//        headerFont.setBold(true);
//        headerFont.setFontHeightInPoints((short) 14);
//        headerFont.setColor(IndexedColors.BLUE.getIndex());
//        
//        CellStyle headerCellStyle = workbook.createCellStyle();
//        headerCellStyle.setFont(headerFont);
//        
//        Row headerRow = sheet.createRow(0);
//        
//        for(int i = 0; i < columnNames.length; i++) {
//            Cell cell = headerRow.createCell(i);
//            cell.setCellValue(columnNames[i]);
//            cell.setCellStyle(headerCellStyle);
//        }
//        
//        int rowNum = 1;
//        for(Order order: orders) {
//            Row row = sheet.createRow(rowNum++);
//
//            row.createCell(0)
//                    .setCellValue(order.getCustomer().getName());
//
//            row.createCell(1)
//                    .setCellValue(order.getProductName());
//
//            row.createCell(2).setCellValue(order.getQuantity());
//            row.createCell(3).setCellValue(order.getUnitCost().toString());
//        }
//		
//        ByteArrayInputStream stream = null;
//        
//		try {
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			workbook.write(out);
//		    workbook.close();
//		    stream = new ByteArrayInputStream(out.toByteArray());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return stream;
//	    
//	}
//	public ByteArrayInputStream createExcelFileDonor() {
//		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet("Orders");
//		
//		Font headerFont = workbook.createFont();
//        headerFont.setBold(true);
//        headerFont.setFontHeightInPoints((short) 14);
//        headerFont.setColor(IndexedColors.BLUE.getIndex());
//        
//        CellStyle headerCellStyle = workbook.createCellStyle();
//        headerCellStyle.setFont(headerFont);
//        
//        Row headerRow = sheet.createRow(0);
//        
//        for(int i = 0; i < columnNames.length; i++) {
//            Cell cell = headerRow.createCell(i);
//            cell.setCellValue(columnNames[i]);
//            cell.setCellStyle(headerCellStyle);
//        }
//        
//        int rowNum = 1;
//        for(Order order: orders) {
//            Row row = sheet.createRow(rowNum++);
//
//            row.createCell(0)
//                    .setCellValue(order.getCustomer().getName());
//
//            row.createCell(1)
//                    .setCellValue(order.getProductName());
//
//            row.createCell(2).setCellValue(order.getQuantity());
//            row.createCell(3).setCellValue(order.getUnitCost().toString());
//        }
//		
//        ByteArrayInputStream stream = null;
//        
//		try {
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			workbook.write(out);
//		    workbook.close();
//		    stream = new ByteArrayInputStream(out.toByteArray());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return stream;
//	    
//	}
//	public ByteArrayInputStream createExcelFileProduct() {
//		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet("Orders");
//		
//		Font headerFont = workbook.createFont();
//        headerFont.setBold(true);
//        headerFont.setFontHeightInPoints((short) 14);
//        headerFont.setColor(IndexedColors.BLUE.getIndex());
//        
//        CellStyle headerCellStyle = workbook.createCellStyle();
//        headerCellStyle.setFont(headerFont);
//        
//        Row headerRow = sheet.createRow(0);
//        
//        for(int i = 0; i < columnNames.length; i++) {
//            Cell cell = headerRow.createCell(i);
//            cell.setCellValue(columnNames[i]);
//            cell.setCellStyle(headerCellStyle);
//        }
//        
//        int rowNum = 1;
//        for(Order order: orders) {
//            Row row = sheet.createRow(rowNum++);
//
//            row.createCell(0)
//                    .setCellValue(order.getCustomer().getName());
//
//            row.createCell(1)
//                    .setCellValue(order.getProductName());
//
//            row.createCell(2).setCellValue(order.getQuantity());
//            row.createCell(3).setCellValue(order.getUnitCost().toString());
//        }
//		
//        ByteArrayInputStream stream = null;
//        
//		try {
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			workbook.write(out);
//		    workbook.close();
//		    stream = new ByteArrayInputStream(out.toByteArray());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return stream;
//	    
//	}
	
}
