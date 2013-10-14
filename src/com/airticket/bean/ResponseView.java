package com.airticket.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.airticket.listener.loaderdata.AirlineInfoEntity;
import com.airticket.listener.loaderdata.AirportInfoEntity;
import com.airticket.listener.loaderdata.CityDetail;
import com.airticket.listener.loaderdata.CraftInfoEntity;

/**
 * ����ҳ������
 * @author Administrator
 *
 */
public class ResponseView implements Serializable{
	
	//���չ�˾��Ϣ
	private AirlineInfoEntity airlineInfo;
	
	//����������Ϣ
	private AirportInfoEntity depAirportInfo;
	//�ﵽ������Ϣ
	private AirportInfoEntity arrAirportInfo;
	
	//����������Ϣ
	private CityDetail depCityDetail;
	//�ﵽ������Ϣ
	private CityDetail arrCityDetail;
	
	//�ɻ���Ϣ
	private CraftInfoEntity craftInfo;
	
	
	
	//���������ĺ�������
	private Integer recordCount;
	//��ͼ�(�����Ƿ�Ϊ��ͼ� �� ����Ʊ�� ȡֵ)
	private BigDecimal lowerPrice;
	//Ʊ��
	private BigDecimal price;
	// ���ʱ�䣺yyyy-MM-ddThh:mm:ss
	private Date takeOffTime;
	// �ִ�ʱ�䣺yyyy-MM-ddThh:mm:ss
	private Date arriveTime;
	//����ʱ��
	private Double flyTime;
	// �����
	private String flightNo;
	// ����
	private String carftType;
	// ���չ�˾����
	private String airLineCode;
	// ��������������
	private String departCityCode;
	// �������������
	private String arriveCityCode;
	//��ʳ����
	private String mealType;
	//�����������ƣ� ����������վ¥ID ��ѯ��
	private String depaerAPortName;
	//����������ƣ����������վ¥ID ��ѯ��
	private String arriveAPortName;
	// �������
	private String rate;
	// ��λ�ȼ�����Ӧ�����ѯ�����FlightClass �ֶ�
	private String flightClass;
	
	// ��λ�ȼ���������
	private String flightClassName;
	
	// ʣ��Ʊ��Int32 ���ġ�Ӣ�� ����ʾȡ��������Header ��Culture ֵ
	private Integer quantity;
	
	// ��׼��
	private BigDecimal standardPrice;
	// ��ͯ��׼��
	private BigDecimal childStandardPrice;
	// Ӥ����׼��
	private BigDecimal babyStandardPrice;
	
