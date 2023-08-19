package project;

public class Book {
	
	    private int id;
	    private String title;
	    private String author;
	    private String isbn;
	    private boolean available;
		public Book(int id, String title, String author, String isbn, boolean available) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.available = available;
		}
		public Book() {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public boolean isAvailable() {
			return available;
		}
		public void setAvailable(boolean available) {
			this.available = available;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", available="
					+ available + "]";
		}

	
	}
