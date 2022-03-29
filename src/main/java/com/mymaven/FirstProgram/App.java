package com.mymaven.FirstProgram;

import java.io.*;

import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       
    	
    	HSSFWorkbook libro = new HSSFWorkbook();
    	
    	HSSFSheet hoja = libro.createSheet();
    	
    	hoja.createRow(0);
    	hoja.getRow(0).createCell(0).setCellValue("NAME");
    	hoja.getRow(0).createCell(1).setCellValue("LASTNAME");
    	hoja.getRow(0).createCell(2).setCellValue("EMAIL");
    	hoja.getRow(0).createCell(3).setCellValue("PASSWORD");
    	hoja.getRow(0).createCell(4).setCellValue("COMPANY");
    	hoja.getRow(0).createCell(5).setCellValue("ADDRESS");
    	hoja.getRow(0).createCell(6).setCellValue("CITY");
    	hoja.getRow(0).createCell(7).setCellValue("ZIP_CODE");
    	hoja.getRow(0).createCell(8).setCellValue("MOBILE_PHONE");
    	
    	hoja.createRow(1);
    	
    	
    	hoja.getRow(1).createCell(0).setCellValue("someName");
    	hoja.getRow(1).createCell(1).setCellValue("SomeLastName");
    	hoja.getRow(1).createCell(1).setCellValue("SomeEmail");
    	hoja.getRow(1).createCell(1).setCellValue("SomePassword");
    	hoja.getRow(1).createCell(1).setCellValue("SomeCompany");
    	hoja.getRow(1).createCell(1).setCellValue("SomeAddress");
    	hoja.getRow(1).createCell(1).setCellValue("SomeCity");
    	hoja.getRow(1).createCell(1).setCellValue("SomePostCode");
    	hoja.getRow(1).createCell(1).setCellValue("SomeMobilePhone");
    	
    	
    	File file = new File("C:\\Users\\68937\\eclipse-workspace\\FirstProgram\\excel\\MyFirstExcel.xlsx");
    	
    	libro.write(file);
    	libro.close();
    	
        
        
    }
}
