package com.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity(name ="db_book")
public class Book {
    @Id @GeneratedValue(generator = "aa")
    @GenericGenerator(name = "aa", strategy = "increment")
    private int id;

    @Type(type = "string")
    @Column(length =30, nullable = false, name = "bname",unique = true)
    private String name;

    @Type(type="big_decimal")
    @Column(precision = 6,scale = 2)
    private BigDecimal price;
    private Date zbirthday;
}
