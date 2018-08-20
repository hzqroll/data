package com.roll.data.open;

/**
 * @author haozq
 * Date: 2018/8/20 下午4:13
 */
public class WebShenJianShou {
	/**
	 * 爬取链接
	 */
	private String url;
	/**
	 * timestamp	当前时间	秒级时间戳
	 */
	private long timestamp;
	/**
	 * sign2	url+user_secret+timestamp的md5值	用来校验数据是否合法
	 */
	private String sign2;
	/**
	 * data	爬取或者监控到的数据	JSON字符串
	 */
	private String data;
	/**
	 * event_type	事件类型新增数据 data.new变动数据 data.updated
	 */
	private String eventType;
	/**
	 * crawl_time	爬取到这条数据的时间	秒级时间戳
	 */
	private long crawlTime;
	/**
	 * data_key	这条数据的唯一标识, 值是爬虫id+这条数据的id(爬虫爬取结果中一条数据的唯一标识)	Webhook调用成功需要返回此值
	 */
	private String dataKey;
	/**
	 * pk	数据版本的唯一标识
	 */
	private String pk;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getSign2() {
		return sign2;
	}

	public void setSign2(String sign2) {
		this.sign2 = sign2;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public long getCrawlTime() {
		return crawlTime;
	}

	public void setCrawlTime(long crawlTime) {
		this.crawlTime = crawlTime;
	}

	public String getDataKey() {
		return dataKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "WebShenJianShou{" +
				"url='" + url + '\'' +
				", timestamp=" + timestamp +
				", sign2='" + sign2 + '\'' +
				", data='" + data + '\'' +
				", eventType='" + eventType + '\'' +
				", crawlTime=" + crawlTime +
				", dataKey='" + dataKey + '\'' +
				", pk='" + pk + '\'' +
				'}';
	}

	public WebShenJianShou(String url, long timestamp, String sign2, String data, String eventType, long crawlTime, String dataKey, String pk) {
		this.url = url;
		this.timestamp = timestamp;
		this.sign2 = sign2;
		this.data = data;
		this.eventType = eventType;
		this.crawlTime = crawlTime;
		this.dataKey = dataKey;
		this.pk = pk;
	}
}
