package com.cameraservice.dao.entity;
public class DevicedirectoryEty {
	private Integer id;	//序号ID
	private String gatewayid;	//网关ID
	private String parentid;	//父设备/区域/系统ID（可必选)
	private String deviceid;	//设备ID--设备/区域/系统编码（必选）
	private String devicename;	//设备名称--设备/区域/系统名称
	private String firmsname;	//厂商名称
	private String devicetype;	//设备型号
	private String ownerto;	//设备归属
	private String civilcode;	//行政区域
	private String address;	//安装地址
	private String registertype;	//注册方式 缺省为1   1： 符合sip3261标准的认证注册模式；2： 基于口令的双向认证注册模式；3： 基于数字证书的双向认证注册模式 
	private String secrecy;	//保密属性
	private String username;	//用户名
	private String deviceip;	//设备ip--设备/区域/系统IP地址（可选）
	private String deviceport;	//设备端口--设备/区域/系统端口（可选）
	private String userpwd;	//用户密码
	private String longitude;	//经度
	private String latitude;	//纬度
	private String mediaformat;	//媒体格式
	private Integer devstorage;	//接入库名称ID
	private Integer nodetype;	//节点类型
	private String block;	//警区（可选）
	private String parental;	//当为设备时，是否有子设备（必选）1有，0没有
	private String safetyway;	//信令安全模式（可选）缺省为0； 0：不采用；2：S/MIME签名方式；3：S/MIME加密签名同时采用方式；4：数字摘要方式
	private String certnum;	//证书序列号
	private String certifiable;	//证书有效标识（有证书的设备必选）缺省为0；证书有效标识： 0：无效 1：有效
	private String errcode;	//无效原因码
	private String endtime;	//证书终止有效期
	private String devstatus;	//设备状态
	private String ptz;	//摄像机类型扩展，标识摄像机类型：1-球机；2-半球；3-固定枪机；4-遥控枪机。当目录项为摄像机时可选。
	private String position;	//摄像机位置类型扩展。1-省际检查站、2-党政机关、3-车站码头、4-中心广场、5-体育场馆、6-商业中心、7-宗教场所、8-校园周边、9-治安复杂区域、10-交通干线。当目录项为摄像机时可选
	private String room;	//摄像机安装位置室外、室内属性。1-室外、2-室内。当目录项为摄像机时可选，缺省为1
	private String application;	//摄像机用途属性。1-治安、2-交通、3-重点。当目录项为摄像机时可选
	private String supplylight;	//摄像机补光属性。1-无补光、2-红外补光、3-白光补光。当目录项为摄像机时可选，缺省为1
	private String direction;	//摄像机监视方位属性。1-东、2-西、3-南、4-北、5-东南、6-东北、7-西南、8-西北。当目录项为摄像机时且为固定摄像机或设置看守位摄像机时可选
	private String resolution;	//摄像机支持的分辨率，可有多个分辨率值，各个取值见以“/”分隔。分辨率取值参见国标附录F中SDP f字段规定。当目录项为摄像机时可选
	private String businessgroup;	//虚拟组织所属的业务分组ID，业务分组根据特定的业务需求制定，一个业务分组包含一组特定的虚拟组织
	private String channel;	//PVG对应的AV通道(PVG通道专用)
	private Integer islogin;	//是否需要登录
	private Integer lowplatdevsn;	//接入下级平台的平台、区域及设备的id
	private Integer share;	//该设备是否共享
	private Integer online;	//设备在线状态： 0 在线 ， 1 不在线
	private Integer state;	//当前列的状态
	/**
	* 得到 序号ID
	* @return Integer
	*/
	public Integer getId() {
		return this.id;
	}
	/**
	 * 设置 序号ID
	 * @param id,  : Integer
	*/
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	* 得到 网关ID
	* @return String
	*/
	public String getGatewayid() {
		return this.gatewayid;
	}
	/**
	 * 设置 网关ID
	 * @param gatewayid,  : String
	*/
	public void setGatewayid(String gatewayid) {
		this.gatewayid = gatewayid;
	}

