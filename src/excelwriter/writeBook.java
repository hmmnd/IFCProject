package excelwriter;

private void writeBook(Book aBook, Row row) {
    Cell cell = row.createCell(1);
    cell.setCellValue(aBook.getTitle());
 
    cell = row.createCell(2);
    cell.setCellValue(aBook.getAuthor());
 
    cell = row.createCell(3);
    cell.setCellValue(aBook.getPrice());
}
