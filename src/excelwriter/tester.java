package excelwriter;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NiceExcelWriterExample excelWriter = new NiceExcelWriterExample();
 
		List<Book> listBook = excelWriter.getListBook();
		String excelFilePath = "NiceJavaBooks.xls";
 
		excelWriter.writeExcel(listBook, excelFilePath);
	}

}
