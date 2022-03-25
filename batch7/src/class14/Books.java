package class14;

public class Books {
	private int pages;
	private String name;
	private String author;
	private float cost;
	private String subject;
	private int voulme;
	private int year;
	private String countryOfOrigin;
	private int copiesSold;

	public Books(int pages, String name, String author, float cost, String subject, int voulme, int year,
			String countryOfOrigin, int copiesSold) {
		super();
		this.pages = pages;
		this.name = name;
		this.author = author;
		this.cost = cost;
		this.subject = subject;
		this.voulme = voulme;
		this.year = year;
		this.countryOfOrigin = countryOfOrigin;
		this.copiesSold = copiesSold;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getVoulme() {
		return voulme;
	}

	public void setVoulme(int voulme) {
		this.voulme = voulme;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	@Override
	public String toString() {
		return "Books [pages=" + pages + ", name=" + name + ", author=" + author + ", cost=" + cost + ", subject="
				+ subject + ", voulme=" + voulme + ", year=" + year + ", countryOfOrigin=" + countryOfOrigin
				+ ", copiesSold=" + copiesSold + "]";
	}

}
