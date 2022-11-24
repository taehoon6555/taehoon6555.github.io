package org.javaro.lecture;

public class Book {
	private String isbn;private String title;
	private String author;private Student student;
	public Book(String isbn,String title) {this.isbn=isbn;this.title=title;}
	public void setlsbn(String isbn) {this.isbn=isbn;}
	public String getlsbn() {return this.isbn;}
	public void setTitle(String title) {this.title=title;}
	public String getTitle() {return this.title;}
	public void setAuthor(String author) {this.author=author;}
	public String getAuthor() {return this.author;}
	public void setStudent(Student student) {this.student=student;}
	public Student getStudent() {return this.student;}
	public String toString() {
		String available;
		if(this.getStudent()==null) {
			available="대출가능";
		}else {
			available="대출자="+this.getStudent().getName();
		}
		return "ISBN="+this.getlsbn()+",제목="+this.getTitle()+",저자="+this.getAuthor()+","+
		available;
	}

}
