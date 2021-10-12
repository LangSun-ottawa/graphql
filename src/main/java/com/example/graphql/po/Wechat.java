package com.example.graphql.po;

import lombok.Data;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "wechats")
@Data
public class Wechat implements Serializable {

	@Transient
	private static final long serialVersionUID = -6969875365330142016L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;

	/**
	 * 名称
	 */
	protected String name;
	protected String nameCn;

	protected Integer companyId;

	protected String companyName;

	protected Float gst;

	protected String gstDesc;

	protected Float pst;

	protected String pstDesc;

	protected String timeZone;

	protected Float longitude1;

	protected Float longitude2;

	protected Float latitude1;

	protected Float latitude2;
	
	protected Integer status;
	
	protected Integer timeZoneNum;
}