	/**
	* 得到 父设备/区域/系统ID（可必选)
	* @return String
	*/
	public String getParentid() {
		return this.parentid;
	}
	/**
	 * 设置 父设备/区域/系统ID（可必选)
	 * @param parentid,  : String
	*/
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	/**
	* 得到 设备ID--设备/区域/系统编码（必选）
	* @return String
	*/
	public String getDeviceid() {
		return this.deviceid;
	}
	/**
	 * 设置 设备ID--设备/区域/系统编码（必选）
	 * @param deviceid,  : String
	*/
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	/**
	* 得到 设备名称--设备/区域/系统名称
	* @return String
	*/
	public String getDevicename() {
		return this.devicename;
	}
	/**
	 * 设置 设备名称--设备/区域/系统名称
	 * @param devicename,  : String
	*/
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	/**
	* 得到 厂商名称
	* @return String
	*/
	public String getFirmsname() {
		return this.firmsname;
	}
	/**
	 * 设置 厂商名称
	 * @param firmsname,  : String
	*/
	public void setFirmsname(String firmsname) {
		this.firmsname = firmsname;
	}

	/**
	* 得到 设备型号
	* @return String
	*/
	public String getDevicetype() {
		return this.devicetype;
	}
	/**
	 * 设置 设备型号
	 * @param devicetype,  : String
	*/
	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	/**
	* 得到 设备归属
	* @return String
	*/
	public String getOwnerto() {
		return this.ownerto;
	}
	/**
	 * 设置 设备归属
	 * @param ownerto,  : String
	*/
	public void setOwnerto(String ownerto) {
		this.ownerto = ownerto;
	}

	/**
	* 得到 行政区域
	* @return String
	*/
	public String getCivilcode() {
		return this.civilcode;
	}
	/**
	 * 设置 行政区域
	 * @param civilcode,  : String
	*/
	public void setCivilcode(String civilcode) {
		this.civilcode = civilcode;
	}

	/**
	* 得到 安装地址
	* @return String
	*/
	public String getAddress() {
		return this.address;
	}
	/**
	 * 设置 安装地址
	 * @param address,  : String
	*/
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	* 得到 注册方式 缺省为1   1： 符合sip3261标准的认证注册模式；2： 基于口令的双向认证注册模式；3： 基于数字证书的双向认证注册模式 
	* @return String
	*/
	public String getRegistertype() {
		return this.registertype;
	}
	/**
	 * 设置 注册方式 缺省为1   1： 符合sip3261标准的认证注册模式；2： 基于口令的双向认证注册模式；3： 基于数字证书的双向认证注册模式 
	 * @param registertype,  : String
	*/
	public void setRegistertype(String registertype) {
		this.registertype = registertype;
	}

	/**
	* 得到 保密属性
	* @return String
	*/
	public String getSecrecy() {
		return this.secrecy;
	}
	/**
	 * 设置 保密属性
	 * @param secrecy,  : String
	*/
	public void setSecrecy(String secrecy) {
		this.secrecy = secrecy;
	}

	/**
	* 得到 用户名
	* @return String
	*/
	public String getUsername() {
		return this.username;
	}
	/**
	 * 设置 用户名
	 * @param username,  : String
	*/
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	* 得到 设备ip--设备/区域/系统IP地址（可选）
	* @return String
	*/
	public String getDeviceip() {
		return this.deviceip;
	}
	/**
	 * 设置 设备ip--设备/区域/系统IP地址（可选）
	 * @param deviceip,  : String
	*/
	public void setDeviceip(String deviceip) {
		this.deviceip = deviceip;
	}

	/**
	* 得到 设备端口--设备/区域/系统端口（可选）
	* @return String
	*/
	public String getDeviceport() {
		return this.deviceport;
	}
	/**
	 * 设置 设备端口--设备/区域/系统端口（可选）
	 * @param deviceport,  : String
	*/
	public void setDeviceport(String deviceport) {
		this.deviceport = deviceport;
	}

	/**
	* 得到 用户密码
	* @return String
	*/
	public String getUserpwd() {
		return this.userpwd;
	}
	/**
	 * 设置 用户密码
	 * @param userpwd,  : String
	*/
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	/**
	* 得到 经度
	* @return String
	*/
	public String getLongitude() {
		return this.longitude;
	}
	/**
	 * 设置 经度
	 * @param longitude,  : String
	*/
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	* 得到 纬度
	* @return String
	*/
	public String getLatitude() {
		return this.latitude;
	}
	/**
	 * 设置 纬度
	 * @param latitude,  : String
	*/
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	* 得到 媒体格式
	* @return String
	*/
	public String getMediaformat() {
		return this.mediaformat;
	}
	/**
	 * 设置 媒体格式
	 * @param mediaformat,  : String
	*/
	public void setMediaformat(String mediaformat) {
		this.mediaformat = mediaformat;
	}

	/**
	* 得到 接入库名称ID
	* @return Integer
	*/
	public Integer getDevstorage() {
		return this.devstorage;
	}
	/**
	 * 设置 接入库名称ID
	 * @param devstorage,  : Integer
	*/
	public void setDevstorage(Integer devstorage) {
		this.devstorage = devstorage;
	}

