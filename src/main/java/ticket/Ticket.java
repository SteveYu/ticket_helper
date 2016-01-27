package ticket;

///////////////////////// Json format example/////////////////////////////
//{
//"train_no": "55000Z438100",
//"station_train_code": "Z4381",
//"start_station_telecode": "SNH",
//"start_station_name": "上海南",
//"end_station_telecode": "NCG",
//"end_station_name": "南昌",
//"from_station_telecode": "SNH",
//"from_station_name": "上海南",
//"to_station_telecode": "NCG",
//"to_station_name": "南昌",
//"start_time": "22:35",
//"arrive_time": "06:42",
//"day_difference": "1",
//"train_class_name": "",
//"lishi": "08:07",
//"canWebBuy": "N",
//"lishiValue": "487",
//"yp_info": "1010503000402850000010105000003018400000",
//"control_train_day": "20300303",
//"start_train_date": "20160201",
//"seat_feature": "W3431333",
//"yp_ex": "10401030",
//"train_seat_feature": "3",
//"seat_types": "1413",
//"location_code": "H2",
//"from_station_no": "01",
//"to_station_no": "09",
//"control_day": 59,
//"sale_time": "1530",
//"is_support_card": "0",
//"note": "",
//"controlled_train_flag": "0",
//"controlled_train_message": "正常车次，不受控",
//"gg_num": "--",
//"gr_num": "--",
//"qt_num": "--",
//"rw_num": "无",
//"rz_num": "--",
//"tz_num": "--",
//"wz_num": "无",
//"yb_num": "--",
//"yw_num": "无",
//"yz_num": "无",
//"ze_num": "--",
//"zy_num": "--",
//"swz_num": "--"
//}

public class Ticket {
	private String train_no;
	private String station_train_code;
	private String start_station_telecode;
	private String start_station_name;
	private String end_station_telecode;
	private String end_station_name;
	private String start_time;
	private String arrive_time;
	private String canWebBuy;
	private String gg_num;
	private String gr_num;
	private String qt_num;
	private String rw_num;	// 软卧
	private String rz_num;
	private String tz_num;
	private String wz_num;	// 无座
	private String yb_num;
	private String yw_num;	// 硬卧
	private String yz_num;	// 硬座
	private String ze_num;	// 二等座
	private String zy_num;	// 一等座
	private String swz_num; // 商务座
	
	public String getTrain_no() {
		return train_no;
	}

	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}

	public String getStation_train_code() {
		return station_train_code;
	}

	public void setStation_train_code(String station_train_code) {
		this.station_train_code = station_train_code;
	}

	public String getStart_station_telecode() {
		return start_station_telecode;
	}

	public void setStart_station_telecode(String start_station_telecode) {
		this.start_station_telecode = start_station_telecode;
	}

	public String getStart_station_name() {
		return start_station_name;
	}

	public void setStart_station_name(String start_station_name) {
		this.start_station_name = start_station_name;
	}

	public String getEnd_station_telecode() {
		return end_station_telecode;
	}

	public void setEnd_station_telecode(String end_station_telecode) {
		this.end_station_telecode = end_station_telecode;
	}

	public String getEnd_station_name() {
		return end_station_name;
	}

	public void setEnd_station_name(String end_station_name) {
		this.end_station_name = end_station_name;
	}
	
	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getArrive_time() {
		return arrive_time;
	}

	public void setArrive_time(String arrive_time) {
		this.arrive_time = arrive_time;
	}

	public String getCanWebBuy() {
		return canWebBuy;
	}

	public void setCanWebBuy(String canWebBuy) {
		this.canWebBuy = canWebBuy;
	}

	public String getGg_num() {
		return gg_num;
	}

	public void setGg_num(String gg_num) {
		this.gg_num = gg_num;
	}

	public String getGr_num() {
		return gr_num;
	}

	public void setGr_num(String gr_num) {
		this.gr_num = gr_num;
	}

	public String getQt_num() {
		return qt_num;
	}

	public void setQt_num(String qt_num) {
		this.qt_num = qt_num;
	}

	public String getRw_num() {
		return rw_num;
	}

	public void setRw_num(String rw_num) {
		this.rw_num = rw_num;
	}

	public String getRz_num() {
		return rz_num;
	}

	public void setRz_num(String rz_num) {
		this.rz_num = rz_num;
	}

	public String getTz_num() {
		return tz_num;
	}

	public void setTz_num(String tz_num) {
		this.tz_num = tz_num;
	}

	public String getWz_num() {
		return wz_num;
	}

	public void setWz_num(String wz_num) {
		this.wz_num = wz_num;
	}

	public String getYb_num() {
		return yb_num;
	}

	public void setYb_num(String yb_num) {
		this.yb_num = yb_num;
	}

	public String getYw_num() {
		return yw_num;
	}

	public void setYw_num(String yw_num) {
		this.yw_num = yw_num;
	}

	public String getYz_num() {
		return yz_num;
	}

	public void setYz_num(String yz_num) {
		this.yz_num = yz_num;
	}

	public String getZe_num() {
		return ze_num;
	}

	public void setZe_num(String ze_num) {
		this.ze_num = ze_num;
	}

	public String getZy_num() {
		return zy_num;
	}

	public void setZy_num(String zy_num) {
		this.zy_num = zy_num;
	}

	public String getSwz_num() {
		return swz_num;
	}

	public void setSwz_num(String swz_num) {
		this.swz_num = swz_num;
	}

	public boolean canBuy() {
		return this.canWebBuy.equalsIgnoreCase("Y");
	}
	
	@Override
	public String toString() {
		return station_train_code + "\t" +
				start_station_name + "-" + end_station_name + "\t\t" +
				start_time + "-" + arrive_time + "\t\t" +
				swz_num + "\t" + 
				zy_num + "\t" +
				ze_num + "\t" +
				rw_num + "\t" +
				yw_num + "\t" +
				yz_num + "\t" +
				wz_num + "\t";
	}
}