	/**
	 * ��ȡ���������ĺ�������
	 * @return
	 */
	public Integer getRecordCount() {
		return recordCount;
	}
	/**
	 * ���÷��������ĺ�������
	 * @param recordCount
	 */
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	/**
	 * ��ͼ�(�����Ƿ�Ϊ��ͼ� �� ����Ʊ�� ȡֵ)
	 * @return
	 */
	public BigDecimal getLowerPrice() {
		return lowerPrice;
	}
	/**
	 * ��ͼ�(�����Ƿ�Ϊ��ͼ� �� ����Ʊ�� ȡֵ)
	 * @param lowerPrice
	 */
	public void setLowerPrice(BigDecimal lowerPrice) {
		this.lowerPrice = lowerPrice;
	}
	/**
	 * Ʊ��
	 * @return
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * Ʊ��
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * ���ʱ�䣺yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public Date getTakeOffTime() {
		return takeOffTime;
	}
	/**
	 * ���ʱ�䣺yyyy-MM-ddThh:mm:ss
	 * @param takeOffTime
	 */
	public void setTakeOffTime(Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	/**
	 * �ִ�ʱ�䣺yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public Date getArriveTime() {
		return arriveTime;
	}
	/**
	 *  �ִ�ʱ�䣺yyyy-MM-ddThh:mm:ss
	 * @param arriveTime
	 */
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	/**
	 *  ���÷���ʱ��
	 * @return
	 */
	public Double getFlyTime() {
		return flyTime;
	}
	/**
	 * ���÷���ʱ��
	 * @param flyTime ����ʱ��
	 */
	public void setFlyTime(Double flyTime) {
		this.flyTime = flyTime;
	}
	/**
	 * �����
	 * @return
	 */
	public String getFlightNo() {
		return flightNo;
	}
	/**
	 *  �����
	 * @param flightNo
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	
	/**
	 * ����
	 * @return
	 */
	public String getCarftType() {
		return carftType;
	}
	/**
	 *  ����
	 * @param carftType
	 */
	public void setCarftType(String carftType) {
		this.carftType = carftType;
	}
	/**
	 *  ���չ�˾����
	 * @return
	 */
	public String getAirLineCode() {
		return airLineCode;
	}
	/**
	 * ���չ�˾����
	 * @param airLineCode
	 */
	public void setAirLineCode(String airLineCode) {
		this.airLineCode = airLineCode;
	}
	
	/**
	 * ��������������
	 * @return
	 */
	public String getDepartCityCode() {
		return departCityCode;
	}
	/**
	 * ��������������
	 * @param departCityCode
	 */
	public void setDepartCityCode(String departCityCode) {
		this.departCityCode = departCityCode;
	}
	/**
	 * �������������
	 * @return
	 */
	public String getArriveCityCode() {
		return arriveCityCode;
	}
	/**
	 * �������������
	 * @param arriveCityCode
	 */
	public void setArriveCityCode(String arriveCityCode) {
		this.arriveCityCode = arriveCityCode;
	}
	/**
	 * ��ʳ����
	 * @return
	 */
	public String getMealType() {
		return mealType;
	}
	/**
	 * ��ʳ����
	 * @param mealType
	 */
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	
	/**
	 * �����������ƣ� ����������վ¥ID ��ѯ��
	 * @return
	 */
	public String getDepaerAPortName() {
		return depaerAPortName;
	}
	/**
	 * �����������ƣ� ����������վ¥ID ��ѯ��
	 * @param depaerAPortName
	 */
	public void setDepaerAPortName(String depaerAPortName) {
		this.depaerAPortName = depaerAPortName;
	}
	/**
	 * ����������ƣ����������վ¥ID ��ѯ��
	 * @return
	 */
	public String getArriveAPortName() {
		return arriveAPortName;
	}
	/**
	 * ����������ƣ����������վ¥ID ��ѯ��
	 * @param arriveAPortName
	 */
	public void setArriveAPortName(String arriveAPortName) {
		this.arriveAPortName = arriveAPortName;
	}
	/**
	 * �������
	 * @return
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * �������
	 * @param rate
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * ��λ�ȼ�����Ӧ�����ѯ�����FlightClass �ֶ�
	 * @return
	 */
	public String getFlightClass() {
		return flightClass;
	}
	
	/**
	 * ��λ�ȼ�����Ӧ�����ѯ�����FlightClass �ֶ�
	 * @param flightClass
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	/**
	 * ʣ��Ʊ��Int32 ���ġ�Ӣ�� ����ʾȡ��������Header ��Culture ֵ
	 * @return
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * ʣ��Ʊ��Int32 ���ġ�Ӣ�� ����ʾȡ��������Header ��Culture ֵ
	 * @param quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * ���չ�˾��Ϣ
	 * @return
	 */
	public AirlineInfoEntity getAirlineInfo() {
		return airlineInfo;
	}
	/**
	 * ���չ�˾��Ϣ
	 * @return
	 */
	public void setAirlineInfo(AirlineInfoEntity airlineInfo) {
		this.airlineInfo = airlineInfo;
	}
	/**
	 * �ɻ���Ϣ
	 * @return
	 */
	public CraftInfoEntity getCraftInfo() {
		return craftInfo;
	}
	/**
	 * �ɻ���Ϣ
	 * @return
	 */
	public void setCraftInfo(CraftInfoEntity craftInfo) {
		this.craftInfo = craftInfo;
	}
	/**
	 * ����������Ϣ
	 * @return
	 */
	public AirportInfoEntity getDepAirportInfo() {
		return depAirportInfo;
	}
	/**
	 * ����������Ϣ
	 * @return
	 */
	public void setDepAirportInfo(AirportInfoEntity depAirportInfo) {
		this.depAirportInfo = depAirportInfo;
	}
	/**
	 * �ﵽ������Ϣ
	 * @return
	 */
	public AirportInfoEntity getArrAirportInfo() {
		return arrAirportInfo;
	}
	/**
	 * �ﵽ������Ϣ
	 * @return
	 */
	public void setArrAirportInfo(AirportInfoEntity arrAirportInfo) {
		this.arrAirportInfo = arrAirportInfo;
	}
	/**
	 * ����������Ϣ
	 * @return
	 */
	public CityDetail getDepCityDetail() {
		return depCityDetail;
	}
	/**
	 * ����������Ϣ
	 * @param depCityDetail
	 */
	public void setDepCityDetail(CityDetail depCityDetail) {
		this.depCityDetail = depCityDetail;
	}
	/**
	 * �ﵽ������Ϣ
	 * @return
	 */
	public CityDetail getArrCityDetail() {
		return arrCityDetail;
	}
	/**
	 * ���������Ϣ
	 * @param arrCityDetail
	 */
	public void setArrCityDetail(CityDetail arrCityDetail) {
		this.arrCityDetail = arrCityDetail;
	}

	public String getFlightClassName() {
		return flightClassName;
	}
	public void setFlightClassName(String flightClassName) {
		this.flightClassName = flightClassName;
	}
	public BigDecimal getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(BigDecimal standardPrice) {
		this.standardPrice = standardPrice;
	}
	public BigDecimal getChildStandardPrice() {
		return childStandardPrice;
	}
	public void setChildStandardPrice(BigDecimal childStandardPrice) {
		this.childStandardPrice = childStandardPrice;
	}
	public BigDecimal getBabyStandardPrice() {
		return babyStandardPrice;
	}
	public void setBabyStandardPrice(BigDecimal babyStandardPrice) {
		this.babyStandardPrice = babyStandardPrice;
	}
	
}
