
package util.adibrata.support.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		
		private Long seqno;
		private String datatype;
		private Object cellvalue;
		private Long colno;

		public ExcelUtility()
			{

				// TODO Auto-generated constructor stub
			}

		public ExcelUtility(final Long seqno, final Long colno, final String datatype, final Object cellvalue)
			{
				this.seqno = seqno;
				this.datatype = datatype;
				this.cellvalue = cellvalue;
				this.colno = colno;
			}

		public List<List<ExcelUtility>> ReadExcel()
			{
				final List<List<ExcelUtility>> lstexcel = new ArrayList<List<ExcelUtility>>();
				List<ExcelUtility> col = null;
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
								col = new ArrayList<ExcelUtility>();
								while (cellIterator.hasNext())
									{
										final Cell cell = cellIterator.next();

										// System.out.print(cell.getRowIndex() + "\t\t");
										switch (cell.getCellType())
											{
												case Cell.CELL_TYPE_BOOLEAN :
													// System.out.print(cell.getBooleanCellValue() + "\t\t");
													col.add(new ExcelUtility((long) cell.getRowIndex(), (long) cell.getColumnIndex(), "B", cell.getBooleanCellValue()));

													break;
												case Cell.CELL_TYPE_NUMERIC :
													// System.out.print(cell.getNumericCellValue() + "\t\t");

													col.add(new ExcelUtility((long) cell.getRowIndex(), (long) cell.getColumnIndex(), "N", cell.getNumericCellValue()));
													break;
												case Cell.CELL_TYPE_STRING :
													// System.out.print(cell.getStringCellValue() + "\t\t");
													col.add(new ExcelUtility((long) cell.getRowIndex(), (long) cell.getColumnIndex(), "S", cell.getStringCellValue()));
													break;
											}
									}
								lstexcel.add(col);
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
		@SuppressWarnings("rawtypes")
		public List getLst()
			{
				return this.lst;
			}

		/**
		 * @param lst
		 *            the lst to set
		 */
		@SuppressWarnings("rawtypes")
		public void setLst(final List lst)
			{
				this.lst = lst;
			}

		/**
		 * @return the seqno
		 */
		public Long getSeqno()
			{
				return this.seqno;
			}

		/**
		 * @param seqno
		 *            the seqno to set
		 */
		public void setSeqno(final Long seqno)
			{
				this.seqno = seqno;
			}

		/**
		 * @return the datatype
		 */
		public String getDatatype()
			{
				return this.datatype;
			}

		/**
		 * @param datatype
		 *            the datatype to set
		 */
		public void setDatatype(final String datatype)
			{
				this.datatype = datatype;
			}

		/**
		 * @return the cellvalue
		 */
		public Object getCellvalue()
			{
				return this.cellvalue;
			}

		/**
		 * @param cellvalue
		 *            the cellvalue to set
		 */
		public void setCellvalue(final Object cellvalue)
			{
				this.cellvalue = cellvalue;
			}
			
		/**
		 * @return the colno
		 */
		public Long getColno()
			{
				return this.colno;
			}
			
		/**
		 * @param colno
		 *            the colno to set
		 */
		public void setColno(final Long colno)
			{
				this.colno = colno;
			}
			
	}
