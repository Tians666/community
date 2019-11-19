package life.majiang.community.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.JoinColumnOrFormula;
import sun.security.util.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "t_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "图书名称不能为空!")
    @Column(length = 30)
    private String name;

    @NotNull(message = "单价不为空!")
    @Column(precision = 10,scale = 2)
    private BigDecimal danjia;      //BigDecimal浮点类型 用来定义单价

    @NotEmpty(message = "作者不能为空!")
    @Column(length = 30)
    private String author;

    @NotEmpty(message = "出版社不能为空!")
    @Column(length =10)
    private String press;

    @NotNull(message = "图书编号不能为空!")
    @Column(length = 30)
    private String bianhao;

    @NotNull(message = "排序号不为空!")
    @Column(length = 30)
    private Integer orderNo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

    @Column(length = 200)
    private String imageUrl;

    @NotNull(message ="图书数量不能为空")
    @Column(length = 200)
    private Integer num;

    @ManyToOne
    @JoinColumn(name = "bookTypeId")
    private BookType bookType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDanjia() {
        return danjia;
    }

    public void setDanjia(BigDecimal danjia) {
        this.danjia = danjia;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @JsonSerialize(using = CustomDateTimeSerializer.class)
    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}
