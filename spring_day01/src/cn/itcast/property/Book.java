package cn.itcast.property;

public class Book {
			private String bookname;

			public String getBookname() {
				return bookname;
			}

			public void setBookname(String bookname) {
				this.bookname = bookname;
			}
			
			public void demobook() {
				System.out.println("=========="+bookname);;
			}
}
