
package util.adibrata.support.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtility
	{
		// http://viralpatel.net/blogs/java-read-write-excel-file-apache-poi/
		private String excelfile;
		@SuppressWarnings("rawtypes")
		private List lst;

		public ExcelUtility()
			{
				
				// TODO Auto-generated constructor stub
			}
			
		public List<Map<Long, Object>> ReadExcel()
			{
				final List<Map<Long, Object>> lstexcel = new ArrayList<Map<Long, Object>>();
				Map<Long, Object> col = null;
				try
					{

						final FileInputStream file = new FileInputStream(new File(this.excelfile));

						// Get the workbook instance for XLS file
						final HSSFWorkbook workbook = new HSSFWorkbook(file);

						// Get first sheet from the workbook
						final HSSFSheet sheet = workbook.getSheetAt(0);

						// Iterate through each rows from first sheet
						final Iterator<Row> rowIterator = sheet.iterator();
						while (rowIterator.hasNext())
							{
								final Row row = rowIterator.next();

								// For each row, iterate through each columns
								final Iterator<Cell> cellIterator = row.cellIterator();

								while (cellIterator.hasNext())
									{
										col = new HashMap<Long, Object>();
										final Cell cell = cellIterator.next();

										switch (cell.getCellType())
											{
												case Cell.CELL_TYPE_BOOLEAN :
													System.out.print(cell.getBooleanCellValue() + "\t\t");
													col.put((long) cell.getRowIndex(), cell.getBooleanCellValue());
													break;
												case Cell.CELL_TYPE_NUMERIC :
													System.out.print(cell.getNumericCellValue() + "\t\t");
													col.put((long) cell.getRowIndex(), cell.getNumericCellValue());
													break;
												case Cell.CELL_TYPE_STRING :
													System.out.print(cell.getStringCellValue() + "\t\t");
													col.put((long) cell.getRowIndex(), cell.getNumericCellValue());
													break;
											}
									}
								lstexcel.add(col);
								System.out.println("");
							}
						file.close();
						final FileOutputStream out = new FileOutputStream(new File(this.excelfile));
						workbook.write(out);
						out.close();

					}
				catch (final FileNotFoundException e)
					{
						e.printStackTrace();
					}
				catch (final IOException e)
					{
						e.printStackTrace();
					}
				return lstexcel;
			}

		/**
		 * @return the excelfile
		 */
		public String getExcelfile()
			{
				return this.excelfile;
			}
			
		/**
		 * @param excelfile
		 *            the excelfile to set
		 */
		public void setExcelfile(final String excelfile)
			{
				this.excelfile = excelfile;
			}
			
		/**
		 * @return the lst
		 */
		public List getLst()
			{
				return this.lst;
			}
			
		/**
		 * @param lst
		 *            the lst to set
		 */
		public void setLst(final List lst)
			{
				this.lst = lst;
			}

	}
