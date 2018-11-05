package cn.hayye.springboot.swagger_demo.entity;

public class Book {
    private Integer id;
    private String sn;
    private String bookname;
    private Double price;

    public Book() {
    }

    public Book(Integer id, String sn, String bookname, Double price) {
        this.id = id;
        this.sn = sn;
        this.bookname = bookname;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
