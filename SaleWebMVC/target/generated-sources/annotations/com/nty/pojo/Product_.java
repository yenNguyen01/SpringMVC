package com.nty.pojo;

import com.nty.pojo.Category;
import com.nty.pojo.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-03-07T21:47:27")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, Date> createdDate;
    public static volatile SingularAttribute<Product, Long> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Boolean> active;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, Category> categoryId;
    public static volatile SetAttribute<Product, OrderDetail> orderDetailSet;
    public static volatile SingularAttribute<Product, String> manufacturer;

}