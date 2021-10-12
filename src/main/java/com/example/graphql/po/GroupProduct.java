package com.example.graphql.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "groupProducts")
@Data
public class GroupProduct implements Serializable {

	@Transient
	private static final long serialVersionUID = -1249350685465792645L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	protected Integer wechatId;

	protected Long merchantId;

	protected String merchantName;

	protected Integer merchantRegionId;

	protected Integer productType;

	protected String name;

	protected String description;

	protected Integer stock;
	
	protected Integer sold;
	
	//卖出价
	protected Float price;

	//结算价
	protected Float purchasePrice;
	
	//划线价/原价
	protected Float dashPrice;
	
	protected Float floorPrice;

	protected String groupPrices;


	protected Float gst;
	
	protected Float pst;


	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected String validFrom;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected String validTo;

	protected Integer latestPayHoursBefore;

	protected Boolean autoRefund;

	protected Integer onSale;

	protected Integer sort;
	protected Integer sortManual;
	protected Integer sortAuto;
	
	@Column(name = "is_appoint")
	protected Boolean needAppoint;

	protected Boolean chargeInform;

	protected String usageTime;
	protected String dishes;
	protected String imageUrl;


	protected Integer limited;

	protected Integer dailyLimit;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected Date createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected Date updatedAt;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected Date deletedAt;

	protected Boolean isTop;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected Date isTopFrom;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected Date isTopTo;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected String onSaleFrom;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Vancouver")
	protected String onSaleTo;
	
	protected String internalTags;
	
	protected String tags;
	
	protected String imageTags;
	
	//protected String imageTagName;

	protected Integer priceIndex;
	
	protected Integer staffId;
	
	protected String staffName;
	
	protected String creator;

}
