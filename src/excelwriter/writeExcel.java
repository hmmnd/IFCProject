package excelwriter;

public void writeExcel(List<Book> listBook, String excelFilePath) throws IOException {
    Workbook workbook = new HSSFWorkbook();
    Sheet sheet = workbook.createSheet();
 
    int rowCount = 0;
 
    for (Book aBook : listBook) {
        Row row = sheet.createRow(++rowCount);
        writeBook(aBook, row);
    }
 
    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
        workbook.write(outputStream);
    }
}
