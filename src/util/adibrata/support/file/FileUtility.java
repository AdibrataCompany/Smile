
package util.adibrata.support.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtility
	{

		private String filepath;
		private String filename;
		private String filextention;
		private Long filesize;
		private byte[] filebinary;
		private File filevalue;
		private String path;

		public FileUtility()
			{
				// TODO Auto-generated constructor stub
				this.filebinary = null;
			}

		public FileUtility(final String filepath) throws IOException
			{
				this.filebinary = null;
				this.filepath = filepath;
				this.filevalue = new File(this.filepath);
				this.filebinary = this.ReadFile();
			}

		public byte[] ReadFile() throws IOException
			{

				this.filebinary = getBytesFromFile(this.filevalue);
				this.filename = this.filevalue.getName();
				this.path = this.filevalue.getPath();
				
				this.filesize = this.filevalue.length();
				return this.filebinary;
			}
			
		@SuppressWarnings("resource")
		private static byte[] getBytesFromFile(final File file) throws IOException
			{
				final InputStream is = new FileInputStream(file);
				
				// Get the size of the file
				final long length = file.length();
				
				// You cannot create an array using a long type.
				// It needs to be an int type.
				// Before converting to an int type, check
				// to ensure that file is not larger than Integer.MAX_VALUE.
				if (length > Integer.MAX_VALUE)
					{
						// File is too large
					}
					
				// Create the byte array to hold the data
				final byte[] bytes = new byte[(int) length];
				
				// Read in the bytes
				int offset = 0;
				int numRead = 0;
				while ((offset < bytes.length) && ((numRead = is.read(bytes, offset, bytes.length - offset)) >= 0))
					{
						offset += numRead;
					}
					
				// Ensure all the bytes have been read in
				if (offset < bytes.length)
					{
						throw new IOException("Could not completely read file " + file.getName());
					}
					
				// Close the input stream and return bytes
				is.close();
				return bytes;
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
		public Long getFilesize()
			{
				return this.filesize;
			}

		/**
		 * @param filesize
		 *            the filesize to set
		 */
		public void setFilesize(final Long filesize)
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

		/**
		 * @return the path
		 */
		public String getPath()
			{
				return this.path;
			}

		/**
		 * @param path
		 *            the path to set
		 */
		public void setPath(final String path)
			{
				this.path = path;
			}
			
	}

////////////////
// package action;
//
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.util.Date;
// import java.util.List;
//
// import javax.portlet.ActionRequest;
// import javax.portlet.PortletRequest;
// import javax.servlet.http.HttpServletRequest;
//
// import org.apache.commons.io.FilenameUtils;
// import org.apache.commons.lang.StringUtils;
//
// import model.AdiFile;
// import model.AdiFolder;
// import service.FileService;
// import service.FolderService;
// import utils.DateUtils;
// import utils.FileSizeUtils;
//
// import com.liferay.portal.kernel.util.WebKeys;
// import com.liferay.portal.model.User;
// import com.liferay.portal.service.UserLocalServiceUtil;
// import com.liferay.portal.theme.ThemeDisplay;
// import com.liferay.portal.util.PortalUtil;
// import com.opensymphony.xwork2.ActionSupport;
// import com.opensymphony.xwork2.Preparable;
// public class FileAction extends ActionSupport implements Preparable {
//
// /**
// *
// */
// private static final long serialVersionUID = 4587665276501838677L;
//
// private FolderService folderService;
// private AdiFolder adiFolder;
// private List<AdiFolder> adiFolders;
// private String fdr_title;
// private long fdr_id;
// private long fdr_up_id;
// private static final long serialVersionUID = 1L; private long id;
// private String mode;
// private String warning;
// private String path;
//
// private FileService fileService;
// private AdiFile adiFile;
// private String fl_title;
// private String fl_desc;
// private String fl_eff_dt;
// private String fl_exp_dt;
// private File fileUpload;
// private String fileUploadContentType;
// private String fileUploadFileName;
// private String fl_category;
//
// private InputStream fileInputStream;
// // private ActionRequest actionRequest;
//
//
//
// public FileAction(FileService fileService, FolderService folderService) {
// this.fileService = fileService;
// this.folderService = folderService;
// // TODO Auto-generated constructor stub
// }
//
// //Method//////////////////////////////////////////////////////////////////////////////////////////
// @Override
// public String execute() throws Exception {
//
// return SUCCESS;
// }
//
// //Method masuk ke sub folder
// public String fileSub() {
// return SUCCESS;
// }
//
// //Method keluar ke parent folder
// public String fileUp(){
// return SUCCESS;
// }
//
// public String fileAdd(){
// folderId(id);
// return SUCCESS;
// }
//
// public String fileMgmnt(){
// if(mode!=null){
// if(mode.equals("cancel")){
// mode = "cancel";
// folderList();
// }
// if(mode.equals("create")){
//
// fileCreate(id);
// System.out.println("adiFile"+adiFile);
// fl_title = adiFile.getFl_search_name();
// long idN = adiFile.getFl_id();
//
// adiFile = new AdiFile();
// adiFile = fileService.folderFindById(idN);
// fl_title = adiFile.getFl_search_name();
// mode = "create";
// }
// if(mode.equals("pdf")){
// mode = "pdf";
// long idN = adiFile.getFl_id();
// adiFile = new AdiFile();
// adiFile = fileService.folderFindById(idN);
//
// }
// if(mode.equals("download")){
// mode = "download";
// try {
// fileDownload();
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }
// else{
// mode ="home";
// }
// return mode;
// }
//
// public String fileView(){
// adiFile = new AdiFile();
// adiFile = fileService.folderFindById(id);
// return SUCCESS;
// }
//
//
// ////Sub Method/////////////////////////////////////////////////////////////////////////////////////
// public void folderId(long id){
// if(id!=0){
// adiFolder = this.folderService.folderFindById(id);
// fdr_title = adiFolder.getFdr_title();
// }
// else{
// adiFolder = null;
// fdr_title="HOME";
// }
// }
//
//
// public void fileCreate(Long id){
// try {
//
//
// adiFile = new AdiFile();
// adiFile.setFl_search_name(fl_title.toUpperCase());
// adiFile.setFl_desc(fl_desc.toUpperCase());
// adiFile.setFl_category(fl_category);
//
//
// byte[] bytes = null;
// bytes = getBytesFromFile(fileUpload);
// adiFile.setFl_upload(bytes);
// adiFile.setFl_uploadFileName(fileUploadFileName);
// adiFile.setFl_uploadContentType(fileUploadContentType);
//
// //set extension file
// String ext = FilenameUtils.getExtension(fileUploadFileName);
// adiFile.setFl_ext(ext);
//
// //set size file
// String size = FileSizeUtils.convertFileSize(fileUpload.length());
// adiFile.setFl_size(size);
// adiFile.setFl_size_byte(fileUpload.length());
//
// // set eff and exp date
// adiFile.setFl_eff_dt(DateUtils.convertStringToDate(fl_eff_dt));
// adiFile.setFl_exp_dt(DateUtils.convertStringToDate(fl_exp_dt));
//
// // ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
// //themeDisplay.getUser();
// //User user = UserLocalServiceUtil.getUserById(userID);
// //String user_name = user.getScreenName();
//
// //set Audit Trail
// adiFile.setFl_stat(1);
// adiFile.setFl_upd_dt(new Date());
// adiFile.setFl_upd("admin");
// adiFile.setFl_mdf_dt(new Date());
// adiFile.setFl_mdf("admin");
// adiFile.setFdr_parent_id(id);
// fileService.fileCreate(adiFile);
//
// //long x = adiFile.getFl_id();
//
// warning = "File '"+fl_title+"' has been successfully created!";
// } catch (Exception e) {
// // TODO: handle exception
// e.printStackTrace();
// }
//
// }
//
//
// public void getSize(File upload){
// //long size = upload.length();
// double bytes = upload.length();
// double kilobytes = (bytes / 1024);
// double megabytes = (kilobytes / 1024);
// double gigabytes = (megabytes / 1024);
// double terabytes = (gigabytes / 1024);
// double petabytes = (terabytes / 1024);
// double exabytes = (petabytes / 1024);
// double zettabytes = (exabytes / 1024);
// double yottabytes = (zettabytes / 1024);
//
// System.out.println("bytes : " + bytes);
// System.out.println("kilobytes : " + kilobytes);
// System.out.println("megabytes : " + megabytes);
// System.out.println("gigabytes : " + gigabytes);
// System.out.println("terabytes : " + terabytes);
// System.out.println("petabytes : " + petabytes);
// System.out.println("exabytes : " + exabytes);
// System.out.println("zettabytes : " + zettabytes);
// System.out.println("yottabytes : " + yottabytes);
// }
//
// @SuppressWarnings("resource")
// public static byte[] getBytesFromFile(File file) throws IOException {
// InputStream is = new FileInputStream(file);
//
// // Get the size of the file
// long length = file.length();
//
// // You cannot create an array using a long type.
// // It needs to be an int type.
// // Before converting to an int type, check
// // to ensure that file is not larger than Integer.MAX_VALUE.
// if (length > Integer.MAX_VALUE) {
// // File is too large
// }
//
// // Create the byte array to hold the data
// byte[] bytes = new byte[(int) length];
//
// // Read in the bytes
// int offset = 0;
// int numRead = 0;
// while (offset < bytes.length
// && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
// offset += numRead;
// }
//
// // Ensure all the bytes have been read in
// if (offset < bytes.length) {
// throw new IOException("Could not completely read file "
// + file.getName());
// }
//
// // Close the input stream and return bytes
// is.close();
// return bytes;
// }
//
// public void folderList(){
// if(id!=0){
// fdr_up_id = id;
// folderId(id);
// }
// adiFolders = this.folderService.folderSubData(id);
// adiFolder = this.folderService.folderFindById(id);
// }
//
// public void getPath(long id){
// if(id!=0){
// adiFolder = new AdiFolder();
// adiFolder = this.folderService.folderFindById(id);
//
// String pathname = adiFolder.getFdr_path();
// String[] paths = pathname.split("\\.");
// path = StringUtils.join(paths, " / ");
// /*for (int i = 1; i < paths.length; i++) {
// path = " / "+paths[i];
// path = path+path;
// }*/
// }
// else{
// path = null;
// }
// }
//
//
// public void fileCheckName(){
// adiFolders = this.folderService.folderFindByIdAndTitle(id, fdr_title);
// }
//
// public String fileDownload() throws IOException{
// adiFile = new AdiFile();
// adiFile = fileService.folderFindById(id);
// fileUploadFileName= adiFile.getFl_uploadFileName();
//
// byte[] bFile = adiFile.getFl_upload();
// fileUpload = new File(fileUploadFileName);
// FileOutputStream fos = new FileOutputStream(fileUpload);
// fos.write(bFile);
// fos.flush();
// fos.close();
// fileInputStream = new FileInputStream(fileUpload) ;
// fileUploadFileName = fileUpload.getName();
// return "download";
//
// }

//
//
// }
