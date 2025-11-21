public class bai17 {
    static class Document{
        protected String title;
        protected String content;

        public Document(String title, String content){
            this.title = title;
            this.content = content;
        }
        public void printInfo(){
            System.out.println("Document title: " + title);
            System.out.println("Content " + content);
        }
    }
    static class WordDocument extends Document{
        public WordDocument(String title, String content){
            super(title, content);
        }
        @Override
        public void printInfo(){
            System.out.println("     tài liêu     ");
            System.out.println("Tiêu đề: " + title.toUpperCase());
            System.out.println("Ý tưởng: " + content);
            System.out.println("====================");
        }
    }
    static class PdfDcoument extends Document{
        public PdfDcoument(String title, String content){
            super(title, content);
        }
        @Override
        public void printInfo(){
            System.out.println("    Tài liệu PDF    ");
            System.out.println("     Tiêu đề:    " + title.toUpperCase());
            System.out.println("Ý tưởng: "+ content);
            System.out.println("*********************");
        }

        static class Spreadsheet  extends Document{
            public Spreadsheet(String title, String content){
                super(title, content);
            }
            @Override
            public void printInfo(){
                System.out.println("     Bảng tính của Thành:     " );
                System.out.println("Bảng tínhtitle: " + title);
                System.out.println("Bảng tính content: " + content);
                System.out.println("*********************");
            }
        }
        public static void main(String[] args){
            Document document = new WordDocument("Đây là Thành", "tạo bài tập");
            Document pdf = new WordDocument("Hướng dẫn pdf", "Nội dung bài tập pdf");
            Document sheet = new Spreadsheet("bảng tính này hay", "Dữ liệu cần có!");

            document.printInfo();
            System.out.println();
            pdf.printInfo();
            System.out.println();
            sheet.printInfo();
            System.out.println();
        }
    }
}

