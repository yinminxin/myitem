package ymx.example.myitem.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author yinminxin
 * @description
 * @date 2019/9/19 15:00
 *     javax.persistence.Table 修改默认ORM规则，属性name设置表名；
 *     org.hibernate.annotations.Table 建表时的描述， 属性comment修改表描述；
 *     Id 主键
 *     GenericGenerator 设置主键策略，这里使用了Hibernate的UUID来生成主键；
 *     GeneratedValue 设置主键值, 属性generator关联主键策略的name；
 *     Column 修改默认ORM规则；
 *     name设置表中字段名称，表字段和实体类属性相同，则该属性可不写；
 *     unique设置该字段在表中是否唯一，默认false；
 *     nullable是否可为空，默认true；
 *     insertable表示insert操作时该字段是否响应写入，默认为true；
 *     updatable表示update操作时该字段是否响应修改，默认为true；
 *     columnDefinition是自定义字段，可以用这个属性来设置字段的注释；
 *     table表示当映射多个表时，指定表的表中的字段，默认值为主表的表名；
 *     length是长度，仅对varchar类型的字段生效,默认长度为255；
 *     precision表示一共多少位；
 *     scale表示小数部分占precision总位数的多少位，例子中两者共同使用来确保经纬度的精度；
 *
 */
@Entity
@Table(name = "basic_city")
@org.hibernate.annotations.Table(appliesTo = "basic_city",comment="城市基本信息表")
public class User {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "city_id", length = 32)
    private String cityId;

    @Column(name = "city_name_cn", columnDefinition = "VARCHAR(255) NOT NULL COMMENT '名称（中文）'")
    private String cityNameCN;

    @Column(name = "city_name_en", columnDefinition = "VARCHAR(255) NOT NULL COMMENT '名称（英文）'")
    private String cityNameEN;

    @Column(name = "longitude", precision = 10, scale = 7, columnDefinition = "bigint NOT NULL COMMENT '经度'")
    private BigDecimal longitude;

    @Column(name = "latitude", precision = 10, scale = 7, columnDefinition = "bigint NOT NULL COMMENT '纬度'")
    private BigDecimal latitude;

    @Column(name = "elevation", columnDefinition = "int(5) NOT NULL COMMENT '海拔'")
    private Integer elevation;

    @Column(name = "city_description", columnDefinition = "VARCHAR(500) NOT NULL COMMENT '城市介绍'")
    private String cityDescription;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityNameCN() {
        return cityNameCN;
    }

    public void setCityNameCN(String cityNameCN) {
        this.cityNameCN = cityNameCN;
    }

    public String getCityNameEN() {
        return cityNameEN;
    }

    public void setCityNameEN(String cityNameEN) {
        this.cityNameEN = cityNameEN;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }
}