	/**
	* 得到 节点类型
	* @return Integer
	*/
	public Integer getNodetype() {
		return this.nodetype;
	}
	/**
	 * 设置 节点类型
	 * @param nodetype,  : Integer
	*/
	public void setNodetype(Integer nodetype) {
		this.nodetype = nodetype;
	}

	/**
	* 得到 警区（可选）
	* @return String
	*/
	public String getBlock() {
		return this.block;
	}
	/**
	 * 设置 警区（可选）
	 * @param block,  : String
	*/
	public void setBlock(String block) {
		this.block = block;
	}

	/**
	* 得到 当为设备时，是否有子设备（必选）1有，0没有
	* @return String
	*/
	public String getParental() {
		return this.parental;
	}
	/**
	 * 设置 当为设备时，是否有子设备（必选）1有，0没有
	 * @param parental,  : String
	*/
	public void setParental(String parental) {
		this.parental = parental;
	}

	/**
	* 得到 信令安全模式（可选）缺省为0； 0：不采用；2：S/MIME签名方式；3：S/MIME加密签名同时采用方式；4：数字摘要方式
	* @return String
	*/
	public String getSafetyway() {
		return this.safetyway;
	}
	/**
	 * 设置 信令安全模式（可选）缺省为0； 0：不采用；2：S/MIME签名方式；3：S/MIME加密签名同时采用方式；4：数字摘要方式
	 * @param safetyway,  : String
	*/
	public void setSafetyway(String safetyway) {
		this.safetyway = safetyway;
	}

	/**
	* 得到 证书序列号
	* @return String
	*/
	public String getCertnum() {
		return this.certnum;
	}
	/**
	 * 设置 证书序列号
	 * @param certnum,  : String
	*/
	public void setCertnum(String certnum) {
		this.certnum = certnum;
	}

	/**
	* 得到 证书有效标识（有证书的设备必选）缺省为0；证书有效标识： 0：无效 1：有效
	* @return String
	*/
	public String getCertifiable() {
		return this.certifiable;
	}
	/**
	 * 设置 证书有效标识（有证书的设备必选）缺省为0；证书有效标识： 0：无效 1：有效
	 * @param certifiable,  : String
	*/
	public void setCertifiable(String certifiable) {
		this.certifiable = certifiable;
	}

	/**
	* 得到 无效原因码
	* @return String
	*/
	public String getErrcode() {
		return this.errcode;
	}
	/**
	 * 设置 无效原因码
	 * @param errcode,  : String
	*/
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	/**
	* 得到 证书终止有效期
	* @return String
	*/
	public String getEndtime() {
		return this.endtime;
	}
	/**
	 * 设置 证书终止有效期
	 * @param endtime,  : String
	*/
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	/**
	* 得到 设备状态
	* @return String
	*/
	public String getDevstatus() {
		return this.devstatus;
	}
	/**
	 * 设置 设备状态
	 * @param devstatus,  : String
	*/
	public void setDevstatus(String devstatus) {
		this.devstatus = devstatus;
	}

	/**
	* 得到 摄像机类型扩展，标识摄像机类型：1-球机；2-半球；3-固定枪机；4-遥控枪机。当目录项为摄像机时可选。
	* @return String
	*/
	public String getPtz() {
		return this.ptz;
	}
	/**
	 * 设置 摄像机类型扩展，标识摄像机类型：1-球机；2-半球；3-固定枪机；4-遥控枪机。当目录项为摄像机时可选。
	 * @param ptz,  : String
	*/
	public void setPtz(String ptz) {
		this.ptz = ptz;
	}

	/**
	* 得到 摄像机位置类型扩展。1-省际检查站、2-党政机关、3-车站码头、4-中心广场、5-体育场馆、6-商业中心、7-宗教场所、8-校园周边、9-治安复杂区域、10-交通干线。当目录项为摄像机时可选
	* @return String
	*/
	public String getPosition() {
		return this.position;
	}
	/**
	 * 设置 摄像机位置类型扩展。1-省际检查站、2-党政机关、3-车站码头、4-中心广场、5-体育场馆、6-商业中心、7-宗教场所、8-校园周边、9-治安复杂区域、10-交通干线。当目录项为摄像机时可选
	 * @param position,  : String
	*/
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	* 得到 摄像机安装位置室外、室内属性。1-室外、2-室内。当目录项为摄像机时可选，缺省为1
	* @return String
	*/
	public String getRoom() {
		return this.room;
	}
	/**
	 * 设置 摄像机安装位置室外、室内属性。1-室外、2-室内。当目录项为摄像机时可选，缺省为1
	 * @param room,  : String
	*/
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	* 得到 摄像机用途属性。1-治安、2-交通、3-重点。当目录项为摄像机时可选
	* @return String
	*/
	public String getApplication() {
		return this.application;
	}
	/**
	 * 设置 摄像机用途属性。1-治安、2-交通、3-重点。当目录项为摄像机时可选
	 * @param application,  : String
	*/
	public void setApplication(String application) {
		this.application = application;
	}

