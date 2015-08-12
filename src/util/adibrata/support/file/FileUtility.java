
package util.adibrata.support.file;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class FileUtility
	{
		private String filepath;
		private String filename;
		private String filextention;
		private String filesize;
		private byte[] filebinary;
		private File filevalue;
		
		public FileUtility()
			{
				// TODO Auto-generated constructor stub
			}

		public byte[] ReadFile()
			{
				
				return this.filebinary;

			}
			
		public void fileCreate(final Long id)
			{
				try
					{
						
						adiFile = new AdiFile();
						adiFile.setFl_search_name(fl_title.toUpperCase());
						adiFile.setFl_desc(fl_desc.toUpperCase());
						adiFile.setFl_category(fl_category);
						
						byte[] bytes = null;
						bytes = getBytesFromFile(fileUpload);
						adiFile.setFl_upload(bytes);
						adiFile.setFl_uploadFileName(fileUploadFileName);
						adiFile.setFl_uploadContentType(fileUploadContentType);
						
						// set extension file
						final String ext = FilenameUtils.getExtension(fileUploadFileName);
						adiFile.setFl_ext(ext);
						
						// set size file
						final String size = FileSizeUtils.convertFileSize(fileUpload.length());
						adiFile.setFl_size(size);
						adiFile.setFl_size_byte(fileUpload.length());
						
						// set eff and exp date
						adiFile.setFl_eff_dt(DateUtils.convertStringToDate(fl_eff_dt));
						adiFile.setFl_exp_dt(DateUtils.convertStringToDate(fl_exp_dt));
						
						// ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
						// themeDisplay.getUser();
						// User user = UserLocalServiceUtil.getUserById(userID);
						// String user_name = user.getScreenName();
						
						// set Audit Trail
						adiFile.setFl_stat(1);
						adiFile.setFl_upd_dt(new Date());
						adiFile.setFl_upd("admin");
						adiFile.setFl_mdf_dt(new Date());
						adiFile.setFl_mdf("admin");
						adiFile.setFdr_parent_id(id);
						fileService.fileCreate(adiFile);
						
						// long x = adiFile.getFl_id();
						
						warning = "File '" + fl_title + "' has been successfully created!";
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
					}
					
			}
			
		/**
		 * @return the filepath
		 */
		public String getFilepath()
			{
				return this.filepath;
			}

		/**
		 * @param filepath
		 *            the filepath to set
		 */
		public void setFilepath(final String filepath)
			{
				this.filepath = filepath;
			}

		/**
		 * @return the filename
		 */
		public String getFilename()
			{
				return this.filename;
			}

		/**
		 * @param filename
		 *            the filename to set
		 */
		public void setFilename(final String filename)
			{
				this.filename = filename;
			}

		/**
		 * @return the filextention
		 */
		public String getFilextention()
			{
				return this.filextention;
			}

		/**
		 * @param filextention
		 *            the filextention to set
		 */
		public void setFilextention(final String filextention)
			{
				this.filextention = filextention;
			}

		/**
		 * @return the filesize
		 */
		public String getFilesize()
			{
				return this.filesize;
			}

		/**
		 * @param filesize
		 *            the filesize to set
		 */
		public void setFilesize(final String filesize)
			{
				this.filesize = filesize;
			}

		/**
		 * @return the filebinary
		 */
		public byte[] getFilebinary()
			{
				return this.filebinary;
			}

		/**
		 * @param filebinary
		 *            the filebinary to set
		 */
		public void setFilebinary(final byte[] filebinary)
			{
				this.filebinary = filebinary;
			}
			
		/**
		 * @return the filevalue
		 */
		public File getFilevalue()
			{
				return this.filevalue;
			}
			
		/**
		 * @param filevalue
		 *            the filevalue to set
		 */
		public void setFilevalue(final File filevalue)
			{
				this.filevalue = filevalue;
			}
			
	}