	/**
	* 得到 摄像机补光属性。1-无补光、2-红外补光、3-白光补光。当目录项为摄像机时可选，缺省为1
	* @return String
	*/
	public String getSupplylight() {
		return this.supplylight;
	}
	/**
	 * 设置 摄像机补光属性。1-无补光、2-红外补光、3-白光补光。当目录项为摄像机时可选，缺省为1
	 * @param supplylight,  : String
	*/
	public void setSupplylight(String supplylight) {
		this.supplylight = supplylight;
	}

	/**
	* 得到 摄像机监视方位属性。1-东、2-西、3-南、4-北、5-东南、6-东北、7-西南、8-西北。当目录项为摄像机时且为固定摄像机或设置看守位摄像机时可选
	* @return String
	*/
	public String getDirection() {
		return this.direction;
	}
	/**
	 * 设置 摄像机监视方位属性。1-东、2-西、3-南、4-北、5-东南、6-东北、7-西南、8-西北。当目录项为摄像机时且为固定摄像机或设置看守位摄像机时可选
	 * @param direction,  : String
	*/
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	* 得到 摄像机支持的分辨率，可有多个分辨率值，各个取值见以“/”分隔。分辨率取值参见国标附录F中SDP f字段规定。当目录项为摄像机时可选
	* @return String
	*/
	public String getResolution() {
		return this.resolution;
	}
	/**
	 * 设置 摄像机支持的分辨率，可有多个分辨率值，各个取值见以“/”分隔。分辨率取值参见国标附录F中SDP f字段规定。当目录项为摄像机时可选
	 * @param resolution,  : String
	*/
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**
	* 得到 虚拟组织所属的业务分组ID，业务分组根据特定的业务需求制定，一个业务分组包含一组特定的虚拟组织
	* @return String
	*/
	public String getBusinessgroup() {
		return this.businessgroup;
	}
	/**
	 * 设置 虚拟组织所属的业务分组ID，业务分组根据特定的业务需求制定，一个业务分组包含一组特定的虚拟组织
	 * @param businessgroup,  : String
	*/
	public void setBusinessgroup(String businessgroup) {
		this.businessgroup = businessgroup;
	}

	/**
	* 得到 PVG对应的AV通道(PVG通道专用)
	* @return String
	*/
	public String getChannel() {
		return this.channel;
	}
	/**
	 * 设置 PVG对应的AV通道(PVG通道专用)
	 * @param channel,  : String
	*/
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	* 得到 是否需要登录
	* @return Integer
	*/
	public Integer getIslogin() {
		return this.islogin;
	}
	/**
	 * 设置 是否需要登录
	 * @param islogin,  : Integer
	*/
	public void setIslogin(Integer islogin) {
		this.islogin = islogin;
	}

	/**
	* 得到 接入下级平台的平台、区域及设备的id
	* @return Integer
	*/
	public Integer getLowplatdevsn() {
		return this.lowplatdevsn;
	}
	/**
	 * 设置 接入下级平台的平台、区域及设备的id
	 * @param lowplatdevsn,  : Integer
	*/
	public void setLowplatdevsn(Integer lowplatdevsn) {
		this.lowplatdevsn = lowplatdevsn;
	}

	/**
	* 得到 该设备是否共享
	* @return Integer
	*/
	public Integer getShare() {
		return this.share;
	}
	/**
	 * 设置 该设备是否共享
	 * @param share,  : Integer
	*/
	public void setShare(Integer share) {
		this.share = share;
	}

	/**
	* 得到 设备在线状态： 0 在线 ， 1 不在线
	* @return Integer
	*/
	public Integer getOnline() {
		return this.online;
	}
	/**
	 * 设置 设备在线状态： 0 在线 ， 1 不在线
	 * @param online,  : Integer
	*/
	public void setOnline(Integer online) {
		this.online = online;
	}

	/**
	* 得到 当前列的状态
	* @return Integer
	*/
	public Integer getState() {
		return this.state;
	}
	/**
	 * 设置 当前列的状态
	 * @param state,  : Integer
	*/
	public void setState(Integer state) {
		this.state = state;
	}

}